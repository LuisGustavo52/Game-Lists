package com.luisgustavo.gameList.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.luisgustavo.gameList.dto.ListsDTO;
import com.luisgustavo.gameList.services.GameListService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "lists")
public class ListController {
    
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<ListsDTO> findAll(){
        List<ListsDTO> result = gameListService.findAll();
        return result;
    }
}
