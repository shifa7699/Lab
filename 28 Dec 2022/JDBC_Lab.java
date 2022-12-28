package com.menudriven;

import java.util.Scanner;

public class JDBC_Lab {
	public static void main(String[] args)  {
		EmployeeUploader emp=new EmployeeUploader();
		Scanner sc=new Scanner(System.in);
		int choice;
		int id;
		System.out.println("1 . To Insert\n 2. To Retrieve \n 3. To Calculate PF");
		try {
		choice=sc.nextInt();
			if(choice==1) {
					System.out.println("1. Department deails\n  2.  Employee details");
					choice=sc.nextInt();
					if(choice==1) {
						emp.storeDepartmentDetails();
					}else if(choice==2) {
						emp.storeEmployeeDetails();
					}
			}else if (choice==2) {
					System.out.println("Enter Employee Id : ");
					id=sc.nextInt();
					emp.retrieveEmployeeDetails(id);
			}else if(choice==3) {
					System.out.println("Enter Employee Id :  ");
					id=sc.nextInt();
					emp.calculatePF(id);
			}
		}catch(InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}catch(IDNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}