package com.board.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BoardController {
	@GetMapping("/board")
	@ResponseBody
	public String boardHome(HttpServletRequest request) {
		return "board";
	}

}
