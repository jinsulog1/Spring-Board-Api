package com.board.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/board")
public class BoardController {
	@Autowired
//	BoardService boardService;
	
	@GetMapping("/list")
	public List<Map<String, Object>> boardList(HttpServletRequest request) {
//		BoardEntity a = new BoardEntity();
//		Map map = new HashMap<>();
//		map.put("BOARD_NM", a)
//		a.setId("")
		List a = null;

//		request.getAttribute("");
		return a;
	}

}
