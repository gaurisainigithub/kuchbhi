package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connections.ConnectionProvider;
import dto.UserBean;
import utils.SendEmail;

public class UserDaoImpl implements UserDao
{

	public String registerUser(UserBean bean)
	{
		try
		{
			Connection connection1=ConnectionProvider.getConnection();
		     System.out.println("Register Connection = "+connection1);
		     
		     PreparedStatement preparedStatement=connection1.prepareStatement("select * from users where email=? and mobile=?");
		     preparedStatement.setString(1, bean.getEmail());
		     preparedStatement.setString(2, bean.getMobile());
		    ResultSet resultSet= preparedStatement.executeQuery();
		    
		    if(resultSet.next())
		    {
		    	return "Either email or mobile altready exists";
		    }
		    else
		    {
		    	PreparedStatement preparedStatement1=connection1.prepareStatement("insert into users(name,email,mobile,pass) values(?,?,?,?)");
		    	preparedStatement1.setString(1, bean.getName());
		    	preparedStatement1.setString(2, bean.getEmail());
		    	preparedStatement1.setString(3, bean.getMobile());
		    	preparedStatement1.setString(4, bean.getPass());
		    	
		    	int i=preparedStatement1.executeUpdate();
		    	if(i>0)
		    	{
		    		return "Registration Successfull";
		    		
		    	}
		    	else
		    	{
		    		return "Registration Failed";
		    	}
		    }
		    	 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public String LoginUser(UserBean bean) 
	{
		try
		{
			Connection connection2=ConnectionProvider.getConnection();
			PreparedStatement preparedStatement=connection2.prepareStatement("select * from users where email=? and pass=?");
			preparedStatement.setString(1, bean.getEmail());
			preparedStatement.setString(2, bean.getPass());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				String n=resultSet.getString("name");
				bean.setName(n);
				return "Login Successfull";
			}
			else
			{
				return "Login failed";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	public String ForgotPass(UserBean bean)
	{
		try
		{
	  Connection connection=ConnectionProvider.getConnection();
	  PreparedStatement preparedStatement=connection.prepareStatement("select * from users where email=?");
	  
	  preparedStatement.setString(1, bean.getEmail());
	  
	  ResultSet resultSet=preparedStatement.executeQuery();
	  if(resultSet.next())
	  {
		 String pass= resultSet.getString("pass");
		 SendEmail.sendEmail(bean.getEmail(), pass);
	  }
	  else
	  {
		  return "Email does'nt exits";
	  }
	   }
		catch (SQLException e) 
		{
		e.printStackTrace();
        }
		return null;
	}
}

	


