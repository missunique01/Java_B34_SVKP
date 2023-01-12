package com.tnsif.main;

import com.tnsif.applicationframework.MMBankFactory;
import com.tnsif.applicationframework.MMCurrentAcc;
import com.tnsif.applicationframework.MMSavingAcc;

public class Bank {

	public static void main(String[] args) {
		MMBankFactory mmBankFactory = new MMBankFactory();
		
//		mmBankFactory.getNewSavingAcc(100, "Naz", 1000, false);
//		mmBankFactory.getNewCurrentAcc(101, "Supriya ", 1000, 5000);
		
		
		MMSavingAcc saving = new MMSavingAcc(100, "Naz", 1000, false);
				saving.withdraw(100);
				
		MMCurrentAcc current = new MMCurrentAcc(101, "Supriya ", 1000, 5000);
		current.withdraw(1000);
		
		saving.toString();
		current.toString();
		}
	

}
