package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import util.DBConnect;

public class RequestLogDAO {
	public void addRequestLog(String session_id,String ip_address,String server_path,String staff_id,String parameters) throws SQLException{
		Connection conn = DBConnect.getConnection();
		String sql = "insert into nxy_dafs_request_log ("
			+"id,session_id,ip_address,server_path,staff_id,parameters,eff_date"
			+") values (1,?,?,?,?,?,sysdate)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, session_id);
		ps.setString(2, ip_address);
		ps.setString(3, server_path);
		ps.setString(4, staff_id);
		ps.setString(5, parameters);
		ps.execute();
		ps.close();
	}
	
//	public ArrayList<SessionLog> showSessionLog() throws SQLException{
//		ArrayList<SessionLog> sessionLogList = new ArrayList<SessionLog>();
//		SessionLog sessionLog = null;
//		Connection conn = DBConnect.getConnection();
//		String sql = "select * from nxy_dafs_session_log order by id desc";
//		Statement st = conn.createStatement();
//		ResultSet rs = st.executeQuery(sql);
//		while (rs.next()){
//			sessionLog = new SessionLog();
//			sessionLog.setId(rs.getInt("id"));
//			sessionLog.setSession_id(rs.getString("session_id"));
//			sessionLog.setIp_address(rs.getString("ip_address"));
//			sessionLog.setStaff_id(rs.getString("staff_id"));
//			sessionLog.setEff_date(rs.getDate("eff_date"));
//			sessionLog.setExp_date(rs.getDate("exp_date"));
//			sessionLogList.add(sessionLog);
//		}
//		rs.close();
//		st.close();
//		return sessionLogList;
//	}
}
