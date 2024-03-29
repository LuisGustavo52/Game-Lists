package com.luisgustavo.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luisgustavo.gameList.dto.GameDTO;
import com.luisgustavo.gameList.dto.GameMinDTO;
import com.luisgustavo.gameList.entities.Game;
//import com.luisgustavo.gameList.dto.GameMinDTO;
import com.luisgustavo.gameList.repositories.GameRepository;

@Service // essa anotation regista a classe como um componente do sistema no framework
public class GameService {

    @Autowired //injeta uma instancia do gameRepository na classe, no nível do framework
    private GameRepository gameRepository;

     @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List <GameMinDTO> dto = result.stream().map( x -> new GameMinDTO(x)).toList();
        // utiliza o construtor de GameMinDTO e o método map para transformar cada Objeto Game x em um Objeto GameMinDTO, a partir da lista de games result
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findId(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto =  new GameDTO(result); 
        return dto;
    }
}
