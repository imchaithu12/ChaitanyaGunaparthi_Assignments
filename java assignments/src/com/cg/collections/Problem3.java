package com.cg.collections;

import java.util.TreeSet;

class Employee {

	public int id;
	public String name;
	public String department;
	public Integer salary;

	Employee() {}

	public Employee(int id, String name, String department, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}


}

class Problem3{

	public static void main(String[] args)
	{

		System.out.println("Sorting By the naming ascending order");

		TreeSet<Employee> Details = new TreeSet<>((Employee e1, Employee e2)-> (e1.name).compareTo(e2.name));

		Details.add(new Employee(1, "Ramana" ,"M" , 50000));
		Details.add(new Employee(2, "Sherya" ,"HR" , 40000));
		Details.add(new Employee(3, "Akbar" ,"TL" ,31000));
		Details.add(new Employee(4, "Babar" ,"A" ,25000));


		for (Employee employee : Details) {
			System.out.println(employee);
		}

		System.out.println("Sorting By the naming decending order");

		TreeSet<Employee> Details2 = new TreeSet<>((Employee e1,Employee e2) -> (e2.name).compareTo(e1.name));

		Details2.add(new Employee(1, "Ramana" ,"M" , 50000));
		Details2.add(new Employee(2, "Sherya" ,"HR" , 40000));
		Details2.add(new Employee(3, "Akbar" ,"TL" ,31000));
		Details2.add(new Employee(4, "Babar" ,"A" ,25000));

		for (Employee employee : Details2) {
			System.out.println(employee);
		}
	}
}

