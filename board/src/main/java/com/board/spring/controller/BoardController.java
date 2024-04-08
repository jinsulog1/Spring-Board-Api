package com.board.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.spring.dto.BoardDTO;
import com.board.spring.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@GetMapping("/list")
	public List<BoardDTO> list(HttpServletRequest request) {
		System.out.println("Controller");
		return boardService.getAllList();
	}

}
