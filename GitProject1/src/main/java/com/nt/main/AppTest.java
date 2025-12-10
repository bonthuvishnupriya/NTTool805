package com.nt.main;

import com.nt.services.ArithmeticOperations;
import com.nt.upi.UPIPayment;

public class AppTest {

	public static void main(String[] args) {
		ArithmeticOperations ops=new ArithmeticOperations();

		System.out.println("Result (Sum) is : :"+ops.sum(10, 20));
		System.out.println("Result (Sub) is : :"+ops.sub(20, 40));
		System.out.println("============");
		UPIPayment upip=new UPIPayment();
		System.out.println(upip.doUPIPayment(999999999L, 10000.0f));
	}
}
