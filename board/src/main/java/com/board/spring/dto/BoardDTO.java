package com.board.spring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	
	private int seq;
	private String name;
	private int age;
	private String title; 
	private String content; 
	private String addr; 
}
