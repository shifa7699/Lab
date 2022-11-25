//Problem Statement 1:
package thread;

import java.util.ArrayList;

public class ListLoader extends Thread {    //main class
	ArrayList Integer= new ArrayList <Integer> ();      //taking arraylist
	public void loadlist(int startNumber, int lastNumber)       //method
	{
		for(Integer i=startNumber;i<=lastNumber;i++) {      //adding numbers
		}
}
	public static void main(String[] args) {        //main method
		ListLoader l=new ListLoader();           //object of listloader class
		Thread t=new Thread();           //object of thread class
		double start=System.currentTimeMillis();          //response time
		
		l.loadlist(0, 100000);               //taking numbers range
		double last=System.currentTimeMillis();          //response time
		t.start();            //staring the thread
		System.out.println("Response Time:  "+(last-start));
	}
}