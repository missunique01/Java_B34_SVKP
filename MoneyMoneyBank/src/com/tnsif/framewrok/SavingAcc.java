package com.tnsif.framewrok;

public class SavingAcc extends BankAcc {
	boolean isSalaried;
	float MINBAL;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	@Override
	public void withdraw(float accBal) {
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SavingAcc [isSalaried =" + isSalaried + "]";
	}
	
	

}
