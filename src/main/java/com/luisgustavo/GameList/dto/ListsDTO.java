package com.luisgustavo.gameList.dto;

import org.springframework.beans.BeanUtils;

import com.luisgustavo.gameList.entities.GameList;

public class ListsDTO {
    private Long Id;
    private String name;

    public ListsDTO() {
    }

    public ListsDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
