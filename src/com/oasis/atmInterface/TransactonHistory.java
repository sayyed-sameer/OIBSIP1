package com.oasis.atmInterface;
public class TransactonHistory implements Transaction  {
	public void transHis() {
		Balance b=new Balance();
		System.out.println("Available balance :"+b.getBalance());
		
	
      }
	public void process(int amt) {
		if(amt<=b.bal) {
			System.out.println("amount withdrawn: "+amt);
			b.bal=b.bal-amt;
			System.out.println("Balance amount: "+b.getBalance());
		
		}
		
		System.out.println("amount deposited: "+amt);
		b.bal=b.bal+amt;
		System.out.println("Balance amount: "+b.getBalance());
		
		
	}
}