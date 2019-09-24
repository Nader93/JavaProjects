package bankaccountapp;

public class saving extends Account {
	 int safetyDepositeboxID ;
	 int safetyDepositeboxkey ;
	
	
	public saving (String name,String sSn,double initialDeposit)
	{
		super(name,sSn,initialDeposit);
		accountNumber= "1"+accountNumber;
//		System.out.println("Account number ="+accountNumber);
//		System.out.println("New saving account");
		safetyDepositebox();
	}
	private void safetyDepositebox()
	{	safetyDepositeboxID=(int)(Math.random()*1000);
		safetyDepositeboxkey=(int)(Math.random()*10000);
	}
	
	public void showdata()
	{
		super.showdata();
		System.out.println("************");
		System.out.println("Account type : "+ "Saving Account");
		System.out.println("Saving Account Features \n"+
				"Safety Deposite Box ID : "+safetyDepositeboxID+"\n"+
				"Safety Deposite Box Key : "+safetyDepositeboxkey +"\n"
				);
		System.out.println("================================================================= \n");
	}
	@Override
	public void setRate() {
		rate= getBaseRate()- 0.25;
		
	}	
}
