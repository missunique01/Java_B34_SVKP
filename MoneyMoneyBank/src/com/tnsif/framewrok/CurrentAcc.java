package com.tnsif.framewrok;

public class CurrentAcc extends BankAcc {
	public float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
		
	}

	@Override
	public void withdraw(float accBal) {
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit =" + creditLimit + "]";
	}
	
	

}
