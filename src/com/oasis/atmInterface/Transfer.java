package com.oasis.atmInterface;
import java.util.*;
public class Transfer {
	int count=0;
	public void transfer (long acNo) {
		Scanner s=new Scanner(System.in);
		pqr:
		while(true) {
	    System.out.println("Enter the Account number :");
	    int acNo1=s.nextInt();
	    if(acNo==acNo1) {
	    	Balance b=new Balance();
	    	System.out.println("Enter the Amount to be Transfered!!");
	    	int amt=s.nextInt();
	    	if(amt>0 && amt%100==0 && amt<=b.bal)
	    	{
	    		System.out.println("Amount Succesfully Transfered!!!!");
	    	
	    		System.out.println("Transfered amount:"+amt);
	    		b.bal=b.bal-amt;
	    		System.out.println("Balance amount:"+b.getBalance());
	    	}
	    	else 
	    	{
	    		System.out.println("Invalid amount!!!!");
	    	}
	    	break pqr;
	    	
	    }
	    else
    	{
    		System.out.println("Invalid account number!!!!");
    		count ++;
    	}
	    if(count==3)
	    {
	    	System.out.println("Transaction Blocked!!!!");
	    	break;
	    }
	  
	}
 
}
}