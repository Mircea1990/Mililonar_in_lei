package ro.jademy.milionar;

import java.util.Scanner;

public class ViewImplementation implements View {

    private static final String INTRO_MSG = "Whelcome to the game! " +
            "Whant to be a millionare ?" + "There are 18 " +
            "questions you will have to answer, Good luck !";
    private static final String INTRO_MSG2 = " lets begin! You have a chance to " +
            "win ONE MILLION DOLLARS!!! \n\n\n\n\n";

    private static final Scanner scan = new Scanner(System.in);

    public void displayIntro(){
        String name = getUserName();
        displayOneLineMessage(INTRO_MSG + name + INTRO_MSG2);
    }

    public void displayQuestion(Question question){
        displayOneLineMessage(question.getQuestion());

    }

    public void diplayErrorMessage(String msg){
        displayOneLineMessage(msg);
    }

    public void displayOneLineMessage(String promtMessge){
        System.out.println(promtMessge);
    }



}
