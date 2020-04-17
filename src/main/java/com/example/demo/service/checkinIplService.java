package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.checkinCheckoutEntity;
import com.example.demo.repository.checkinRepository;
@Service
public class checkinIplService implements checkinService{
	
	@Autowired
	private checkinRepository checkinRepository;

	@Override
	public void save(checkinCheckoutEntity checkin) {	
	checkinRepository.save(checkin);
		
	}



	
}
