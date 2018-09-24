package ro.jademy.milionar;

/**
 * this class represents the user's response(choice) to a question
 * witch can be either a HelpOption or a one of
 * the answers(answerToken)
 */
public class UserResponse {

    private AnswerToken answerToken;
    private HelpOptions helpOptions;

    public UserResponse(){}

    public UserResponse(AnswerToken answerToken, HelpOptions helpOptions){
        this.answerToken = answerToken;
        this.helpOptions = helpOptions;
    }
    public AnswerToken getAnswerToken(){
        return answerToken;
    }

    public void setAnswerToken(AnswerToken answerToken){
        this.answerToken = answerToken;
    }

    public HelpOptions getHelpOptions(){
        return helpOptions;
    }

    public void setHelpOptions(HelpOptions helpOptions){
        this.helpOptions = helpOptions;
    }
}
