package com.tnsif.framewrok;

public class BankAcc {
	int accNo;
	String accNm;
	float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public void withdraw(float accBal) {
		
	}
	public void deposite(float accBal) {
		
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNum=" + accNm + ", accBal=" + accBal + "]";
	}
	
}
