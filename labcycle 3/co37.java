import java.util.*;
import java.time.*;

interface cal_bill
{
	public void calc();
	
}

class cal implements cal_bill
{
	int p_id,qty,up,tot,o_n,date;
	String name;
	public void details()
	{
		Scanner ss = new Scanner(System.in);
		
		System.out.println("Enter Product ID : ");
		p_id = ss.nextInt();
		System.out.println("Enter Name : ");
		name = ss.next();
		System.out.println("Enter Quantity : ");
		qty = ss.nextInt();
		System.out.println("Unit Price : ");
		up = ss.nextInt();
		
	}
	
	public void order()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Order No : ");
		o_n = sc.nextInt();
	}
	
	public void calc()
	{
		tot = qty * up;
		System.out.println("   "+p_id+"\t\t "+name+"\t   "+qty+"\t\t    "+up+"\t     "+tot);
		
		
	}
	
	void display()
	{
		System.out.print("\n");
		System.out.println("BILL");
		System.out.println("==========");
		System.out.print("\n");
		System.out.println("Order No : " + o_n);
		LocalDate obj = LocalDate.now();
		System.out.print("\n");
		System.out.println("Date : " + obj);
		System.out.print("\n");
		System.out.println("Product Id\tName\tQuantity\tunit price\tTotal");
		System.out.print("______________________________________________________________________");
		System.out.print("\n");
		
	}

}

public class co37
{
  public static void main(String[] args)
  {
	  int no,net = 0;
	  
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter no of products : ");
	  no = s.nextInt();
	  cal or = new cal();
	  
	  cal obj[] = new cal[no];
	  
	  or.order();
	  
	  for(int i=0;i<no;i++)
	  {
		  System.out.print("\n");
		  System.out.println("Enter Details of product "+ (i+1));
		System.out.println("==========================");

		  obj[i] = new cal();
		  obj[i].details();
		  
	  }
	  
	  
	  or.display();
	  
	  for(int i=0;i<no;i++)
	  {
		  obj[i].calc();
		  net = net + obj[i].tot;
	  }
	  
	  System.out.println("_______________________________________________________________________");
	  System.out.println("    "+"\t\t  "+"\t    "+"\t\tNet amount :"+"\t "+net);
		  
	  
  }
}