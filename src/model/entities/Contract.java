package model.entities;

import java.time.LocalDateTime;

public class Contract {

	private Integer contractNumber;
	private LocalDateTime contractDate;
	private Double contractValue;

	public Contract() {
	}

	public Contract(LocalDateTime contractDate, Double contractValue, Integer contractParcel) {
		this.contractDate = contractDate;
		this.contractValue = contractValue;
	}

	public Contract(Integer contractNumber, LocalDateTime contractDate, Double contractValue, Integer contractParcel) {
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.contractValue = contractValue;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public LocalDateTime getContractDate() {
		return contractDate;
	}

	public void setContractDate(LocalDateTime contractDate) {
		this.contractDate = contractDate;
	}

	public Double getContractValue() {
		return contractValue;
	}

	public void setContractValue(Double contractValue) {
		this.contractValue = contractValue;
	}

}
