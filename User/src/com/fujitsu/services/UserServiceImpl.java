package com.fujitsu.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fujitsu.daos.UserDAO;
import com.fujitsu.exceptions.ServiceException;
import com.fujitsu.project.user.User;



@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserDAO userDao;

	@Override
	public List<User> findAllUsers() throws ServiceException {
		// TODO Auto-generated method stub
		return  userDao.getAllUsers();
	}

	@Override
	public User findById(int userId) throws ServiceException {
		// TODO Auto-generated method stub
		
		return userDao.getUserById(userId);
	}

	@Override
	public void add(User user) throws ServiceException {
		// TODO Auto-generated method stub
		userDao.insert(user);
	}

	@Override
	public void update(User user) throws ServiceException {
		// TODO Auto-generated method stub
		userDao.update(user);
		
	}

	@Override
	public void remove(User user) throws ServiceException {
		// TODO Auto-generated method stub
		userDao.delete(user);
		
	}

	@Override
	public List<User> sortUsersById() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllUsers().stream().sorted().collect(Collectors.toList()); 
	
	}

	@Override
	public List<User> sortUsersByName() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllUsers().stream().sorted((p1,p2)->p1.getUserName().compareTo(p2.getUserName())).collect(Collectors.toList());
		
	}

	@Override
	public List<User> sortUsersByRole() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllUsers().stream().sorted((p1,p2)->p1.getRole().compareTo(p2.getRole())).collect(Collectors.toList());

		
	}

}
