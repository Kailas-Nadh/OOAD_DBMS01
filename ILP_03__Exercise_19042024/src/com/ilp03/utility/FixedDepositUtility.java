package com.ilp03.utility;

import com.ilp03.entity.FixedDeposit;
import com.ilp03.service.FixedDepositService;

public class FixedDepositUtility {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit = FixedDepositService.createFixedDeposit();
		FixedDepositService.displayFixedDepositDetails(fixedDeposit);
		
		

	}

}
