/*1. Create a spring application with Constructor Dependency 
	   Injection & apply :

	a.. constructor injection with collection
	b.. constructor injection with Dependent object
	c.. constructor injection with Double based value*/
package com.Lab.entity;	

	import java.util.Iterator;
	import java.util.List;

	public class Marks {
		private int id;
		private String sname;
		private List<String>grade;
		public Marks()  { //default constructor
	}
		public Marks(int id, String sname, List<String>grade) { /// parameterized constructor
			super();
			this.id=id;
			this.sname=sname;
			this.grade=grade;
		}
		public void display()  {
			System.out.println(id+" "+sname);
			System.out.println("Grade List : ");
			Iterator <String>itr = grade.iterator();
			while(itr.hasNext())  {
				System.out.println(itr.next());
			}
		}
}
