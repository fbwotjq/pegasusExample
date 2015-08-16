package com.fbwotjq.example.board.free;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fbwotjq.example.mapper.FreeBoardMapper;

@Service
public class FreeBoardServiceImpl implements FreeBoardService {

	@Autowired FreeBoardMapper freeBoardMapper;
	
}
