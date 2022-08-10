package com.lti.inheritance;

public class Demo {

	public String companyname;
	protected int volume;
	public Demo()
	{
		System.out.println("no argument from parent");
	}
	public Demo(String companyName)
	{
		this.companyname=companyName;
		System.out.println("Parameterized from parent");
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	public void display()
	{
		System.out.println(this.companyname);
	}
	
}
