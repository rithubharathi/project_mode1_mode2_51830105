package com.bankapp.services;
import java.util.*;
import com.bankapp.model.entities.MyUser;

public interface UserService {
	public MyUser findByEmail(String email);
	public void addUser(MyUser user);
	public List<MyUser> findAll();
	public void blockUser(Long userId);
	public void deleteUser(Long userId);
}
