//Q1....Hands-On Exercise

package string;
import java.lang.String;
import java.util.StringTokenizer;
public class StringLab 
{
	public static void main(String[] args) 
	{
		//problem statement 1 
		String s="Welcome to Java World"; //String 
		System.out.println(s.charAt(5)); // prints the character present at index 5
		System.out.println(s.compareTo("Welcome")); //compares the String' s' with "Welcome"
		System.out.println(s.concat("Let us learn")); //prints Welcome to Java WorldLet us learn
		System.out.println(s.indexOf("a")); //prints 12
		System.out.println(s.replaceAll("a","e")); //prints Welcome to Jeve World
		System.out.println(s.substring(4, 10)); //prints--> ome to
		System.out.println(s.toLowerCase()); //prints the text in lowercase-->welcome to java world
		
		//Problem Statement 2
		StringBuffer sb=new StringBuffer("This is StringBuffer"); // object of string buffer class
		System.out.println(sb.append("This is a sample program")); //prints-->This is StringBufferThis is a sample program
		System.out.println(sb.insert(21,"Object")); //prints---> This is StringBufferTObjecthis is a sample program
		System.out.println(sb.reverse()); //reverse the text--->margorp elpmas a si sihtcejbOTreffuBgnirtS si sihT
		System.out.println(sb.replace(14,20,"Builder"));
		
		//problem statement 3
		StringBuilder s1=new StringBuilder("||");
		StringTokenizer st=new StringTokenizer("C://IBM//DB2//PROGRAM//DB2COPY1.EXE");
		while(st.hasMoreTokens())  //boolean method, it checks if there is more token available or not
		{
			System.out.println();
			System.out.print(st.nextToken("/")); //String method, it returns the next token from string tokenizer object
			
		}
	}
}
