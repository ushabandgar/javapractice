package Switchexamples;

public class TenTimesHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //print 10 times hello word
		
		int n=1;
		
		while(n<=10)
		{
			System.out.println("hello "+n);//concatination as string + int
			n++;
		}
		
		System.out.println(n+2);//addition as int + int
		System.out.println('a'+'c');//addition as char is considered as int...unicode value of a and c and addition
		
	}

}
