package com.braindatawire.collegemanagement.client;

import java.util.*;

import com.braindatawire.collegemanagement.serviceImpl.karvenagar;
public class Test {
public static void main(String[] args) {
	karvenagar k=new karvenagar();
	Scanner sc=new Scanner(System.in); 
	while(true)
	{
	System.out.println("-----------------Choice--------------");
	System.out.println("1.Add course\n"+
						"2.View Course\n"+
						"3.add Faculty\n"+
						"4.View Faculty\n"+
						"5.Add Batch\n"+
						"6.View Batch\n"+
						"7.Add Student\n"+
						"8.view Student");
	
	System.out.println("Enter the Choice ");
	int ch=sc.nextInt();
	

{
	{
	switch (ch) {

	case 1:k.addCourse();
		
		break;

	case 2:k.viewCourse();;
	
	break;

	case 3:k.addFaculty();
	
	break;

	case 4:k.viewFaculty();
	
	break;
	case 5:k.addBatch();
	
	break;
	case 6:k.viewBatch();
	
	break;

	case 7:k.addStudent();
	
	break;

	case 8:k.viewStudent();
	
	break;


	default:{
		System.out.println("Please Enter a valid choice");
	}
		break;
	}
	
	}
	
}
}
	}
	
}

