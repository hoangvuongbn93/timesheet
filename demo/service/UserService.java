package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
@Component
public interface UserService {
	List<User> checkLogin(String username, String password);
}
