package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Choices {
	
	@JsonProperty("text")
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
