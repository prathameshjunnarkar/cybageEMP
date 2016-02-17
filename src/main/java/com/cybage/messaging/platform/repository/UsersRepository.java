package com.cybage.messaging.platform.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.messaging.platform.domain.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer>{

}
