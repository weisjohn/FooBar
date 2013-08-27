package com.api.challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.api.challenge.Employee;
import com.api.challenge.EmployeeManager;

public class Runner {
	
	// our local em
	 public static EmployeeManager manager = new EmployeeManagerImplementation();

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// verify a file was specified
		if (args.length < 1) {
			System.out.println("No file specified.");
			// if we fail, bolt as fast as we can
			System.exit(1);
		}
		
		// ensure path is not empty
		String path = args[0];
		if (path == null || path.trim().equals("")) {
			System.out.println("Invalid filename.");
			System.exit(1);
		}
		
		// ensure file exists
		File f = new File(path);
		if (!f.exists() || f.isDirectory()) {
			System.out.println("File specified is not a file.");
			System.exit(1);
		}
		
		// delegate to parse and build
		parseFile(path);
		
		stepTwo();
		stepThree();
		stepFour();
		stepSeven();
		
	}
	
	
	// read the file, line by line, and make Employees and pop them into the EmployeeManager
	public static void parseFile(String path) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			// skip the first line (the header of the CSV file)
			br.readLine();
			
			while (br.ready()) {
				String s = br.readLine();
				
				// skipping empty lines (overcome the MS-DOS line ending problem)
				if (s.equals("") || s == null) {
					continue;
				}

				// delegate the parsing of the line
				Employee e = createEmployeeFromLine(s);
				
				// pop employee into the EmployeeManager
				manager.addEmployee(e);
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File specified is not a file.");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Could not open file.");
		}
		
	}
	
	// handle the CSV line to create an Employee object
	public static DateFormat df = new SimpleDateFormat("MM-dd-yy");
	public static Employee createEmployeeFromLine(String line) {
		
		String[] str = line.split(",");
		int id = Integer.parseInt(str[3]);
		Date d = new Date();
		try {
			d = df.parse(str[4]);
		} catch (ParseException e1) {}
		
		// TODO: validate the string positions
		
		return new Employee(str[0], str[1], str[2], id, d); 
	}
	
	
	
	
	public static void stepTwo() {
		System.out.println(String.format("The manager has %d employees", manager.getEmployeeCount()));
	}

	public static void stepThree() {
		System.out.println("Removing employee 29");
		manager.removeEmployee(29);
	}
	
	public static void stepFour() {
		System.out.println(String.format("The manager has %d employees", manager.getEmployeeCount()));
	}
	
	
	public static void stepSeven() {
		Employee e = manager.findEmployeeById(92);
		System.out.println("Found employeed with ID:" + e.id + "; " + e.first + " " + e.last);
	}
	

}
