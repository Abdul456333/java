import java.util.*;
 abstract class Account{
	String customer_name;
	String account_no;
	String account_type;
	double balance;
	Account(String customer_name,String account_no,String account_type){
		this.customer_name=customer_name;
		this.account_no=account_no;
		this.account_type=account_type;
		this.balance=0.0;
	}

	void deposit(double amount){
		balance+=amount;
	}
	void displaybalance(){
		System.out.println("current balance:"+balance);
	}
	double getbalance (){
		return balance;
	}
	abstract void withdraw(double amount);
}
class Savacc extends Account{
	double interestrate;
	Savacc(String customer_name,String account_no,double interestrate){
		super(customer_name,account_no,"savings");
		this.interestrate=interestrate;
	}
	void computeanddepositinterest(){
		double interest=balance*(interestrate/100);
		deposit(interest);
		System.out.println("interest computed and added:"+interest);
	}
	void withdraw(double amount){
		if(amount<=balance){
			balance-=amount;
			System.out.println("Withdrawn:"+amount);
		}
		else{
			System.out.println("Insufficient balance");
		}
	}
}
class Curacc extends Account{
		double minbalance;
		double servicecharge;
		Curacc(String customer_name,String account_no,double minbalance,double servicecharge){
		   super(customer_name,account_no,"current");
		   	this.minbalance=minbalance;
			this.servicecharge=servicecharge;
		}
		void withdraw(double amount){
			if(amount<=balance){
				balance-=amount;
				System.out.println("Withdrawn:"+amount);
				checkforservicecharge();
			}
			else{
				System.out.println("Insufficient amount");
			}
		}
		void checkforservicecharge(){
			if(balance<minbalance){
				balance-=servicecharge;
				System.out.println("Service charge applied"+servicecharge);
			}
		}
		void issuecheck(double amount){
			if(amount<=balance){
				balance-=amount;
				System.out.println("check issued for:"+amount);
			}
			else{
				System.out.println("Insufficient balance to issue check");
			}
		}
}
class Bank{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name:");
		String customer_name=sc.nextLine();
		System.out.println("enter account number:");
		String account_no=sc.nextLine();
		System.out.println("enter account type:");
		String account_type=sc.nextLine();
		Account account=null;
		if((account_type).equalsIgnoreCase("savings")){
		 	System.out.println("enter interest rate:");
		    double interestrate=sc.nextDouble();
			account=new Savacc(customer_name,account_no,interestrate);
		}
		else if((account_type).equalsIgnoreCase("current")){
			System.out.println("enter minimum balance:");
		        double minbalance=sc.nextDouble();
			System.out.println("enter servicecharge:");
		        double servicecharge=sc.nextDouble();
			account=new Curacc(customer_name,account_no,minbalance,servicecharge);
		}
		else{
			System.out.println("Invalid account type");
		}
		
		while(true){
			System.out.println("enter 1 for deposit");			
			System.out.println("enter 2 for display balance");
			System.out.println("enter 3 for withdraw");
			if((account_type).equalsIgnoreCase("savings")){
				System.out.println("enter 4 compute and deposit interest");
			}
			else if((account_type).equalsIgnoreCase("current")){
				System.out.println("enter 4 to issue check");
			}
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("enter the amount to deposit");
					double amount1=sc.nextDouble();
					account.deposit(amount1);
					break;
				case 2:
					account.displaybalance();
					break;
				case 3:
					System.out.println("enter the amount:");
					double amount2=sc.nextDouble();
					account.withdraw(amount2);	
					break;
				case 4:
					if((account_type).equalsIgnoreCase("savings")){
						((Savacc)account).computeanddepositinterest();}
					else if((account_type).equalsIgnoreCase("current")){
						System.out.println("enter amount forcheck");
						double amount3=sc.nextDouble();
						((Curacc)account).issuecheck(amount3);
					}
					break;	
			}
		}
	}
}

