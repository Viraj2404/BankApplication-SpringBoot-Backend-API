package com.example.bankapplication.mapper;

import com.example.bankapplication.dto.AccountDto;
import com.example.bankapplication.entity.Account;

public class AccountMapper {

	public static Account mapTOAccount(AccountDto accountDto) {
		Account account = new Account(
				accountDto.getId(),
				accountDto.getAacountHolderName(),
				accountDto.getBalance()
				
				);
		
		return account;
	}
	
	public static AccountDto mapTOAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
				);
		
		return accountDto;
				
	}
	
}
