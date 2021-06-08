package com.openpay.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openpay.app.common.URLConstants;
import com.openpay.app.data.apimodel.GenericResponse;
import com.openpay.app.service.interfaces.UserService;

@RestController
@RequestMapping(value = URLConstants.USERS, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class UserController {

	private static final String LIST_OF_USERS = "List of users";
	private static final String USER = "User";

	@Autowired
	private UserService userService;

	@GetMapping
	public GenericResponse getUsers() {
		return new GenericResponse(LIST_OF_USERS, userService.getUsers());
	}

	@GetMapping(path = URLConstants.PATH_ID)
	public GenericResponse getUser(@PathVariable final Long id) {
		return new GenericResponse(USER, userService.getUser(id));
	}

}
