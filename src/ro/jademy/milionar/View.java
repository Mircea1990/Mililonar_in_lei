package ro.jademy.milionar;

import java.util.List;

/**
        Patterns for different display methods
 */
public interface View {
     void diplayErrorMessage(String message);

     void displayIntro(String message);

     void displayQuestion(Question question);

     void displayAnswer(Answer answer);

     void diplayHelpOptions(List<HelpOptions> helpOptions);

     void displayCallFriendResult();

     void displayFifthyFifthy();

     void displayAskPublic();

     void displayOneLineMessage(String promptMessage);

     UserResponse displayUserResponseToQuestion(List<HelpOptions> helpOptions);

     boolean getIsFinalAnswer();

     String getUserName();

     void closeOpenResourses();

     Score displayScore();



}
