package com.fujitsu.services;

import java.util.List;

import com.fujitsu.exceptions.ServiceException;
import com.fujitsu.project.user.User;

public interface UserService {
	
	List<User> findAllUsers() throws ServiceException;
	
	User findById(int userId)throws ServiceException;
	
	void add(User user)throws ServiceException;
	void update(User user)throws ServiceException;
	void remove(User user)throws ServiceException;
	
	List<User> sortUsersById() throws ServiceException;
	List<User> sortUsersByName() throws ServiceException;
	List<User> sortUsersByRole() throws ServiceException;
	
	


	

}
