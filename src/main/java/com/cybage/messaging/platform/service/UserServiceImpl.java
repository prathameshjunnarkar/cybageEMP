package com.cybage.messaging.platform.service;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.messaging.platform.domain.Users;
import com.cybage.messaging.platform.repository.UsersRepository;

@Slf4j
@Service
@Setter
public class UserServiceImpl implements UserService{

	@Autowired	
	private UsersRepository usersRepository;	

	public Users saveOrUpdate(Users user) {
		log.debug("Saving User:{} .",user.getFirstName());
		user.setCreatedBy(120);
		return usersRepository.save(user);
	}

}
