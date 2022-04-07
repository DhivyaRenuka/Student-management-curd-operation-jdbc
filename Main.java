package StudentManagementApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		ConnectionProvider.connect() ;
	}
}
//		System.out.println("  ******************* Welcome to student management app *************************** ");
//		   BufferedReader br =new BufferedReader(new InputStreamReader(System.in)) ;
//		   
//		while(true)
//		{
//			System.out.println("  Ënter your choice \n"+" 1. Add student"+
//		"\n 2. Delete student"+"\n 3. Update "+"\n 4. Display "+"\n 5. Exit Console");
//			 int c=Integer.parseInt(br.readLine());
//			 
//			 if( c==1)
//			 {
//				 System.out.println("Ënter user name");
//				 String name=br.readLine();
//				 System.out.println("Ënter user phone");
//				 int phone=Integer.parseInt(br.readLine());
//				 System.out.println("Ënter user city");
//				 String city=br.readLine();
//				 System.out.println("Ënter user course");
//				 String course=br.readLine();
//				 // create student object to store student detail
//				 Student s=new Student(name,phone,city, course);
//				 System.out.println(s);
//				 int ans=StudentDbOpt.insertstudentToDB(s);
//				 
//				 if(ans>0)
//				 {
//					 System.out.println("Student record added successfully......");
//				 }
//				 else
//				 {
//					 System.out.println("Ops, something went wrong try again......");
//				 }
//				 
//				 
//				 
//			 }
//			 else if( c== 2)
//			 {
//				 System.out.println("Enter student  id to delete ");
//				 int  id=Integer.parseInt(br.readLine()) ;
//				 int ans=StudentDbOpt.deleteStudent(id);
//				 if(ans>0)
//				 {
//					 System.out.println("Student record removed successfully......");
//				 }
//				 else
//				 {
//					 System.out.println("Ops, something went wrong try again......");
//				 }
//				 
//			 }
//			 else if( c==3)
//			 {
//				 System.out.println("Ënter new user ID");
//				 int id=Integer.parseInt(br.readLine());
//				 System.out.println("Ënter new user name");
//				 String name=br.readLine();
//				 System.out.println("Ënter new user phone");
//				 int phone=Integer.parseInt(br.readLine());
//				 System.out.println("Ënter user city");
//				 String city=br.readLine();
//				 System.out.println("Ënter new user course");
//				 String course=br.readLine();
//				 // create student object to store student detail
//				 Student s=new Student(name,phone,city, course);
//				 System.out.println(s);
//				 int ans=StudentDbOpt.updatestudentToDB(s,id);
//				 
//				 if(ans>0)
//				 {
//					 System.out.println("Student record updated successfully......");
//				 }
//				 else
//				 {
//					 System.out.println("Ops, something went wrong try again......");
//				 }
//				 
//				 
//			 }
//			 else if(c==4)
//			 {
//				 StudentDbOpt.getDetails();
//			 }
//			 else if(c==5)
//			 {
//				 break;
//				 // exit from loop
//			 }
//			 else
//			 {
//				 System.out.println("Wrong choice choice another");
//			 }
//			
//		}
//	System.out.println("Thank you for using my application !");
//		
//		
//	}

//}
