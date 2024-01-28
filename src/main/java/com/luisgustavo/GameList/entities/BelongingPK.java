package com.luisgustavo.gameList.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;
    
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;    

    public BelongingPK(GameList list, Game game) {
        this.list = list;
        this.game = game;
    }

    public BelongingPK() {
    }

    public GameList getGameList() {
        return list;
    }
    public void setGameList(GameList list) {
        this.list = list;
    }
    public Game getGame() {
        return game;
    }
    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((list == null) ? 0 : list.hashCode());
        result = prime * result + ((game == null) ? 0 : game.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPK other = (BelongingPK) obj;
        if (list == null) {
            if (other.list != null)
                return false;
        } else if (!list.equals(other.list))
            return false;
        if (game == null) {
            if (other.game != null)
                return false;
        } else if (!game.equals(other.game))
            return false;
        return true;
    }

        
}
