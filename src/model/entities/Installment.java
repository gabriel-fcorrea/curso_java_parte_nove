package model.entities;

import java.time.LocalDateTime;

public class Installment extends Contract {

	private LocalDateTime dueDate;
	private Double amount;

	public Installment() {
		super();
	}

	public Installment(LocalDateTime contractDate, Double contractValue, Integer contractParcel, LocalDateTime dueDate,
			Double amount) {
		super(contractDate, contractValue, contractParcel);
		this.dueDate = dueDate;
		this.amount = amount;
	}

}
