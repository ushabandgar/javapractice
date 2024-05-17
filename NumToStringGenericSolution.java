package Switchexamples;

import java.util.Scanner;

public class NumToStringGenericSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter num:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0,d=0,r=0;
		
	    while(num>0)
	    {
	    	r=num%10;
	    	rev=rev*10+r;
	    	num=num/10;
	    }//rev=576
	    //num=rev;
	    while(rev>0)
	    {
	    	d=rev%10;
	    	switch(d)
			{
			case 0: System.out.print("zero ");
			        break;
			case 1: System.out.print("one ");
	                break;
			case 2: System.out.print("two ");
	                break;
			case 3: System.out.print("three ");
	                break;
			case 4: System.out.print("four ");
	                break;
			case 5: System.out.print("five ");
	                break;
			case 6: System.out.print("six ");
	                break;
			case 7: System.out.print("seven ");
	                break;
			case 8: System.out.print("eight ");
	                break;
			case 9: System.out.print("nine ");
	                break;
	                  
	        default : System.out.print("invalid ");
	                break;
			}
	    	rev=rev/10;
	    }
	}

}
