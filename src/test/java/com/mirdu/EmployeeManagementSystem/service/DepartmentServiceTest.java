package com.mirdu.EmployeeManagementSystem.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mirdu.EmployeeManagementSystem.entity.Department;

public class DepartmentServiceTest {
	private static DepartmentService ds= null;
	
	
	@Test
	public void testAddDepartment() {
		assertEquals("Department Added", ds.addDepartment(new Department(104, "TEST", 0)));
	}
	@Test
	public void testGetDepartment() {
		assertNotNull(DepartmentService.getDepartment("PRD"));
	}
	@Test
	public void testViewDepartment() {
		assertNotNull(ds.viewDepartment(101));
	}
	@Test
	public void testViewAllDepartment() {
		assertNotNull(ds.viewAllDepartment());
	}
	@Test
	public void testUpdateDepartment() {
		assertEquals("Department Updated", ds.updateDepartment(103, "DEV"));
	}
	@Test
	public void testDeleteDepartment() {
		assertEquals("Invalid Department ID",ds.deleteDepartment(108));
	}
	
	@BeforeClass
	public static void beforeAll(){
		ds = new DepartmentService();
	}
}
