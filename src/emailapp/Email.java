package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String company="cpc.com";
	private String alternateEmail;
	private String password;
	private int defualt_lenght= 10;
	private int mailCapacity;
	
	
//	ask for firstName and lastName 
public Email(String firstName , String lastName) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.department=setDepartment();

}	
//--------------  generate email 
private String generate_email()
{
	String email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+ department+"."+company;
	return email;
}
//	ask for department 
private String setDepartment() {
	System.out.println("please enter your department \n1 sales\n2 development\n3 accounting \nEnter code :");
	Scanner in = new Scanner(System.in);
	int dep = in.nextInt();
	switch(dep) {
		case 1:return "sales";
		case 2:return "development";
		case 3:return "accounting";
		default:return "None";
	}
}
//	generate random password
private String generatePassword(int length) {
	String passwordSet="ABCDEFGIGKLMNOPQRSTUVWXYZ0123456789$#";
	char[] password = new char[length];
	for(int i=0;i<length;i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i]= passwordSet.charAt(rand);
	}
	return new String(password);
}

//set the alternateEmail
public String setAlternateEmail(String alternateEmail)
{
	return this.alternateEmail=alternateEmail;
}
//	change password
public String changePassword(String newPassword) {
	return this.password=newPassword;
}
//	set the mailbox capacity 
public int setMailbox_capacity(int newnum) {
	return this.mailCapacity=newnum;
}

public String getName(){return firstName+" " +lastName;}
public String getAlternateEmail() {return alternateEmail;}
public String getpassoword() {return password;}
public int getMailboxcapacity() {return mailCapacity;}
public void Show_data() {
System.out.println("User name : "+getName()+"\n"+
					"Your department : "+ department+"\n"+
				   "Email : "+generate_email()+"\n"+
				   "your password : "+generatePassword(defualt_lenght)+'\n'+
				   "the AlternateEmail : "+generate_email()

		
		);

}
}

