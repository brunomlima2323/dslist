package com.bml.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bml.dslist.dto.GameMinDTO;
import com.bml.dslist.entities.Game;
import com.bml.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
