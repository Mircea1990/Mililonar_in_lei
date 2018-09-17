package ro.jademy.milionar;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    //questions
    //difficulty
    //list of answer

    public static final int MAX_LEVEL = 15;

    public String question;
    public int difficultyLevel; //max 15
    public List <Anwers> answerList = new ArrayList<>();

    public Anwers getCorrectAnser(){
        for (Anwers answer : answerList){
            if(answer.iscorrect){
                return answer;
            }
        }
        return null;
    }


}
