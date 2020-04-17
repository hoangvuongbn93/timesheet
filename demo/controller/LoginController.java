package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.LoginForm;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Controller
public class LoginController {
	@Autowired
	private UserRepository userRepository;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
		String userName = loginForm.getUsername();
		String passWord = loginForm.getPassword();
		List<User> user = userRepository.checkLogin(userName, passWord);
		if(!user.isEmpty()) {
			return("home");
		}else {
			model.addAttribute("invalid login", true);
			return("login");
		}
		
	}
}
