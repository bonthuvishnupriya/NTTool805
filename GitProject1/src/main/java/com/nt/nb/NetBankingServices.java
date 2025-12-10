package com.nt.nb;

public class NetBankingServices {
	
	public String transferMoney(long srcAcno,long destAcno, double amt) {
		return amt+" amount is transfered from" +srcAcno +" to " + destAcno;
	}
}
