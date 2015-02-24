package listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//@WebListener
public class SessionListener implements HttpSessionListener {
	
//	private int userNumber;
//	private String session_id;
//	private String ip_address;
//	private String staff_id;

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
//		HttpSession session = arg0.getSession();
//		ServletContext context = session.getServletContext();
//		userNumber++;
//		context.setAttribute("userNumber", userNumber);
//		
//		session_id = session.getId();
//		ip_address = context.
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
//		userNumber--;
//		arg0.getSession().getServletContext().setAttribute("userNumber", userNumber);
	}

}
