package com.oasis.main;
import java.util.Scanner;
import com.oasis.atmInterface.*;
public class MainBank {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		
		long acNo=123456789;
		pqr:
			while(true) {
				System.out.println("Enter the Pin number :");
				int pinNo=s.nextInt();
				CheckPin cp=new CheckPin();
			     boolean k=cp.check(pinNo);
				if(k)
				{
					System.out.println("Choose the following operations!!!");
					System.out.println("1.Transfer \n2.Withdraw \n3.Deposit \n4.Transaction History \n5.Quit");
					System.out.println("Enter the choice :");
					switch(s.nextInt())
					{
					case 1:
						Transfer t=new Transfer();
						t.transfer(acNo);
						
						break pqr;
					case 2:
						System.out.println("Enter the amount to be withdrawn:");
						int a1=s.nextInt();
						if(a1>0 && a1%100==0)
						{
							WithDraw wd=new WithDraw();
							wd.process(a1);
						}
						else
						{
							System.out.println("Invalid Amount!!!!!!");
						}
						break pqr;
					case 3:
						System.out.println("Enter the amount to be Deposited:");
						int a2=s.nextInt();
						if( a2>0 && a2%100==0)
						{
							Deposit d=new Deposit();
							d.process(a2);
						}
						else
						{
							System.out.println("Invalid Amount!!!!");
						}
						break pqr;
					case 4:
						TransactonHistory th=new TransactonHistory();
						th.transHis();
						break pqr;
					case 5:
					     Quit q=new Quit();
					     q.quit(5);
					}
				}
				else
				{
					System.out.println("Invalid Pin number!!!!");
					count++;
				}
				if(count==3)
				{
					System.out.println("Transaction Blocked!!!!");
					break ;
				}
				
			}
	}

}
