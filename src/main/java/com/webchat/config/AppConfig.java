package com.webchat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webchat.persistence.service.ConferenceRepository;
import com.webchat.persistence.service.UserRepository;

@Configuration
public class AppConfig 
{
	@Bean(initMethod = "init")
	public ConferenceRepository conferenceRepository()
	{
		return new ConferenceRepository();
	}
	
	@Bean(initMethod = "init")
	public UserRepository userRepository()
	{
		return new UserRepository();
	}
}
