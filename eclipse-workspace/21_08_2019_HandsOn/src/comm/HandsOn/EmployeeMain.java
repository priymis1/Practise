package comm.HandsOn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
	
	static List<Employee> list = new ArrayList<Employee>();
	static Scanner scanner = new Scanner(System.in);
	static int choice =0;

	public static void main(String[] args) throws ParseException {
		System.out.println("Enter the number of employees :");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee id");
			int id = scanner.nextInt();
			System.out.println("Enter employee name");
			String name = scanner.next();
			System.out.println("Enter employee department");
			String department = scanner.next();
			System.out.println("Enter employee date of joining in dd/mm/yyyy");
			String d = scanner.next();
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(d);
			System.out.println("Enter employee age");
			int age = scanner.nextInt();
			System.out.println("Enter employee salary");
			int sal = scanner.nextInt();
			Employee e = new Employee(id,name,department,date,age,sal);
			list.add(e);
		}
		
		
		do {
			System.out.println("1. Sort Employees by salary");
			System.out.println("2. Sort Employees by age and by date of joining");
			System.out.println("0. Exit...");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				Collections.sort(list);
				EmployeeBO.printEmployees(list);
				break;
				
			case 2:
				Collections.sort(list, new AgeComparator());
				EmployeeBO.printEmployees(list);
				break;
				
			case 0:
				System.out.println("Bye!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Please enter a valid choice");
				break;
			}
		}while(choice!=0);
		
		
		
		

	}

}
