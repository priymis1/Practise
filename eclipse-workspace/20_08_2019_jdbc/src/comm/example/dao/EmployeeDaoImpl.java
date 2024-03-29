package comm.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Statement;

import comm.example.model.Employee;
import comm.example.factory.MyConnectionfactory;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private MyConnectionfactory factory =null;
	private Connection connection = null;
	private PreparedStatement pStatement=null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	
	
	public EmployeeDaoImpl() throws SQLException{
		super();
		factory = MyConnectionfactory.createObject();
		connection=factory.getConnection();
		}

	@Override
	public void createEmployee(Employee employee) {
		try {
			pStatement = connection.prepareStatement("insert into employee values (?,?,?,?)");
			pStatement.setInt(1,employee.getId());
			pStatement.setString(2, employee.getFirstname());
			pStatement.setString(3, employee.getLastName());
			pStatement.setString(4, employee.getEmail());
			pStatement.executeUpdate();
						
		}
		catch (SQLException e){
			
			System.out.println("Duplicate id");
			
			e.printStackTrace();
		}
		finally {
			
		}

	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from employee");
			while(resultSet.next())
			{
				list.add(new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee getEmployeesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
