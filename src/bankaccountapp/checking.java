package bankaccountapp;

public class checking extends Account {
	
	 long Debit_card;
	 int pin;
	
	
	public checking(String name,String sSn,double initialDeposit)
	{	super(name,sSn,initialDeposit);
		accountNumber= "2"+accountNumber;
//		System.out.println("Account number ="+accountNumber);
//		System.out.println("New checking account");
		setCheckingAccountHolders();
	}
	private void setCheckingAccountHolders()
	{
		Debit_card=(long)(Math.random()  *Math.pow(10,12));
		pin=(int)(Math.random()*10000);
	}


	public void showdata()
	{
		super.showdata();
		System.out.println("************");
		System.out.println("Account type : "+ "Checking Account");
		System.out.println("checking Account Features \n"+
				"Debit Card Number : "+Debit_card+"\n"+
				"Debit Card Pin : "+pin +"\n"
				);
		System.out.println("================================================================= \n");
	}
	@Override
	public void setRate() {
		rate= getBaseRate()*0.15;
		
	}	
	
	
	
}
