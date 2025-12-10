package com.nt.upi;

public class UPIPayment {
	public String doUPIPayment(long mobileno, float amount) {
		return amount+" amount is transferred to mobile number : :"+mobileno + "Using Bharathpe";
	}
	
	public String doUPIPaymentByAcno(long accno, float amount) {
		return amount+" amount is transferred to accno : :"+accno + "Using Bharathpe";
	}

}
