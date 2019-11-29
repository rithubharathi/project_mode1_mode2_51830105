package com.custapp.model.persistance;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.custapp.model.persistance.User;
import com.custapp.model.persistance.UserNotFoundException;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory factory;
	public Session getSession(){
		return factory.getCurrentSession();
	}
	
	
	public User getUser(String userId, String password) {
		@SuppressWarnings("unchecked")
		List<User> users=getSession().createQuery("select u from User u where u.userId=:userId and u.password=:password").setString("userId", userId).setString("password", password).list();
		if(users.size()>0)
			return users.get(0);
		else
			throw new UserNotFoundException("user with username "+userId+" not found");
	}

	public void addUser(User user) {
		getSession().save(user);
		
	}

	public List<User> getAllUser() {
		return getSession().createQuery("from User").list();
	}

}
