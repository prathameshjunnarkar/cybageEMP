package com.cybage.messaging.platform.service;

import com.cybage.messaging.platform.domain.Users;

public interface UserService {
	public Users saveOrUpdate(Users user);
}
