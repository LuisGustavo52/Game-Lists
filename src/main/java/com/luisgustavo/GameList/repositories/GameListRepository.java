package com.luisgustavo.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisgustavo.gameList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
