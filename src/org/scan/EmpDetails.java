package org.scan;

import java.nio.charset.Charset;
import java.util.Scanner;

public class EmpDetails {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	
	System.out.println("enter the id");
	int empId= sc.nextInt();
	System.out.println("enter the id"+empId);
	
	System.out.println("enter Name");
	String empName=sc.next();
	System.out.println("enter the name"+empName);
	
	System.out.println("enter the email");
	String empEmail=sc.next();
	System.out.println("enter the email"+empEmail);
	
	System.out.println("enter the phNum");
  String empPh=sc.next();
  System.out.println("enter the phnum"+empPh);
	
  System.out.println("enter the salary");
  Float empSal=sc.nextFloat();
  System.out.println("enter the salary"+empSal);
  
  System.out.println("enter the gender");
  String empGen=sc.next();
  System.out.println("enter the Gender"+empGen);
  
  
  System.out.println("enter the city");
  String empCity=sc.next();
  System.out.println("enter the city"+empCity);
  
  
  
  
}
}
