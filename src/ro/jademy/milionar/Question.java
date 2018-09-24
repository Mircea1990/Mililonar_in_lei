package ro.jademy.milionar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question {
    //questions
    //difficulty
    //list of answer

    public static final int MAX_LEVEL = 15;

    private String question;
    private AnswerToken correctAnswer;
    private int difficultyLevel;
    private List<Answer> answerList;

    //default contructor
    public Question() {
    }

    //constructor for question object
    public Question(String question, AnswerToken correctAnswer,
                    int difficultyLevel, List<Answer> answerList) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.difficultyLevel = difficultyLevel;
        this.answerList = answerList;
    }

    /**
     * @return noDuplicateToken returns a non duplicate token
     */
    public Set<AnswerToken> getNoDuplicateToken() {
        Set<AnswerToken> noDuplicateToken = new HashSet<>();
        for (Answer answer : answerList) {
            noDuplicateToken.add(answer.getToken());
        }
        return noDuplicateToken;
    }

    public String getQuestion() {

        return question;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

}

