package Student_Database;

import java.util.Scanner;

public class student {
	private String name;
	private int grade_year;
	private String student_ID;
	private String courses="";
	private int tuitionfees;
	private int reminderTuition;
/* static instance is fixed to all instance of the class ,
	it related to the class not to the instance	
*/
	private static int id =1000;
	private static int coursecost=600;   
	
	public student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the student name ");
	    this.name=in.next();
		System.out.println(" 1- f_year \n 2-secyear \n 3- thrdyear \n 4-fourthyear \n Please enter the student year");
		this.grade_year=in.nextInt();
		generateId();
		courses_enrolled();
		//--------------------- for test
//		System.out.println(name + grade_year);
	}
	
	//Generate ID 
	private void generateId() {
		id++;
		this.student_ID= grade_year+""+id;
	}
	
	//courses to be enrolled in 
	
	private void courses_enrolled()
	{
		do {	
			System.out.println("Please Enter the courses name (press Q to quite) : " );
			Scanner in = new Scanner(System.in);
			String course= in.next();
				if(!course.equals("Q")) {
					courses=courses+"\n"+course;
					tuitionfees=tuitionfees+coursecost;
				}
				else
				{
					break;
				}
				
		}while(1!=0);
		System.out.println("Courses that student Enrolled in are  ="+courses);
	}
	//view balance 
	public void viewTuitionfees() {
		System.out.println("your tuitionfees is $ "+tuitionfees);
	}
	
	// pay tuition
	public void payTuition() {
		viewTuitionfees();
		System.out.println("please enter the paied tuition");
		Scanner in = new Scanner (System.in);
		int paied =in.nextInt();
		int reminderTuition = tuitionfees-paied;
		System.out.println("thank you for your payment :"+ paied+ '$');
		if (reminderTuition>0) {
			System.out.println("But!! You have to pay additional "+ reminderTuition+ '$'+" to be fully registerd to the courses");
			this.reminderTuition=reminderTuition;
		}
		else {
			System.out.println(" You paied "+paied+ '$'+" and there is addiotional "+(-1*reminderTuition)+'$');
		}
	}
	
	//see student status
	
	public String showInfo()
	{
		return "Student name is : "+name +"\n"+
			   "Student ID is : "+student_ID+"\n"+
				"Corses Enrolled by the student :"+"courses"+"\n"+
			    "reminderTuition : "+reminderTuition+"\n";
	}
	
	
	
	
}
