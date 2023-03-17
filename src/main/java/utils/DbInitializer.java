package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.StringTokenizer;

import com.mysql.cj.xdevapi.Statement;

import connections.ConnectionProvider;

public class DbInitializer 
{
public void createTables(InputStream in)
{
	try
	{
	byte data[]=new byte[in.available()];
	in.read(data);
	in.close();
	
	StringTokenizer str=new StringTokenizer(new String(data),"/");
	Connection con=ConnectionProvider.getConnection();
	java.sql.Statement stmt=con.createStatement();
	System.out.println("Creating tables");
	
	while(str.hasMoreTokens())
	{
		String s=str.nextToken();
		System.out.println(s);
		if(s.trim().equals("stop"))
		{
			break;
		}
		stmt.execute(s);
	}
	System.out.println("Tables Successfully created");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
