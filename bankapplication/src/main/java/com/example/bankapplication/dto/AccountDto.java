package com.example.bankapplication.dto;

public class AccountDto {

	private Long id;
	private String aacountHolderName;
	private double balance;
	
	public AccountDto(Long id, String aacountHolderName, double balance) {
		super();
		this.id = id;
		this.aacountHolderName = aacountHolderName;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAacountHolderName() {
		return aacountHolderName;
	}

	public void setAacountHolderName(String aacountHolderName) {
		this.aacountHolderName = aacountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
