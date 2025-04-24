package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int contractNumber = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();

		Contract contract = new Contract(contractNumber, contractDate, contractValue);

		System.out.print("Entre com o número de parcelas: ");
		int contractInstallment = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, contractInstallment);

		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}

		sc.close();
	}
}
