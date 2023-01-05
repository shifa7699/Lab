package com.menudriven;

import java.sql.SQLException;
import java.util.Scanner;

public class CMS {
	public static void main(String[] args) throws SQLException {
		College col= new College();
		Scanner sc= new Scanner(System.in);
		int ch;
		for(ch=1;ch<=5;ch++) {
		System.out.println("1.Create College details \n 2. Check Number of Students \n 3. Check Admissions  \n 4. Check number of Staff \n ");
		
		try {
			ch=sc.nextInt();
				if(ch==1) {
						col.viewCollege(); }
				else if (ch==2) {
						col.checkStudents(); 
				}else if(ch==3) {
						col.checkAdmission(); 
				}else if(ch==4) {
					col.checkStaffs(); 
					}  else {
						System.exit(0);
					}
			}catch(InvalidIdException e) {
				System.out.println(e.getMessage());
	}
		}
	}
}
