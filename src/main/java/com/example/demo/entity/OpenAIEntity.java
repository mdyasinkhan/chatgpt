package com.example.demo.entity;

public class OpenAIEntity {
	
	private String prompt;
	private String model;
	private int max_tokens;
	
	
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMax_tokens() {
		return max_tokens;
	}
	public void setMax_tokens(int max_tokens) {
		this.max_tokens = max_tokens;
	}
	

}
