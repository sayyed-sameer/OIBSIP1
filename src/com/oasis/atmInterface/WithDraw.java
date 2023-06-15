package com.oasis.atmInterface;
public class WithDraw implements Transaction {

	public void process (int amt) {
		if(amt<=b.bal) {
			System.out.println("amount withdrawn: "+amt);
			b.bal=b.bal-amt;
			System.out.println("Balance amount: "+b.getBalance());
			System.out.println("Transaction completed......!");
		}
		else
		{
			System.out.println("insufficient fund......");
		}
	}
    
}
