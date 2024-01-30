package com.luisgustavo.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luisgustavo.gameList.dto.ListsDTO;
import com.luisgustavo.gameList.entities.GameList;
import com.luisgustavo.gameList.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<ListsDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<ListsDTO> dto = result.stream().map( x -> new ListsDTO(x)).toList();
        return dto;
    } 
}
