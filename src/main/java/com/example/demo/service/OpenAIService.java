package com.example.demo.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.OpenAIEntity;
import com.example.demo.entity.ResponseModel;

@Service
public class OpenAIService {
	
	@Value("${default.API}")
	private String API;
	@Value("${default.KEY}")
	private String KEY;
	
	
	@Autowired
	private final RestTemplate restTemplate;
	
	
	public OpenAIService(RestTemplate restTemplate) {
		this.restTemplate= restTemplate;
	}
	
	public String  Completions(OpenAIEntity aiEntity) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Bearer " + KEY);
		
		HttpEntity<OpenAIEntity> entity= new HttpEntity<>(aiEntity, headers);
		ResponseModel r=  restTemplate.postForObject(API, entity, ResponseModel.class);
		return r.getChoices().get(0).getText();
	}

}


