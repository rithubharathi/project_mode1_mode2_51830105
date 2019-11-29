package com.custapp.model.persistance;

import java.util.List;

import com.custapp.model.persistance.User;

public interface UserDao {
	public User getUser(String userId,String password);
	public void addUser(User user);
	public List<User> getAllUser();
}
