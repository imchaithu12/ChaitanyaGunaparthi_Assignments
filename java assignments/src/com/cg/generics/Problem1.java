package com.cg.generics;

import java.util.HashSet;

class employee{
    int id,salary;
    String name,dept;
    public employee(int id, String name, int salary, String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    @Override
    public String toString(){
        return "{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}";
    }
    @Deprecated
    public void displayDetails(){
        System.out.println("{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}");
    }
}

public class Problem1{
	
    public static void main(String[] args) {
    	
        HashSet<employee> act= new HashSet();
        
        employee e1=new employee(1,"Charlie",25000,"Developer");
        employee e2=new employee(2,"Ramu",40000,"Hr");
        employee e3=new employee(3,"padikal",30000,"SRDeveloper");
        employee e4=new employee(4,"Sherya",50000,"Manager");
        
        act.add(e1);
        act.add(e2);
        act.add(e3);
        act.add(e4);
        for(employee e:act)
        {
        	System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
        }
        
     
    }
}