package com.spring.mvc.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.swagger.common.Response;
import com.spring.mvc.swagger.common.User;
import com.spring.mvc.swagger.service.UserServices;

@RestController
@RequestMapping(value = "service")
public class UserManagementController {
	@Autowired(required = true)
	private UserServices services;

	@RequestMapping(value = "/addUser/{no}", method = RequestMethod.POST)
	public Response addUser(@PathVariable("no") int no) {
		return services.addUser(no);
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public User getUser(@RequestParam("id") int id) {
		return services.getUser(id);
	}

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<User> getUsers() {
		return services.getAllUsers();
	}

	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE)
	public Response deleteUser(@PathVariable("id") int id) {
		return services.deleteUser(id);
	}
}
