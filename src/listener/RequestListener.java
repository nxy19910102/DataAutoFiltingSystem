package listener;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.RequestLogDAO;
import entity.RequestLog;
import entity.User;

@WebListener
public class RequestListener implements ServletRequestListener {
	
	private ArrayList<User> userList;
	private String session_id;
	private String ip_address;
	private String staff_id;
	
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
//		HttpServletRequest request = (HttpServletRequest) arg0.getServletRequest();
//		HttpSession session = request.getSession();
//		
//		String session_id = session.getId();
//		String ip_address = request.getRemoteAddr();
//		String server_path = request.getServletPath();
//		if (session.getAttribute("staff_id")!=null){
//			staff_id = (String) session.getAttribute("staff_id");
//		} else {
//			staff_id = "nologin";
//		}
//		Enumeration<String> enumer =request.getParameterNames();
//		StringBuffer param = new StringBuffer();
//		while (enumer.hasMoreElements()){
//			String parameter = enumer.nextElement();
//			if (parameter.equals("password")){
//				continue;
//			}
//			param.append(parameter+":"+request.getParameter(parameter)+";"); 
//		}
//		String parameters = param.toString();
//		
//		RequestLogDAO requestLogDAO = new RequestLogDAO();
//		try {
//			requestLogDAO.addRequestLog(session_id, ip_address, server_path, staff_id, parameters);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}	
				
		
//		if (getUserBySessionId(userList,sessionId)==null){
//			User user = new User();
//			user.setSession_id(sessionId);
//			userList.add(user);
//		}
	}

//	private Object getUserBySessionId(ArrayList<User> userList,String sessionId) {
//		for (User u:userList){
//			if (u.getSession_id().equals(sessionId)){
//				return u;
//			}
//		}
//		return null;
//	}

}
