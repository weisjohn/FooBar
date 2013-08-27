package com.api.challenge;

import java.util.Date;

public class Employee {

	public String first;
	public String last;
	public String department;
	public int id;
	public Date birthday;
	
	public Employee(String f, String l, String d, int i, Date b) {
		first = f;
		last = l;
		department = d;
		id = i;
		birthday = b;
	}
	
}
