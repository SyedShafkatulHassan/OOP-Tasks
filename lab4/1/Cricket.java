
public class Cricket extends Sports{
    int over;
    String matchType;
    Player p;
    Cricket(String matchType, int over, String name, int jersey){
        this.matchType = matchType;
        this.over = over;
        p = new Player(name,jersey);
    }
    void display(){
        System.out.println("Match Type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of a player: "+p.playerName);
        System.out.println("Jersey number of a player: "+p.jerseyNumber);
    }
}