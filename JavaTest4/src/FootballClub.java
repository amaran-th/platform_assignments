import java.util.ArrayList;

public class FootballClub {
    private String name;
    private final int maxSquadSize=25;

    private ArrayList<Player> squad=new ArrayList<Player>();

    public FootballClub(String str){        //생성자
        name=str;
    }

    public void addPlayer(Player newbi){
        squad.add(newbi);
    }
    public void removeAllPlayer(){
        squad.clear();
    }

    public final Player findPlayer(String fname, int number){
        for(int i=0;i<squad.size();i++) {
            if (squad.get(i).equals(new Player(fname, null, number))) {
                return squad.get(i);
            }

        }
        return null;
    }

    public String toString(){
        String msg="FootballClub Name: "+name+" Player Count: "+squad.size()+"\n";
        for(int i=0;i<squad.size();i++){
            msg+="\t"+squad.get(i)+"\n";
        }
        return msg;
    }

}
