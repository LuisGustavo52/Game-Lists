package com.luisgustavo.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisgustavo.gameList.entities.Game;
//import com.luisgustavo.gameList.dto.GameMinDTO;
import com.luisgustavo.gameList.repositories.GameRepository;

@Service // essa anotation regista a classe como um componente do sistema no framework
public class GameService {

    @Autowired //injeta uma instancia do gameRepository na classe, no nível do framework
    private GameRepository gameRepository;

    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
