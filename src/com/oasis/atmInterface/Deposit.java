
package com.oasis.atmInterface;

public class Deposit implements Transaction {
	//Deposit Logic
	public void process(int amt) {
		System.out.println("amount deposited: "+amt);
		b.bal=b.bal+amt;
		System.out.println("Balance amount: "+b.getBalance());
		System.out.println("Transaction Completed.......!");
		
	}

}
