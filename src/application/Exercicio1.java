package application;

import model.services.ContractService;
import model.services.MercadoPagoService;

public class Exercicio1 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//		System.out.println("Entre com os dados do contrato:");
//		System.out.print("Número: ");
//		int contractNumber = sc.nextInt();
//		System.out.print("Data (dd/MM/yyyy): ");
//		LocalDateTime contractDate = LocalDateTime.parse(sc.nextLine(), fmt);
//		System.out.print("Valor do contrato: ");
//		double contractValue = sc.nextDouble();
//		System.out.print("Entre com o número de parcelas: ");
//		int contractInstallment = sc.nextInt();

//		sc.close();
		ContractService contractService = new ContractService(new MercadoPagoService());
		contractService.processContract(null, null);
	}
}
