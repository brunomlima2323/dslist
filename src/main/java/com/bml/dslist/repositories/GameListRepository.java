package com.bml.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bml.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
