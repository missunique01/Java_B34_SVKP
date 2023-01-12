package com.tnsif.applicationframework;

import com.tnsif.framewrok.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		System.out.println("Dear Current Account User You have withdrawn : " + accBal + "");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MMCurrentAcc []";
	}
	
	

}
