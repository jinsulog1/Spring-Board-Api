package com.board.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.spring.dto.BoardDTO;

@Mapper
public interface BoardMapper {

	List<BoardDTO> findAll();
}
