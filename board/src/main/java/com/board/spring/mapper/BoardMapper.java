package com.board.spring.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.board.spring.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	List<Map<String, Object>> list(BoardDTO boardDTO);
}
