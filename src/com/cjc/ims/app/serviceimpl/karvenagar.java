package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

public class karvenagar implements Cjc {

	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();

	Student stu = new Student();
	Course cu = new Course();
	Batch ba = new Batch();
	Faculty fa = new Faculty();

	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {
		System.out.println("Enter Course ID:");
		cu.setCid(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Course Name:");
		cu.setCname(sc.next());
		clist.add(cu);

	}

	@Override
	public void viewCourse() {
		Iterator<Course> citr = clist.iterator();
		while (citr.hasNext()) {
			Course c = citr.next();
			System.out.println("Course id"+c.getCid());
			System.out.println("Course Name"+c.getCname());

		}
	}

	@Override
	public void addFaculty() {
		System.out.println("Enter Faculty ID:");
		fa.setFid(sc.nextInt());
		System.out.println("Enter Faculty name");
		fa.setFname(sc.next());
		System.out.println("Faculty details");
		fa.setCourse(cu);
		flist.add(fa);
	}

	@Override
	public void viewFaculty() {
		Iterator<Faculty> fitr = flist.iterator();
		while (fitr.hasNext()) {
			Faculty x1 = fitr.next();
			System.out.println("Faculty id"+x1.getFid());
			System.out.println("Faculty name"+x1.getFname());
		}

	}

	@Override
	public void addBatch() {
		System.out.println("Enter Batch ID:");
		ba.setBid(sc.nextInt());
		System.out.println("Enter Batch Name");
		ba.setBname(sc.next());
		System.out.println("Batch details");
		ba.setFaculty(fa);
		blist.add(ba);

	}

	@Override
	public void viewBatch() {
		Iterator<Batch> bitr = blist.iterator();
		while (bitr.hasNext()) {
			Batch b = bitr.next();
			System.out.println("Batch id"+b.getBid());
			System.out.println("Batch name"+b.getBname());
		}

	}

	@Override
	public void addStudent() {
		System.out.println("Enter Student ID:");
		stu.setSid(sc.nextInt());

		System.out.println("Enter Student Name:");
		stu.setSname(sc.next());
		System.out.println("Student details");
		stu.setBatch(ba);
		slist.add(stu);
	}

	@Override
	public void viewStudent() {
		Iterator<Student> sitr = slist.iterator();
		while (sitr.hasNext()) {
			Student s = sitr.next();
			System.out.println("Student id"+s.getSid());
			System.out.println("Student name"+s.getSname());
		}
	}

}
