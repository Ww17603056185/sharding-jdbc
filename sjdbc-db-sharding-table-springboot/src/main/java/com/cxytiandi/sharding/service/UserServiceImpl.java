package com.cxytiandi.sharding.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> list() {
		List<User> list = new ArrayList<>();
		User user1 = new User();
		user1.setId(30L);
		user1.setCity("广|州");
		user1.setName("dfdf");
		list.add(user1);

		User user2 = new User();
		user2.setId(31L);
		user2.setCity("西|安");
		user2.setName("haha");
		list.add(user2);

//		User user3 = new User();
//		user3.setId(32L);
//		user3.setCity("东|莞");
//		user3.setName("haha2222");
//		list.add(user3);
		userRepository.batchUpdate(list);
//		userRepository.batchAddUser(list);
//		userRepository.batchUpdate2(list);
		return userRepository.list();
	}

	public Long add(User user) {
		return userRepository.addUser(user);
	}

	@Override
	public User findById(Long id) {


		return userRepository.findById(id);

	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

}
