public class Player {
    private String firstName;
    private String lastName;
    private int jerseyNumber;

    public Player(String fname, String lname, int number){  //생성자
        firstName=fname;
        lastName=lname;
        jerseyNumber=number;
    }
    public String getfname(){ return firstName;}
    public int getnumber(){ return jerseyNumber;}

    public boolean equals(Object obj) {
        if(obj instanceof Player){
            Player player=(Player)obj;
            return (this.firstName.equals(player.getfname()) && this.jerseyNumber == player.getnumber());
        }else
            return false;
    }
    public int hashCode(){
        return firstName.hashCode()+jerseyNumber;
    }
    public String toString(){
        return "["+firstName+", "+lastName+" "+jerseyNumber+"]";
    }
}
