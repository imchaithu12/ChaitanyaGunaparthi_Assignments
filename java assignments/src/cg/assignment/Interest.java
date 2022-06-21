package cg.assignment;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter your >Principle amount >interest rate >time in years");
    int p=sc.nextInt();
    double r= sc.nextDouble();
    int t=sc.nextInt();

    double SI=p*t*r*0.01;
    double CI=p*Math.pow(1+r*0.01,t)-p;

    System.out.println("Simple Interest: "+(int)SI);
    System.out.println("Compound Interest: "+(int)CI);
		   
}
}
