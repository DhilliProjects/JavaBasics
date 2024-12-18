package basic;
import java.util.*;



/*	public class Check {
		 public static void main(String args[]) {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter a number");
			 int n1=sc.nextInt();
			 sc.close();
			 int num=0;
			 int temp=n1;
			 while(n1>0)
			 {
			 int t=n1%10;
			 num=num*10+t;
			 n1/=10;
			 }
			 if(temp==num) System.out.println("Palindrome");
			 else System.out.println("Not Palindrome");
			 }
			} */

public class Check {
	 public static void main(String args[]) 
	 {
	int i=5455;
	String d = "5688";
	String s = Integer.toString(i);
	int j= Integer.parseInt(d);
	System.out.println(s);
	StringBuffer sb = new StringBuffer(s);
	System.out.println(sb.reverse());
	System.out.println(d);	 		
		 }}

	 
	/*	 String s1="This";
		 String s2=" is";
		 System.out.println(s1+s2);
		 int i = 5689;
		 String s3 = Integer.toString(i);
		 System.out.println(s3);
		 
		 String s4 = s3.substring(0,2)+9+s3.indexOf(8);
		 System.out.println(s4); 
		 }
	 } */



