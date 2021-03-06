package com.saini_vinit.portal.exam.service;

import java.util.List;
import java.util.Set;

import com.saini_vinit.portal.exam.dto.ResultUserDto;
import com.saini_vinit.portal.exam.entity.User;
import com.saini_vinit.portal.exam.entity.UserRole;

public interface UserService {

	ResultUserDto createUser(User user,List<UserRole> userRole) throws Exception;
	
	ResultUserDto getUserByUserName(String username);
	
}
