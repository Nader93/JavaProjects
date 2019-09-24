package Student_Database;

import java.util.Scanner;

public class studentdatabaseapp {

	public static void main(String[] args) {
		//	ask how many students to be added
System.out.println("pleas enter how many students you will add");
Scanner in = new Scanner(System.in);
int studnts_numb=in.nextInt();		
student [] students_arr=new student[studnts_numb];
in.close();		
	
// create number of students 		
	for(int i=0 ;i<studnts_numb;i++)
		{
		students_arr[i] = new student();
		students_arr[i].payTuition();
		}
//print all the students 
	for(int j=0;j<studnts_numb;j++) {
	System.out.println("the Strudent data :\n \n"+students_arr[j].showInfo());
	}
}

}

