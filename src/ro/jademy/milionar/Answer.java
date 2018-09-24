package ro.jademy.milionar;

import java.util.Objects;

/**
 * This class represents the answer to a question
 */
public abstract class Answer {

    //answer
    //boolean
    private String text;
    private AnswerToken token;

    public boolean isCorrect(){
        return true;
    }


    //contructor for Answer object
    public Answer(){}

    public Answer(AnswerToken token, String text) {
        this.text = text;
        this.token = token;
    }

    public AnswerToken getToken() {
        return token;
    }

    public void setToken(AnswerToken token){
        this.token = token;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return Objects.equals(text, answer.text) &&
                token == answer.token;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, token);
    }
}
