package cg.assignment;
import java.util.HashMap;
import java.util.Scanner;
public class Authentication
{
	public static void main(String[] args) {
    HashMap<String,Integer> user=new HashMap<String,Integer>();
    Scanner sc= new Scanner(System.in);
	user.put("Chaitanya",12345);
	user.put("newuser",45678);
    System.out.println("Enter your username");
    String username=sc.next();
    int count=0;
    for (int i = 0; i <5; i++) {
    if(count==3)
    {
    System.out.println("Contact Admin");
	break;
   }
  if(user.containsKey(username)){
  System.out.println("Enter your password");
  int p=sc.nextInt();
  if(user.get(username)==p){
  System.out.println("Welcome: "+username);
  break;
 }
 else
 { 
	 count++; 
	 System.out.println("Wrong password"); 
 }
 }
  else
  {
	  count++; 
	  System.out.println("You're fake");
 }
  }
   }
	}
