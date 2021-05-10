import java.util.Scanner;
public class method
{
   
        public static void main (String[] args)
        {
            
            float r;
            int s,a,b;

            System.out.println("Enter Radius of circle:");
            Scanner input = new Scanner(System.in);
             r = input.nextFloat();

            System.out.println("Enter Side of square:");
            s = input.nextInt();

            System.out.println("Enter length and breadth of rectangle:");
            a = input.nextInt();
            b = input.nextInt();

           
            System.out.println("Area of Circle= "+area(r,3.142f));
            System.out.println("Area of Square= "+area(s));
            System.out.println("Area of Rectangle= "+area(a,b));
        }

        
        public static float area(float a,float pi)
        {
                float ar = pi*a*a;
                return ar;
        }

        
        public static int area(int a)
        {
                int ar = a*a;
                return ar;
        }

        
        public static int area(int a,int b)
        {
                int ar = a*b;
                return ar;
        }

}
