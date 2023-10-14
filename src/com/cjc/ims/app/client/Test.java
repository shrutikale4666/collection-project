package com.cjc.ims.app.client;


import com.cjc.ims.app.serviceimpl.karvenagar;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		karvenagar k=new karvenagar();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Choose an operation:");
			System.out.println("1. Add Course");
			System.out.println("2. View Courses");
			System.out.println("3. Add Faculty");
			System.out.println("4. View Faculties");
			System.out.println("5. Add Batch");
			System.out.println("6. View Batches");
			System.out.println("7. Add Student");
			System.out.println("8. View Students");
			System.out.println("9. Exit");
			
			System.out.print("Enter your choice: ");

			int ch = sc.nextInt();
			
			if(ch==1)
				k.addCourse();
			else if(ch==2)
				k.viewCourse();
			else if(ch==3)
				k.addFaculty();
			else if(ch==4)
				k.viewFaculty();
			else if(ch==5)
				k.addBatch();
			else if(ch==6)
				k.viewBatch();
			else if(ch==7)
			k.addStudent();
			else if(ch==8)
				k.viewStudent();
			else if(ch==9)
			break;
			
			else
				System.out.println("please return to another choice");
			
		}
			
			
			}
		
	}

