package driver;
import driver.Chocolates;
import java.util.*; 
import driver.Gift;
import driver.Sweets;
public class Demo {
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  first chocolate name");
		String s1=sc.next();
		System.out.println("enter  secound chocolate name");
		String s2=sc.next();
		
		
		TreeSet<String> ts1 = new TreeSet<String>(); 
		ts1.add(s1);
		ts1.add(s2);
		
		//chocolate object
		Chocolates ch=new Chocolates();
		System.out.println(" enter no of cholocaltes" +s1);
		int k=ch.snickers();
		System.out.println(" enter no of cholocaltes"+s2);
		int k1=ch.dairymilk();
		
		// sweet object 
		Sweets sw[]=new Sweets[2];
		sw[0]=new Sweets();
		sw[1]=new Sweets();
		int c=sw[0].barfi();
		int c1=sw[0].gulabjam();
		System.out.println("total  weight of gift is");
		int sum=k+k1+c+c1;
		System.out.println(sum);
		System.out.println("-------------------------------------------------------------------------");
		// collections
		System.out.println("Sorted chocolates");
		System.out.println(ts1);
		
		
		
		
		
	}

}
