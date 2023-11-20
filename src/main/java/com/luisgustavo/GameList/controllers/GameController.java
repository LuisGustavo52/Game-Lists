package com.luisgustavo.gameList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisgustavo.gameList.entities.Game;
import com.luisgustavo.gameList.services.GameService;

@RestController // Configura a classe como um controlador REST
@RequestMapping(value = "/games") //Mapeia o recurso que será chamado na API, com um caminho
public class GameController {
    
    @Autowired //injeta uma instancia do gameService na classe, no nível do framework
    private GameService gameService;

    @GetMapping //Mapeia a função como o retorno do método GET do protocolo HTTP
    public List<Game> findAll(){
        List <Game> result = gameService.findAll();
        return result;
    }
}
