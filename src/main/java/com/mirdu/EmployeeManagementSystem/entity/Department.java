package com.mirdu.EmployeeManagementSystem.entity;

public class Department {
	private int deptId;
	private String deptName;
	private int noOfEmployee;
	
	public Department(int deptId, String deptName, int noOfEmployee) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.noOfEmployee = noOfEmployee;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", noOfEmployee=" + noOfEmployee + "]";
	}
}
