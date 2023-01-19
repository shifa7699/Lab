/*1. Create a spring application with Constructor Dependency 
	   Injection & apply :

	a.. constructor injection with collection
	b.. constructor injection with Dependent object
	c.. constructor injection with Double based value*/

package com.Lab.entity;

	public class College {
		private String cname;
		private String email;
		private long phone;
		private C_Address address;
		 
		public College( String cname,String address,String email, long phone)  {//Parameterized constructor
			super();
			this.cname= cname;
			this.email=email;
			this.phone=phone;
		}
		public void display()  {
			System.out.println("The College name is : "+cname+"\n The E-mail is : "+email+"\n The Contact Number is : "+phone);
			System.out.println(address.toString());
		}
	}




