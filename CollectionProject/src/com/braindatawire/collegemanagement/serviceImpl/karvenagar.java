package com.braindatawire.collegemanagement.serviceImpl;

import com.braindatawire.collegemanagement.model.Batch;
import com.braindatawire.collegemanagement.model.Course;
import com.braindatawire.collegemanagement.model.Faculty;
import com.braindatawire.collegemanagement.model.Student;
import com.braindatawire.collegemanagement.service.Cjc;
import java.util.*;

public class karvenagar implements Cjc {
	Course c = new Course();
	Faculty f = new Faculty();
	Batch b = new Batch();
	Student s = new Student();

	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {

		System.out.println("-----Course Details------");
		System.out.println("Enter the Course id");
		int cid = sc.nextInt();
		c.setCid(cid);

		System.out.println("Enter the Course name");
		String cname = sc.next();
		c.setCname(cname);

		clist.add(c);

	}

	@Override
	public void viewCourse() {

		System.out.println("----Course View Details----");

		Iterator<Course> itr = clist.iterator();

		while (itr.hasNext()) {

			Course c = itr.next();
			System.out.println("-----------------------------------------");
			System.out.println("Course id is "+c.getCid());
			System.out.println("Course name is"+c.getCname());
			System.out.println("Course Added Successfully");
			System.out.println("-----------------------------------------");

		}

	}

	@Override
	public void addFaculty() {

		System.out.println("-----Faculty Details------");
		System.out.println("Enter the Faculty id");
		int fid = sc.nextInt();
		f.setFid(fid);

		System.out.println("Enter the Faculty name");
		String fname = sc.next();
		f.setFname(fname);
	
	
		System.out.println("Assigned  Course id");
        int id=0;
        	id=	sc.nextInt();
        

        	
        	
        	while(true)
        	{
        		if(id==c.getCid())
        		{
        			f.setCourse(c);
        			System.out.println("Course Added Successfully");
        			break;
        	}
        	
        	else
        	{
        		System.out.println("Enter a Correct Id");
        		id=sc.nextInt();
        	}

	}
	
	flist.add(f);
}
	@Override
	public void viewFaculty() {
		// TODO Auto-generated method stub
		System.out.println("----Faculty View Details----");

		Iterator<Faculty> itr1 = flist.iterator();
		while (itr1.hasNext()) {
			Faculty f1 = itr1.next();
			System.out.println("-----------------------------------------");
			System.out.println("Faculty id is "+f1.getFid());
			System.out.println("Faculty name is "+f1.getFname());
			System.out.println("Faculty Course id is "+f1.getCourse().getCid());
			System.out.println("Faculty course name is "+f1.getCourse().getCname());
			System.out.println("Faculty added to course is Succesffully");
			System.out.println("-----------------------------------------");

		}
	}

	@Override
	public void addBatch() {
		// TODO Auto-generated method stub


		System.out.println("-----Batch Details------");
		System.out.println("Enter the batch id");
		int bid = sc.nextInt();
		b.setBid(bid);

		System.out.println("Enter the batch name");
		String bname = sc.next();
		b.setBname(bname);
		
		System.out.println("Assigned Faculty to batch");
		int fid=sc.nextInt();
		while(true)
		{
		if(fid==f.getFid())
		{
			b.setFaculty(f);
			System.out.println("Assigned Faculty Successfully");
			break;
		}
		else
		{
			System.out.println("Please Enter a Valid Batch id  ");
			fid=sc.nextInt();
		}
		
		}
		blist.add(b);
	}

	@Override
	public void viewBatch() {
		// TODO Auto-generated method stub
		System.out.println("----Batch View Details----");
	


		Iterator<Batch> itr1 = blist.iterator();
		while (itr1.hasNext()) {
			Batch b1 = itr1.next();
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Batch id is "+b1.getBid());
			System.out.println("Batch name is"+b1.getBname());
			System.out.println("Batch faculty is "+b1.getFaculty().getFid());
			System.out.println("Batch Faculty name is "+b1.getFaculty().getFname());	
			System.out.println("Batch Faculty Course id is"+b1.getFaculty().getCourse().getCid());
			System.out.println("Batch Faculty Course name is "+b1.getFaculty().getCourse().getCname());
			System.out.println("Batch Added to Faculty is Successfully");
			System.out.println("---------------------------------------------------------------------------");
		}
	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		System.out.println("-----Student Details------");
		System.out.println("Enter the Student id");
		int sid = sc.nextInt();
		s.setSid(sid);

		System.out.println("Enter the Student name");
		String sname = sc.next();
		s.setSname(sname);
		System.out.println("Assigned  batch  to student" );
		int sid1=sc.nextInt();
		
		while(true)
		{
		if(sid1==b.getBid())
		{
		s.setBatch(b);
		System.out.println("Batch Added Successfully");
		}
		else
		{
			System.out.println("Please Enter a valid Batch");
		sid1=sc.nextInt();
		break;
		}
		
		
	}
	
		slist.add(s);
}

	

	@Override
	public void viewStudent() {
		// TODO Auto-generated method stub
		System.out.println("----Faculty View Details----");
	Iterator<Student> itr1 = slist.iterator();
		while (itr1.hasNext()) {
			Student s1= itr1.next();
			System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println("Student id is "+s1.getSid());
			System.out.println("Student name is "+s1.getSname());
	        System.out.println("Student batch id is "+s1.getBatch().getBid());
			System.out.println("Student Batch name is "+s1.getBatch().getBname());
			System.out.println("Student batch Faculty id is "+s1.getBatch().getFaculty().getFid());
			System.out.println("Student batch Faculty name is "+s1.getBatch().getFaculty().getFname());
			System.out.println("Student Batch Faculty Course id id "+s1.getBatch().getFaculty().getCourse().getCid());
			System.out.println("Student Batch Faculty Coure name is "+s1.getBatch().getFaculty().getCourse().getCname());
			System.out.println("Student id Added to Batch is Successfully");
			
		}
	}
	
}
