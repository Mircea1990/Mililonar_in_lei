package ro.jademy.milionar;

public class Player {
    private String firstName, secondName;
    private int score;
    public Player(String firstName, String secondName, int score){
        this.firstName = firstName;
        this.secondName = secondName;
        this.score = score;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public int getScore(){return score ;}
}
