package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionFactory {
	
	private static Connection connection=null;
	private static MySqlConnectionFactory connectionFactory;
	
	public MySqlConnectionFactory()throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:h2:~/mydb","sa","sa");
	}

}
