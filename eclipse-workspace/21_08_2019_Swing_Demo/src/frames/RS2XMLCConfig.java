package frames;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import comm.example.factory.MyConnectionfactory;

public class RS2XMLCConfig {
	private MyConnectionfactory factory;
	private Connection connection;
	
	public RS2XMLCConfig() throws SQLException {
		factory=MyConnectionfactory.createObject();
		connection=factory.getConnection();
	}
	
	public ResultSet getAllEmployee() throws SQLException
	{
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		return rs;
		
	}
	
	public ResultSet getAlltable() throws SQLException
	{
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select ");
		return rs;
		
	

}
}
