package driver;
import java.util.*;
import driver.Demo;
import driver.Gift;

public class Chocolates extends Gift {
	int w,w1;
	

	
		
	Scanner sc=new Scanner(System.in);
	public int snickers()
	{
		
		int scount=sc.nextInt();
	
		 w=scount*wc;
		 return w;
	}
	public int dairymilk()
	{
		
		int dcount=sc.nextInt();
		
		 w1=dcount*wc;
		 return w1;
		
	}
	
	
	

}
