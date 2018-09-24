package ro.jademy.milionar;

public enum HelpOptions {

    /**
     * This Class represent all the possible options
     * and their textual representation
     * for user
     */
    FIFTY_FIFTY ("50/50"),
    ASK_PUBLIC ("Ask the public"),
    CALL_A_FRIEND ("Call a friend");

    private String text;

    HelpOptions(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}
