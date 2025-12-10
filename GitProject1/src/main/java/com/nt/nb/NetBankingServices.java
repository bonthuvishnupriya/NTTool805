package com.nt.nb;

public class NetBankingServices {
	
	public String transferMoney(long srcAcno,long destAcno, double amt,String gateway) {
		return amt+" amount is transfered from" +srcAcno +" to " + destAcno+ "using gateway" +gateway;
	}
	
	
	
}
