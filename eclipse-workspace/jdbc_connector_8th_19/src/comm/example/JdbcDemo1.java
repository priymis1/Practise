package comm.example;

import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JdbcDemo1 {
	private static Properties properties=null;
	private static Scanner scanner = new Scanner(System.in);
	
	static {
		properties = new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/mydb");
		properties.put("USER", "root");
		properties.put("PASS", "root");
	}

	public JdbcDemo1() {
		super();
	}
	
	public static void main (String[] args) throws ClassNotFoundException, SQLException
	{
		MySqlConnectionFactory factory = MySqlConnectionFactory.createconnection();
	}

}
