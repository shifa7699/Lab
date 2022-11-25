//Problem Statement 1:
package thread;

import java.util.ArrayList;


class LoaderThread implements Runnable{
	int startNumber,lastNumber;
	LoaderThread(int sn,int ln){
		this.startNumber=sn;
		this.lastNumber=ln;
	}
	
public void run() {
	ArrayList<Integer>L=new ArrayList<Integer>();

	for(Integer i=startNumber;i<=lastNumber;i++) { //adding numbers
		L.add(i);
}
	for(int j:L) {
		System.out.println(j);
	}}
public static class ListLoader {
	public static void main(String[] args)throws InterruptedException {
		Runnable r1=new LoaderThread(0,100);
		Thread t=new Thread(r1);
		int a=(int)System.currentTimeMillis();//time taken before executing
		System.out.println("Response time before executing loadlist method "+a);
		t.start();
		t.join();
		int b=(int)System.currentTimeMillis();//time taken after executing
		System.out.println("Response time before executing loadlist method "+b);
		System.out.println("Response time-"+(b-a));
	}
		
	}
}