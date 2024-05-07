package com.ilp03.utility;

import java.util.Scanner;
import com.ilp03.entity.Account;
import com.ilp03.service.AccountService;

public class AccountUtility {

	public static void main(String[] args) {
		
		Account account = AccountService.createAccount();
		AccountService.displayAccount(account);

	}

}
