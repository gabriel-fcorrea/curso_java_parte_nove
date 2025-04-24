package model.services;

public class MercadoPagoService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		System.out.println("MercadoPago");
		return null;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		// TODO Auto-generated method stub
		return null;
	}

}
