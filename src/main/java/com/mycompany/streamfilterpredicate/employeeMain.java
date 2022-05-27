package com.mycompany.streamfilterpredicate;

import java.util.ArrayList;
import java.util.List;

public class employeeMain {

	public static void main(String[] args) {

		Employee[] empArr= {
		               new Employee("jhon" ,7263.83),		
		               new Employee("rohon" ,2963.00),		
		               new Employee("peter" ,5643.59),		
		               new Employee("Ram" ,2453.65),		
	};
		
	List<Employee> empList=Array.asList(null);
	empList.parallelStream();
	
	
	
	}

}
