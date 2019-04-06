package com.fujitsu.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.fujitsu.project.user.User;

@Repository
@Transactional


public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(User.class,userId);
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(user);
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(user);
		
	}

}
