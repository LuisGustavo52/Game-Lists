package com.luisgustavo.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisgustavo.gameList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    
}
