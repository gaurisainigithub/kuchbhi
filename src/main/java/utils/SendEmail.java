package utils;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

 

public class SendEmail {
	
public static boolean sendEmail(String email, String pass) {
	
		String host="smtp.gmail.com";
		
	
		Properties properties = System.getProperties();
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port","587");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smtp.auth","true");
		properties.put("authentication", "plain");
		properties.put("domain", "gmail.com");
		

		Session session=Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {				
				return new PasswordAuthentication("oliviaelle65@gmail.com","oliviaElle123");
			}});
		
		session.setDebug(true);
		
		MimeMessage m = new MimeMessage(session);
		
		try {
			
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
		
		m.setSubject("Your Password is "+pass);
		
		String content="<h2>QUERY : AndrojavaTech4u</h2>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "<table style=\"width:100%;border: 1px solid black;\">\r\n"
				+ "  <tr style=\"border: 1px solid black;\">\r\n"
				+ "    <th style=\"border: 1px solid black;\">Firstname</th>\r\n"
				+ "    <th style=\"border: 1px solid black;\">Lastname</th> \r\n"
				+ "    <th style=\"border: 1px solid black;\">Course</th>\r\n"
				+ "     <th style=\"border: 1px solid black;\">Email</th>\r\n"
				+ "     <th style=\"border: 1px solid black;\">mobile</th>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td style=\"border: 1px solid black;\">"+email+"</td>\r\n"
				+ "  </tr>\r\n"
				+ " \r\n"
				+ "</table>"
				;
		
		 m.setContent(content, "text/html");
		 m.setSentDate(new Date());
		
		Transport.send(m);
		
		System.out.println("Sent success...................");
		return true;
		
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
			
	}

}