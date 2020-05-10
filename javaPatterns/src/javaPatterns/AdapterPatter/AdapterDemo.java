package javaPatterns.AdapterPatter;

import java.util.List;

public class AdapterDemo {
	public static void main(String[] args) {
		
		List<Employee> empList=EmployeeClient.getEmployeeList();
		System.out.println(empList);
	}

}
