package com.tnsif.applicationframework;

import com.tnsif.framewrok.BankAcc;
import com.tnsif.framewrok.BankFactory;
import com.tnsif.framewrok.CurrentAcc;
import com.tnsif.framewrok.SavingAcc;

public class MMBankFactory implements  BankFactory  {

	@Override
	public BankAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		
		SavingAcc savingacc = new SavingAcc(accNo, accNm, accBal, isSalaried);
		
		return null;
	}

	@Override
	public SavingAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		
		CurrentAcc currentacc = new CurrentAcc(accNo, accNm, accBal, creditLimit);
		
		return null;
	}


}
