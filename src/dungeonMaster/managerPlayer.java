package dungeonMaster;
import java.util.ArrayList;

public class managerPlayer {
    private List<Characer> players;
}

public managerPlayer(){
    players = new ArrayList();
}

private void joinPlayer(Character Player){
    players.add(Player);
}