package com.board.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.board.spring.dto.BoardDTO;
import com.board.spring.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;

class BoardControllerTest {
	@Autowired
	BoardService boardService;

	@GetMapping("/list")
	public List<Map<String, Object>> boardList(HttpServletRequest request) {
		BoardDTO boardDto = new BoardDTO();
		return boardService.list(boardDto);
	}
}
