package com.tnsif.framewrok;

public interface BankFactory {
	public abstract BankAcc getNewSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried);
	public abstract SavingAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float creditLimit);

}
