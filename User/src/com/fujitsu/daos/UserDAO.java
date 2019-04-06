package com.fujitsu.daos;

import java.util.List;

import com.fujitsu.project.user.User;

public interface UserDAO {
	
	List<User> getAllUsers();
	
	User getUserById(int userId);

	void insert(User user);
	void update(User user);
	void delete(User user);

}
