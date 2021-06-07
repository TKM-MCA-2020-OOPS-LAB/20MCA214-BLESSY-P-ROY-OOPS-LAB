package Arithmetic;

import java.util.Scanner;
import Arithmetic.operands;


public class math {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	float a,b;
	
	System.out.println("______ARITHMETIC OPERATIONS_____");
	
	System.out.println("Enter any two numbers to be operated with:");
	a = s.nextFloat();
	b = s.nextFloat();
	
	operands op = new operands(a,b);
	op.add();
	op.sub();
	op.mul();
	op.div();
	
	s.close();
	
	}	

}
