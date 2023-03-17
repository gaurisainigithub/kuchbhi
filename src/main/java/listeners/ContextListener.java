package listeners;

import java.io.FileReader;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import utils.DbInitializer;

public class ContextListener implements ServletContextListener {

    public ContextListener() {
       
    }

    public void contextDestroyed(ServletContextEvent sce) 
    { 
       System.out.println("Context destroyed");
    }

    public void contextInitialized(ServletContextEvent sce) 
    { 
      System.out.println("context Initialized");
     ServletContext context= sce.getServletContext();
     String param=context.getInitParameter("createTable");
     if(param.equals("yes"))
     {
    	 System.out.println("Creating tables");
    	InputStream in= this.getClass().getClassLoader().getResourceAsStream("tables.sql");
    	
        DbInitializer db=new DbInitializer();
        db.createTables(in);
        
    	
     }
    }
	
}
