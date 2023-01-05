package com.menudriven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class InvalidIdException extends Exception{ //Created a custom Exception
		InvalidIdException(String str){
			super(str);
		}
	}
	public class College  {
		int dep_Id,dep_Staff, dep_students, admissions,Id;
		String depName;
		Scanner sc = new Scanner(System.in);
		//creating account of new customer
		public void viewCollege() throws SQLException, InvalidIdException  {
		Connection conn = Helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from College where dep_id =" +dep_Id);
		while(rs.next()) {
			dep_Id = rs.getInt(1);
		}
		if(dep_Id!=Id) {
			throw new InvalidIdException("!!WRONG ID ENTERED ");
		} else
		{
			//User Input 
		System.out.println("Enter Depatment Id : ");
		dep_Id=sc.nextInt();
		System.out.println("Enter Department Name : ");
		depName=sc.next();
		System.out.println("Enter No. of staffs in the Department : ");
		dep_Staff = sc.nextInt();
		System.out.println("Enter No. of Students in the Department: ");	
		dep_students=sc.nextInt();
		System.out.println("Enter Admissions open for the Department : ");
		admissions=sc.nextInt();
		
		PreparedStatement stm= conn.prepareStatement("Insert into College values(?,?,?,?,?)");
		stm.setInt(1,dep_Id);
		stm.setString(2,depName);
		stm.setInt(3,dep_Staff);
		stm.setInt(4,dep_students);
		stm.setInt(5,admissions);
		
		stm.executeUpdate();
		System.out.println("College Details updated");  } 
		} 		
		public void checkStudents()  throws SQLException,InvalidIdException {
			//User Input 
			System.out.println("Enter Department Id to check the no. of students :");
			dep_Id=sc.nextInt();
			Connection conn=Helper.con();
			String querycheck="select * from College where dep_id= "+dep_Id ;//fetching data to match the department Id
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(querycheck);
			if(rs.absolute(dep_Id)) {
			st.executeQuery("select dep_stu from College where dep_id = " +dep_Id);// if query true then execution will be done
			}
			else {
			throw new InvalidIdException("!!Wrong Id Entered");
	}
		}
		public void checkAdmission()  throws SQLException,InvalidIdException {
			//User Input 
			System.out.println("Enter Department Id to check Admission Open :");
			dep_Id=sc.nextInt();
			Connection conn=Helper.con();
			String querycheck="select * from College where dep_id= "+dep_Id ;//fetching data to match the department Id
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(querycheck);
			if(rs.absolute(dep_Id)) {
			st.executeQuery("select no_add from College where dep_id = " +dep_Id);  // if query true then execution will be done
			}
			else {
			throw new InvalidIdException("!!Wrong Id Entered");
			}
		}
		public void checkStaffs()  throws SQLException,InvalidIdException {
			//User Input 
			System.out.println("Enter Department Id to check the no. Staffs :"); 
			dep_Id=sc.nextInt();
			Connection conn=Helper.con();
			String querycheck="select * from College where dep_id= "+dep_Id ; //fetching data to match the department Id
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(querycheck); // checking query
			if(rs.absolute(dep_Id)) {
			st.executeQuery("select dep_staff from College where dep_id = " +dep_Id); // if query true then execution will be done
			}
			else {
			throw new InvalidIdException("!!Wrong Id Entered"); //if query false then exception occurs
			}
		}
	}
