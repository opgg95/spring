package dao;

import java.util.Date;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class UserDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;

	public UserDAO() {
		// autocommit
		sqlsession = factory.openSession(true);
	}

	public int join(UserDTO user) {
		int result;

		result = sqlsession.insert("join", user);

		return result;
	}

	public boolean login(String userid, String userpw) {
		boolean result = false;

		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);

		if ((Integer) sqlsession.selectOne("User.login", datas) == 1) {
			result = true;
		}
		return result;
	}

	public String login_name(String userid, String userpw) {

		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);

		String login_name = sqlsession.selectOne("User.login_name", datas);

		return login_name;
	}

	public String id(String username, String usermail) {

		HashMap<String, String> datas = new HashMap<>();
		datas.put("username", username);
		datas.put("usermail", usermail);

		String user_id = sqlsession.selectOne("User.loginid", datas);

		return user_id;
	}

	public String pw(String username, String userid, String usermail) {

		HashMap<String, String> datas = new HashMap<>();
		datas.put("username", username);
		datas.put("userid", userid);
		datas.put("usermail", usermail);

		String user_pw = sqlsession.selectOne("User.loginpw", datas);

		return user_pw;
	}

	public boolean checkId(String userid) {
		boolean result = false;
		int cnt = 0;

		cnt = sqlsession.selectOne("User.checkId", userid);
		if (cnt >= 1) {
			result = true;
		}

		return result;
	}

	public UserDTO user_info(String userid, String userpw) {

		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);

		UserDTO info = sqlsession.selectOne("User.user_info", datas);

		return info;
	}

	public boolean curpw(String userpw,String userid) {
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);
		boolean result = false;
		int cnt = 0;
			cnt = sqlsession.selectOne("User.curpw",datas);
			System.out.println(cnt);
			if(cnt >= 1) {
				result = true;
			}
		return result;
	}

	// 비밀번호 변경
	public void new_pw(String userid, String userpw) {
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid",userid);
		datas.put("userpw", userpw);
		
		sqlsession.update("User.new_pw",userpw);
	}
	
	public UserDTO coupon(String couponnum) {   // 쿠폰
        
        HashMap<String, String> datas = new HashMap<>();
        datas.put("couponnum", couponnum);
        
        UserDTO coupon = sqlsession.selectOne("User.coupon", datas);
        
        return coupon;
     }
//		public String new_pw(String userpw) {
//			HashMap<String, String> datas = new HashMap<>();
//			datas.put("userpw", userpw);
//			
//			String new_pw = sqlsession.selectOne("User.new_pw",datas);
//			return new_pw;
//			
//		}

}
