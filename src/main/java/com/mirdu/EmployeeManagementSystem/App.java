package com.mirdu.EmployeeManagementSystem;

import java.util.Scanner;

import com.mirdu.EmployeeManagementSystem.entity.Department;
import com.mirdu.EmployeeManagementSystem.entity.Employee;
import com.mirdu.EmployeeManagementSystem.service.DepartmentService;
import com.mirdu.EmployeeManagementSystem.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int opt = 0, empId;
		EmployeeService es = new EmployeeService();
		DepartmentService ds = new DepartmentService();

		char ch;
		do{
			System.out.println("Welcome to Employee Management System");
			System.out.println("-------------------------------------\n");
			
			System.out.println("What are you interested in?\n");
			System.out.println("a) Employee Management \nb) Department Management");
			System.out.println("Enter your choice:");
			ch = ip.next().charAt(0);
			switch (ch) {
			case 'a':

				System.out.println("Welcome to Employee Management");

				do {
					System.out.println(
							"1. Add Employee 2. View Employee 3.View All Employee 4. Update Employee 5.Delete Employee 6.Transfer Employee");
					opt = ip.nextInt();

					switch (opt) {
					case 1:
						System.out.println("ENter the employee details:");
						System.out.println("Enter employee ID:");
						empId = ip.nextInt();
						System.out.println("Enter employee Name:");
						String empName = ip.next();
						System.out.println("Enter employee department Name:");
						String deptName = ip.next();
						System.out.println("Enter employee salary :");
						double empSalary = ip.nextDouble();
						System.out.println(es.addEmployee(new Employee(empId, empName, deptName, empSalary)));
						break;
					case 2:
						System.out.println("ENter the employee details:");
						System.out.println("Enter employee ID:");
						empId = ip.nextInt();
						System.out.println(es.viewEmployee(empId));
						break;
					case 3:
						System.out.println("View All EMployee");
						for(Employee e:es.viewAllEmployee()) {
						System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpDept()+" "+e.getEmpSalary());}
						break;
					case 4:
						System.out.println("Enter the employee details:");
						System.out.println("Enter employee ID:");
						empId = ip.nextInt();
						System.out.println("Enter the field to be modified");
						String key = ip.next();
						System.out.println("Enter the modified value:");
						String value = ip.next();
						System.out.println(es.updateEmployee(empId, key, value));
						break;
					case 5:
						System.out.println("Enter the employee details:");
						System.out.println("Enter employee ID:");
						empId = ip.nextInt();
						es.deleteEmployee(empId);
						break;
					case 6:
						System.out.println("Transfer an Employee");
						System.out.println("Enter employee ID:");
						empId = ip.nextInt();
						System.out.println("Enter the new Department name:");
						deptName = ip.next();
						System.out.println(es.transferEmployee(empId, deptName));
						break;
					}
					System.out.println("Would you like to continue? press 'a'");
					ch = ip.next().charAt(0);
				}while(ch == 'a');
				break;	
			
			case 'b':
				System.out.println("Welcome to Department Management");

				do {
					System.out.println(
							"1. Add Department 2. View Department 3.View All Department 4. Update Department 5.Delete Department ");
					System.out.println("Enter your choice: ");
					opt = ip.nextInt();

					switch (opt) {
					case 1:
						System.out.println("Enter the new Department details:");
						System.out.println("Enter Department ID:");
						int deptId = ip.nextInt();
						System.out.println("Enter Department Name:");
						String deptName = ip.next();
						
						System.out.println(ds.addDepartment(new Department(deptId,deptName,0)));
						break;
					case 2:
						System.out.println("Enter the Department details:");
						System.out.println("Enter Department ID:");
						deptId = ip.nextInt();
						System.out.println(ds.viewDepartment(deptId));
						break;
					case 3:
						System.out.println("Vlew All Department");
						for(Department d:ds.viewAllDepartment()) {
							System.out.println(d.getDeptId()+" "+ d.getDeptName()+" "+d.getNoOfEmployee());
						}
						
						break;
					case 4:
						System.out.println("Enter the Department details:");
						System.out.println("Enter Department ID:");
						deptId = ip.nextInt();
						System.out.println("Enter the new name of the department");
						String newDeptName = ip.next();
						
						System.out.println(ds.updateDepartment(deptId,newDeptName));
						
						break;
					case 5:
						System.out.println("Enter the Department details:");
						System.out.println("Enter Department ID:");
						empId = ip.nextInt();
						ds.deleteDepartment(empId);
						break;
						
					}
					System.out.println("Would you like to continue? Press 'b'");
					ch = ip.next().charAt(0);
				} while (ch == 'b');
				break;
			}

		}while(ch =='a' || ch == 'b');
	}
}
