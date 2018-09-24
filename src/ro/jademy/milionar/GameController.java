package ro.jademy.milionar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameController {
    //questions
    //Level
    //start/answer
    //50/50

    public static Random random = new Random();

    public static boolean isInputValid (Question question, AnswerToken answerToken){
        if
        return true;
    }

    public static int currentLevel = 1;
    private List<Question> questionList = new ArrayList<>();

    public GameController(List<Question> questionList){
        this.questionList = questionList;
    }

    public void start(){
        // initializam intrebarile si jocul


    }
    public void askQuestion(){
        // show question on screen
    }
    public void answerQuestion(){
        //get user input and check if correct
    }
    public void fiftyFifty(){
        //show the same question but only with 2 possible answer
    }


}
