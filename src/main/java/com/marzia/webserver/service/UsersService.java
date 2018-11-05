/**
 * This file is for users service.
 * Here is function which are getting use for multiple purpose so it is called from here.
 * 
 */
package com.marzia.webserver.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.marzia.webserver.dao.model.UserRoles;
import com.marzia.webserver.dao.model.UserRolesExample;
import com.marzia.webserver.dao.model.Users;
import com.marzia.webserver.dao.model.UsersExample;
import com.marzia.webserver.dao.repository.UserRolesMapper;
import com.marzia.webserver.dao.repository.UsersMapper;


@Service
public class UsersService {

	@Autowired
	private UsersMapper userMapper;

	@Autowired
	private UserRolesMapper roleMapper;

	private static final Logger log = LoggerFactory.getLogger(UsersService.class);

	public Users getUser(int userID) {
		return userMapper.selectByPrimaryKey((Integer) userID);
	}

	public Users getUserByLogin(String Name) {
		UsersExample ue = new UsersExample();
		ue.createCriteria().andUsernameEqualTo(Name);
		List<Users> users = userMapper.selectByExample(ue);
		if (users != null && users.size() > 0) {
			return users.get(0);
		}
		return null;
	}
	
	public String getUserRoles(Integer user_id) {
		StringBuilder sb = new StringBuilder();
		UserRolesExample usr = new UserRolesExample();
		usr.createCriteria().andUserIdEqualTo(user_id);
		List<UserRoles> url = roleMapper.selectByExample(usr);
		if (url == null) return "";
		for (int i = 0; i < url.size(); ++i) {
			sb.append(url.get(i).getRole());
			if (i < url.size() - 1) sb.append(",");
		}
		return sb.toString();
	}

	public int updateUser(Users user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	public List<Users> findAll() {
		return userMapper.selectByExample(null);

	}

	public List<UserRoles> getAllRoles() {
		return roleMapper.selectByExample(null);
	}

	public int getUserId(String username) {
		UsersExample ue = new UsersExample();
		ue.createCriteria().andUsernameEqualTo(username);
		List<Users> ul = userMapper.selectByExample(ue);
		if (ul.size() > 0) {
			return ul.get(0).getUserId();
		} else {
			return -1;
		}
	}

	public List<Users> getUsersByIds(List<Integer> userIds) {
		if (userIds == null || userIds.isEmpty()) {
			return new ArrayList<Users>();
		}
		UsersExample ue = new UsersExample();
		ue.createCriteria().andUserIdIn(userIds);
		return userMapper.selectByExample(ue);
	}

	public int createAuditLog(Users user) {
		return 0;
	}


	public void encodePassword(Users uObj) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(uObj.getPassword());
		log.info("hashed pwd: " + hashedPassword);
		uObj.setPassword(hashedPassword);
	}
}
