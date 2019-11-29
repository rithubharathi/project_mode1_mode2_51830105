package com.custapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.custapp.model.persistance.UserDao;
import com.custapp.model.persistance.User;


@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao dao;
	
	@Override
	public User getUser(String userId, String password) {
		return dao.getUser(userId, password) ;
	}

	@Override
	public void addUser(User user) {
		 dao.addUser(user);
		
	}

	@Override
	public List<User> getAllUser() {
		return dao.getAllUser();
	}

}
