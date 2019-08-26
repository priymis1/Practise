package fileToDatabase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import comm.example.service.EmployeeServiceImpl;

public class FileEmployee {
	public static void main(String[] args) throws SQLException, IOException
	{
	
	EmployeeServiceImpl service = new EmployeeServiceImpl();
	int id;
	String name;
	String address;
	
	BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
	String line;
	while((line = reader.readLine())!= null)
	{
		
		
		
		
		
		
		
		
		
	}
	
}
}
