package com.hibernate.hql;

public class Employee {
	int empid;
	String Fname;
	String Lname;
	float Sal;
	String address;
	String email;
	public Employee(){
		
	}
	public Employee(int empid,String Fname,String Lname,float Sal,String address,String email) {
		
		this.empid=empid;
		this.Fname=Fname;
		this.address=address;
		this.email=email;
		
		this.Lname=Lname;
		this.Sal=Sal;
		
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public float getSal() {
		return Sal;
	}
	public void setSal(float sal) {
		Sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
