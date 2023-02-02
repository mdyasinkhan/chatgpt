package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.OpenAIEntity;
import com.example.demo.service.OpenAIService;

@RestController
public class OpenAIController {
	
	@Autowired
	private final OpenAIService openAIService;
	
	
	public OpenAIController(OpenAIService openAIService) {
		this.openAIService= openAIService;
	}
	
	@PostMapping("/completions")
	
	public ResponseEntity<?> completion(@RequestBody OpenAIEntity aiEntity) {
		return  ResponseEntity.ok(openAIService.Completions(aiEntity));
	}

}
