package com.bankapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.MyUser;
import com.bankapp.model.repositories.UserRepository;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;
	

	@Override
	public MyUser findByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	@Override
	public void addUser(MyUser user) {
		userRepo.save(user);
	}

	@Override
	public List<MyUser> findAll() {
		List<MyUser> users=userRepo.findAll();
		return users ;
	}

	@Override
	public void blockUser(Long userId) {
		userRepo.findById(userId);
		
	}

	@Override
	public void deleteUser(Long userId) {
		userRepo.deleteById(userId);
		
	}

}
