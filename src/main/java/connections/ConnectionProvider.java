package connections;

import java.sql.Connection;
import java.sql.DriverManager;

import utils.PropertyReader;

public class ConnectionProvider 
{
static Connection connection=null;

public ConnectionProvider()
{
	
	
}

public static Connection getConnection()
{
	if(connection==null)
	{
		try
		{
			Class.forName(PropertyReader.readProperty("DB_DRIVER"));
			Connection connection=DriverManager.getConnection(PropertyReader.readProperty("DB_URL"), PropertyReader.readProperty("DB_USER"), PropertyReader.readProperty("DB_PASS"));
			return connection;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	else
	{
		return connection;
	}
	return connection;
	
	
	
}

}
