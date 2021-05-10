class overload 
{
    void Area(float a)
	{
		float A = a * a;
		System.out.println("Area of the Square: " + A);
	}
    
	void Area(double a)
	{
		double A = 3.14 * a * a;
		System.out.println("Area of the Circle: " + A);
	}

	
	void Area(int a, int b)
	{
		int A = a * b;
		System.out.println("Area of the Rectangle: " + A);
	}
}

class Shape {
	
	public static void main(String[] args)
	{

		overload obj = new overload();
		obj.Area(10.5);
		obj.Area(3);
		obj.Area(5, 4);
	}
}
