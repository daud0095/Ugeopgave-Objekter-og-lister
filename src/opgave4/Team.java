package opgave4;

import java.util.ArrayList;

public class Team {
    String teamName;
    ArrayList<Player> players;

    public Team(String teamName){
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p){
        players.add(p);
        System.out.println(p.name + " tilføjet til team" + teamName);
    }

    public void getAverageSkill(){

    }
}
