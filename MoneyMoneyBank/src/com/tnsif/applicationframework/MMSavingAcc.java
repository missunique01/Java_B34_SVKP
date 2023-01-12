package com.tnsif.applicationframework;

import com.tnsif.framewrok.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private final float minBal = 0;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	@Override
	public void withdraw(float accBal) {
		
			System.out.println("Dear Savings Account User You have withdrawn : " +accBal+ "");
	}

	@Override
	public String toString() {
		
		return "MMSavingAcc [] :";
	}

	
	
	


}
