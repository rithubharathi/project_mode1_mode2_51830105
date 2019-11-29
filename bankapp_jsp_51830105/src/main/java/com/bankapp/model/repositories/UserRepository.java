package com.bankapp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bankapp.model.entities.MyUser;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Long> {
	public MyUser findByEmail(String email);
	
}
