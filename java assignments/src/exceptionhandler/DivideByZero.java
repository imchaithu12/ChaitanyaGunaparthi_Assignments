package exceptionhandler;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

	try{
		System.out.printf("Please Enter the numerator : ");
		int n=sc.nextInt();
		System.out.printf("Please Enter the  denominator: ");
		           int d=sc.nextInt();
		           double r=divide(n,d);
		           System.out.println("The quotient is "+r);

		       }
		       catch (ArithmeticException e){
		           System.out.printf("Can't divide by zero");
		       }
		   }
		   public static double divide(int n, int d){
		       return n/d;
		   
 }
}


