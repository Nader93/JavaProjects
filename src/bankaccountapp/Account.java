package bankaccountapp;



public abstract class Account implements IBaseRate{
	
	 String name;
	 String sSN;      // Social security number
	 String accountNumber;
	 double rate;
	 double balance; 
	 static int index=10000;
	 
	 
	 
	public Account () {
		System.out.println("This is sthe account constructor");
	}
	public Account(String name,String sSN,double initialDeposit)
	{
		this.name=name;
		this.sSN=sSN;
		this.balance=initialDeposit;
		index++;
		this.accountNumber=setAccountnumber();
		setRate();
//		System.out.println("This is a new account : "+name+" "+sSn+" "+accountNumber+" "+initialDeposit);
	}

	
	
	
	public abstract void setRate();
	private String setAccountnumber()
		{	
			String last2sSN = sSN.substring(sSN.length()-2,sSN.length());
			int unique=index; 
			int last3=(int) (Math.random()*1000); // * in 1000 to generate 3 digit number 
			return last2sSN+unique+last3;
		}


	public void showdata()
		{
		System.out.println("Name : "+ name +"\n"
			  +"Account number :"+accountNumber + "\n"
			  +"Balance : "+balance +"\n"
			  + "Account base rate :"+rate+" %");
		}



}
