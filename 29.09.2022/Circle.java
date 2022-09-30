//HANDS-ON EXERCISE 1

package com.cognizant.shapes;

public class Circle {
	float radius;
	static float pi=3.5f;
	public Circle()
	 {
		radius=3.4f;
	 }
	Circle(float radius) {
		this.radius=radius;
	}
	 public Circle(float radius, float pi) {
		 this.radius=radius;
		 this.pi=pi;
	 }
	 float calc_area(float r) {
		 return 2*r*r;
	 }
	 float calc_circum(float r) {
		 return 2*pi*r;
	 }
	public static void main(String[] args) {
		Circle c= new Circle();
		Circle c1=new Circle();
		System.out.println("The area of the circle is:- "+c.calc_area(4.7f));
		System.out.println("The circumference of the circle is:- "+c1.calc_circum(5.5f));
	}
}
