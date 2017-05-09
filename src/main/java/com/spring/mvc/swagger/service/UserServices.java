package com.spring.mvc.swagger.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.mvc.swagger.common.Response;
import com.spring.mvc.swagger.common.User;

@Service
public class UserServices {

	private final static List<User> users = new ArrayList<User>();

	public Response addUser(int no) {
		for (int i = 1; i <= no; i++) {
			users.add(new User(i, "user" + i));
		}
		return new Response(true, "Added " + no + " uses");
	}

	public List<User> getAllUsers() {
		return users;
	}

	public User getUser(int id) {
		return users.stream().filter(u -> u.getId() == id).findFirst()
				.orElse(null);
	}

	public Response deleteUser(int id) {
		users.removeIf(u -> u.getId() == id);
		return new Response(true, "user" + id + " Removed");
	}
}
