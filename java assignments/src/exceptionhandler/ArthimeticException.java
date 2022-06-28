package exceptionhandler;

import java.util.Scanner;

public class ArthimeticException {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.printf("Enter the numerator : ");
	int n = sc.nextInt();
    System.out.printf("Enter the  denominator: ");
	int d = sc.nextInt();
	
	try{
	double r=divide(n, d);
    System.out.println("The quotient is: "+r);
	}
	catch (UnsupportedOperationException e) {
    System.out.printf("Can't divide by zero");
    }
  }
	public static double divide(int n, int d) throws UnsupportedOperationException{
	
	if(d==0){
    throw new UnsupportedOperationException("Exception");
	}
	return n / d;
	}
	}
	class UnsupportedOperationException extends Exception{
	UnsupportedOperationException(String exception){
	super(exception);
	}
}
