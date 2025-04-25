package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getContractValue() / months; // parcela sem juros
		for (int i = 0; i <= months; i++) {
			LocalDate dueDate = contract.getContractDate().plusMonths(i);
			double interest = onlinePaymentService.interest(basicQuota, i); // calculo dos juros
			double fee = onlinePaymentService.paymentFee(basicQuota + interest); // resultado da parcela + juros
			double quota = basicQuota + interest + fee; // soma o fee com o juros do paypal
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}
