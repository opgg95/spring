package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	
	//age_db.jsp - >getAge
	public int getAge(String name) {
		int  age = 0;
		String sql = "SELECT age FROM MEMBER WHERE name = ?";
		
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstm;
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);
			ResultSet rs = pstm.executeQuery();
		
			if(rs.next()) {
				age = rs.getInt(1);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return age;
	}

}
