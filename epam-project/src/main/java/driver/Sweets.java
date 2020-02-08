package driver;
import java.util.*;
import driver.Gift;

public class Sweets extends Gift {
	int sc,wob;
	int sc1;
	Scanner st=new Scanner(System.in);
	public int barfi()
	{
		System.out.println("enter the no of barfi sweets");
		sc=st.nextInt();
		wob=sc*ws;
		return wob;
		
		
	}
	public int gulabjam() {
		System.out.println("enter the no of  gulabjam sweets");
		sc1=st.nextInt();
		wob=sc1*ws;
		return wob;
		
	}
	

}
