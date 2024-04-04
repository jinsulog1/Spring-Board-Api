package com.board.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class BoardController {
	@GetMapping("/board")
	public List<Map<String, Object>> boardHome(HttpServletRequest request) {
		List<Map<String, Object>> members = new ArrayList<>();
		
		for (int i = 1; i <= 20; i++) {
			Map<String, Object> member = new HashMap<>();
			member.put("id", i);
			member.put("name", i + "번 Test");
			member.put("age", 10+i);
			members.add(member);
		}
		return members;
	}

}
