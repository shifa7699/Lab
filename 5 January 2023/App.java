package com.EmployeeEg;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory s= new Configuration().configure().buildSessionFactory();
    	Session ses = s.openSession();
    	//Operation performed in db, save permanent
    	Transaction t = ses.beginTransaction();
    	//Create object of persistent class
    	Employee emp = new Employee();
    	//Set the Employee details 
    	emp.setEmp_Id(101);
    	emp.setEmp_Name("Shifa Iqbal");
    	emp.setEmp_Addr("Pune");
    	emp.setEmp_Phone(988275617);
    	emp.setEmp_Sal(24000.55);
    	// create another object to store Employee details
    	Employee emp1 = new Employee();
    	emp1.setEmp_Id(101);
    	emp1.setEmp_Name("Shifa Iqbal");
    	emp1.setEmp_Addr("Pune");
    	emp1.setEmp_Phone(988275617);
    	emp1.setEmp_Sal(24000.55);
    	// create another object to store Employee details
    	Employee emp2 = new Employee();
    	emp2.setEmp_Id(102);
    	emp2.setEmp_Name("Nisha Sutradhar");
    	emp2.setEmp_Addr("Kolkata");
    	emp2.setEmp_Phone(962789219);
    	emp2.setEmp_Sal(34000.55);
    	// create another object to store Employee details
    	Employee emp3 = new Employee();
    	emp3.setEmp_Id(103);
    	emp3.setEmp_Name("Sanaya Mehta");
    	emp3.setEmp_Addr("Bangalore");
    	emp3.setEmp_Phone(957278147);
    	emp3.setEmp_Sal(24050.5);
    	// create another object to store Employee details
    	Employee emp4 = new Employee();
    	emp4.setEmp_Id(104);
    	emp4.setEmp_Name("Rahul Sharma");
    	emp4.setEmp_Addr("Mumbai");
    	emp4.setEmp_Phone(748689391);
    	emp4.setEmp_Sal(2355.55);
    	// create another object to store Employee details
    	Employee emp5 = new Employee();
    	emp.setEmp_Id(105);
    	emp.setEmp_Name("Neha Sharma");
    	emp.setEmp_Addr("Delhi");
    	emp.setEmp_Phone(628391870);
    	emp.setEmp_Sal(2440.00);
    	}    	
 }
