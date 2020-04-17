package com.example.demo.controller;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.LoginForm;
import com.example.demo.form.checkinForm;
import com.example.demo.repository.LoginRepository;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.checkinRepository;
import com.example.demo.service.checkinService;

@Controller
public class LoginController {
	@Autowired
	private checkinService checkinService;
	@Autowired
	private LoginRepository loginRepository;
	@Autowired
	private checkinRepository checkinRepository;
	private String a;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String GetLogin() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model) {

		String userName = loginForm.getUsername();
		String passWord = loginForm.getPassword();
		List<UserEntity> user = loginRepository.checkLogin(userName, passWord);
		if (!user.isEmpty()) {
			a = userName;
			return ("home");
		} else {
			model.addAttribute("invalid login", true);
			return ("login");
		}

	}

	@RequestMapping(value = "/checkinCheckout", method = RequestMethod.GET)
	public String GetCheckinCheckout() {
		return "checkinCheckout";

	}

	@RequestMapping(value = "/checkin", method = RequestMethod.POST)
	public String showtime(Model model, @ModelAttribute(name = "checkinForm") checkinForm checkinForm) {

		String idStaff = a;
		LocalDate workDay = LocalDate.now();
		LocalDateTime startTime = LocalDateTime.now();

		checkinRepository.savecheckin(idStaff, workDay, startTime);

		return "checkinCheckout";
	}

//	@RequestMapping(value = "/checkout", method = RequestMethod.POST)
//	public String Getcheckout() {
//		LocalDate workDay = LocalDate.now();
//		LocalDateTime endTime = LocalDateTime.now();
//		checkinRepository.updatecheckout(a,workDay,endTime);
//		return "checkinCheckout";
//	}

}
