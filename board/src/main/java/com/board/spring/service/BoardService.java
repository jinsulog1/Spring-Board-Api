package com.board.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.spring.dto.BoardDTO;
import com.board.spring.mapper.BoardMapper;

@Transactional
@Service
public class BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	public List<BoardDTO> getAllList() {
		return boardMapper.findAll();
	}
	
//	public List<BoardDTO> add() {
//		return boardMapper.add();
//	}
}
