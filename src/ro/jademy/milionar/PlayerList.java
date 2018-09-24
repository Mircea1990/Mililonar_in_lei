package ro.jademy.milionar;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {
    private List<Player> playerList = new ArrayList<>();

    public boolean addPlayer(Player pList){
        playerList.add(pList);
        return true;
    }



}
