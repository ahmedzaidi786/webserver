/**
 * This file is for Security users Detail service.
 * Here is objects which are getting use for multiple purpose so it is called from here.
 * 
 */
package com.marzia.webserver.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.marzia.webserver.dao.model.Users;

@Service
public class SecurityUserDetailsService implements UserDetailsService {

	private static final Logger log = LoggerFactory.getLogger(SecurityUserDetailsService.class);
	private UsersService userService;
	@Autowired
	public SecurityUserDetailsService(UsersService userService) {
		this.userService = userService;
	}

	
	public UserDetails loadUserByUsername(String loginID) throws UsernameNotFoundException {
		log.info("in loadUserByUsername with loginID: " + loginID);
		boolean accountNonExpired = true;

		if (loginID == null || loginID.isEmpty()) {
			log.error("User name is empty");
			throw new UsernameNotFoundException("Could not find the user '" + loginID + "'");
		}

		Users user = userService.getUserByLogin(loginID);
		if (user != null ) {
	
			if (accountNonExpired) {
				userService.updateUser(user);
			}

			return new User(loginID, user.getPassword(), true, accountNonExpired, true, true,
					getGrantedAuthorities(user.getUserId()));

		} else {
			throw new UsernameNotFoundException(String.format("User with login=%s was not found", loginID));
		}

	}

	private Collection<GrantedAuthority> getGrantedAuthorities(Integer user_id) {
		String authList = userService.getUserRoles(user_id);
		log.debug("For user authList:{}", authList);
		return AuthorityUtils.commaSeparatedStringToAuthorityList(authList);
	}
}
