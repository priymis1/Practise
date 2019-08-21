package comm.example.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionfactory {
	
	private static Connection connection;
	private static MyConnectionfactory factory=null;
	
	private MyConnectionfactory() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	}
	
	public static MyConnectionfactory createObject() throws SQLException{
		
		if(factory==null)
		{
			factory=new MyConnectionfactory();
		}
		return factory;
	}
	
	public Connection getConnection() throws SQLException{
		return connection;
	}

}
