/***************************************************************************
 * File          :          EmployeeDetails.java
 * Descriptiopn  :          Program to understand inheritance
 * Author        :          Bijal T Benny
 * Version       :          1.0
 * Date          :          13/10/2023
 * *************************************************************************/
import java.util.Scanner;
public class EmployeeDetails {
	public static void main(String[] args)
	{

	Officer officer=new Officer();
	officer.getDetails();
	officer.setSpecialization();
	System.out.println("Details of Officer:");
	officer.printDetails();
	officer.printSpecialization();

	Manager manager=new Manager();
	manager.getDetails();
	manager.setDepartment();
	System.out.println("Details of Manager:");
	manager.printDetails();
	manager.printDepartment();
	}

	}
	class Employee
	{
	String name;
	int age;
	long phoneno;
	String address;
	int salary;
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{

	System.out.println("Enter Name:");
	   name=sc.nextLine();
	System.out.println("Enter Age:");
	age=sc.nextInt();
	System.out.println("Enter PhoneNo:");
	phoneno=sc.nextLong();
	sc.nextLine();
	System.out.println("Enter Address:");
	   address=sc.nextLine();
	   System.out.println("Enter Salary:");
	salary=sc.nextInt();
	}
	public void printDetails()
	{
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Phoneno:"+phoneno);
	System.out.println("Address:"+address);
	System.out.println("Salary:"+salary);
	}

	}
	class Officer extends Employee
	{
	String specialization;
	public void setSpecialization()
	{
	System.out.println("Enter Specialization:");
	specialization=sc.next();
	}
	public void printSpecialization()
	{
	System.out.println("Specialization:"+specialization);
	}

	}
	class Manager extends Employee
	{
	String department;
	public void setDepartment()
	{
	System.out.println("Enter Department:");
	department=sc.next();
	}
	public void printDepartment()
	{
	System.out.println("Department:"+department);
	}
	}


	