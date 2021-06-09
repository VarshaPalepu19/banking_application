import java.util.*;
public class Main{
	public static void main(String args[]) {
		BankAccount obj1=new BankAccount("XYZ","001");
		obj1.showMenu();
	}
}
class BankAccount{
	int bal;
	int prev;
	String cname;;
	String cid;
	
	BankAccount(String cname,String cid){
		this.cname=cname;
		this.cid=cid;
	}
	
	void deposit(int amt) {
		if(amt!=0) {
			bal=bal+amt;
			prev=amt;
		}
	}
	void withdraw(int amt) {
		if(amt!=0) {
			bal=bal-amt;
			prev=-amt;
		}
	}
	void getPrevTransaction() {
		if(prev>0) {
			System.out.println("Deposited "+prev);
		}
		else if(prev<0) {
			System.out.println("Withdrawn "+Math.abs(prev));
		}
		else {
			System.out.println("No transaction occured");
		}
	}
	
	void showMenu() {
		char option='\0';
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome "+cname);
		System.out.println("Your ID is "+cid);
		System.out.println("\n");
		
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		System.out.println("D. C");
		
		do {
			System.out.println("---------------------------");
			System.out.println("Enter an option");
			System.out.println("----------------------------");
			option=sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A':
				System.out.println("---------------");
				System.out.println("Balance= "+ bal);
				System.out.println("---------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("----------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("----------------------------");
				int amount=sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("----------------");
				System.out.println("Enter an amount to withdraw");
				System.out.println("----------------");
				int amount2=sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------");
				getPrevTransaction();
				System.out.println("-----------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("*******");
				break;
				
			default:
				System.out.println("Invalid Option!. Please enter again");
				break;
			}
		}
		while(option!='E');
		System.out.println("Thankyou for using our services");
	}
	
}