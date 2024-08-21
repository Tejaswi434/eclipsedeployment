package demojava;
import java.util.*;
public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int b= fun1(a);
	System.out.println("hello"+b);
	}
	static int fun1(int n)
	{ 
	int s=0;
	while(n>0)
	{
		int r= n%10;
		s=s+r;
		n=n/10;
	    }
	if(s>9)
	{
 s=fun1(s);
	}
	 	return s;			
	}
	}

