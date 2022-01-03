package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.cms.Restaurent;

public class RestaurentDAO {

	Connection connection;
	PreparedStatement pst;
	public List<Restaurent> showRestaurent() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurent";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Restaurent> restaurentList = new ArrayList<Restaurent>();
		Restaurent restaurent = null;
		while(rs.next()) {
			restaurent = new Restaurent();
			restaurent.setrestaurentId(rs.getInt("RESTAURENTID"));
			restaurent.setrestaurentName(rs.getString("RESTAURENTNAME"));
			restaurent.setrestaurentCity(rs.getString("CITY"));
			restaurent.setrestaurentBranch(rs.getString("BRANCH"));
			restaurent.setrestaurentEmailId(rs.getString("EMAILID"));
			restaurent.setrestaurentContact(rs.getString("CONTACT"));
			restaurentList.add(restaurent);
		}
		return restaurentList;
	}
	
	public Restaurent searchRestaurent(int restaurentId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurent where RESTAURENTID=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, restaurentId);
		ResultSet rs = pst.executeQuery();
		Restaurent restaurent = null;
		if(rs.next()) {
			restaurent = new Restaurent();
			restaurent.setrestaurentId(rs.getInt("RESTAURENTID"));
			restaurent.setrestaurentName(rs.getString("RESTAURENTNAME"));
			restaurent.setrestaurentCity(rs.getString("CITY"));
			restaurent.setrestaurentBranch(rs.getString("BRANCH"));
			restaurent.setrestaurentEmailId(rs.getString("EMAILID"));
			restaurent.setrestaurentContact(rs.getString("CONTACT"));
		}
		return restaurent;
		
	}
}
 