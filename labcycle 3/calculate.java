
import java.util.Scanner;

interface math{
	void area();
	void perimeter();
	void input();
}
class circle implements math{
	float r;
	double pi=3.14,area,perimeter;
	Scanner cr=new Scanner(System.in);
	
	public void input() {
	System.out.println("enter the radius:");
	r=cr.nextFloat();
	}
	
	@Override
	public void area() {
		area=pi*r*r;
		System.out.println("Area of the circle:"+area);
		
	}

	@Override
	public void perimeter() {
		perimeter=2*pi*r;
		System.out.println("Perimeter of the circle:"+perimeter);
	}
}

class rectangle implements math{
	int l,w,area,perimeter;
	Scanner rl=new Scanner(System.in);
	
	@Override
	public void input() {
		System.out.println("enter the length:");
		l=rl.nextInt();
		System.out.println("enter the width:");
		w=rl.nextInt();
		
	}

	@Override
	public void area() {
		area=l*w;
		System.out.println("Area of the rectangle:"+area);
		
	}

	@Override
	public void perimeter() {
		perimeter=2*(l+w);
		System.out.println("Perimeter of the rectangle:"+perimeter);
		
	}
	
}
public class calculate{

	public static void main(String[] args) {
		circle obj1=new circle();
		rectangle obj2=new rectangle();
		int y=0;
		while(y<3) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nChoose any one:");
	    System.out.println("1.Circle:\n2.Rectangle:");
		y=sc.nextInt();
		    switch(y) {
			case 1:
				obj1.input();
				obj1.area();
				obj1.perimeter();
				break;
			case 2:
				obj2.input();
				obj2.area();
				obj2.perimeter();
				break;
			 default:
				 System.out.println("wrong choice!!!!");
				 }
		  }	
	 }
}

	
