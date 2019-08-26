package comm.HandsOn;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBO {
	List<Employee> list = new ArrayList<Employee>();
	public static void printEmployees(List<Employee> list)
	{
	for (Employee e:list)
	{
		System.out.printf("EmpId :%d\t EmpName :%s\t EmpDepartment :%s\t EmpDateOfJoining :%s\t EmpAge :%d\t EmpSalary :%d\n",e.getId(),e.getName(),e.getDepartment(),e.getDateOfJoining(),e.getAge(),e.getSalary());
	}
	}

}
