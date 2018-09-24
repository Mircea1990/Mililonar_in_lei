package ro.jademy.milionar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Milionar {
    public static void main(String[] args) {

        //list answer for question 1
        List<Answer> answerListQ1 = new ArrayList<>();

        // answer for question 1
        Answer a1q1 = new Answer(AnswerToken.A, "Saint James");
        Answer a2q1 = new Answer(AnswerToken.B, "Saint Peter");
        Answer a3q1 = new Answer(AnswerToken.C, "Saint John");
        Answer a4q1 = new Answer(AnswerToken.D, "Saint Percy");
        answerListQ1.add(a1q1);
        answerListQ1.add(a2q1);
        answerListQ1.add(a3q1);
        answerListQ1.add(a4q1);

        // question 1 difficulty 1
        Question q1 = new Question("Who is the patron " +
                "saint of Spain? ", 1, answerListQ1);



        //list answer for question 2
        List<Answer> answerListQ2 = new ArrayList<>();

        // answer for question 1
        Answer a1q2 = new Answer(AnswerToken.A, "Moth");
        Answer a2q2 = new Answer(AnswerToken.B, "Cockroach");
        Answer a3q2 = new Answer(AnswerToken.C, "Fly");
        Answer a4q2 = new Answer(AnswerToken.D, "Beetle");
        answerListQ2.add(a1q2);
        answerListQ2.add(a2q2);
        answerListQ2.add(a3q2);
        answerListQ2.add(a4q2);

        // question 2 difficulty 1
        Question q2 = new Question("Which insect inspired the " +
                "term computer bug ?", 1, answerListQ2);



        //list answer for question 3
        List<Answer> answerListQ3 = new ArrayList<>();

        // answer for question 3
        Answer a1q3 = new Answer(AnswerToken.A, "Polka");
        Answer a2q3 = new Answer(AnswerToken.B, "Swing");
        Answer a3q3 = new Answer(AnswerToken.C, "Hora");
        Answer a4q3 = new Answer(AnswerToken.D, "Lambada");
        answerListQ3.add(a1q3);
        answerListQ3.add(a2q3);
        answerListQ3.add(a3q3);
        answerListQ3.add(a4q3);

        // question 3 difficulty 1
        Question q3 = new Question("Which of these dance names is used" +
                " to describe a fashionable dot?", 1, answerListQ3);


        //list answer for question 4
        List<Answer> answerListQ4 = new ArrayList<>();

        // answer for question 4
        Answer a1q4 = new Answer(AnswerToken.A, "Peru");
        Answer a2q4 = new Answer(AnswerToken.B, "India");
        Answer a3q4 = new Answer(AnswerToken.C, "Canada");
        Answer a4q4 = new Answer(AnswerToken.D, "Sweden");
        answerListQ4.add(a1q4);
        answerListQ4.add(a2q4);
        answerListQ4.add(a3q4);
        answerListQ4.add(a4q4);

        // question 4 difficulty 1
        Question q4 = new Question("In the children's book series, " +
                "where is Paddington Bear originally from?", 1, answerListQ4);



        //list answer for question 5
        List<Answer> answerListQ5 = new ArrayList<>();

        // answer for question 5
        Answer a1q5 = new Answer(AnswerToken.A, "Finding shapes in clouds ");
        Answer a2q5 = new Answer(AnswerToken.B, "Breaking glass with your voice ");
        Answer a3q5 = new Answer(AnswerToken.C, "Sleeping with your eyes open ");
        Answer a4q5 = new Answer(AnswerToken.D, "Doing yoga in a bathtub");
        answerListQ5.add(a1q5);
        answerListQ5.add(a2q5);
        answerListQ5.add(a3q5);
        answerListQ5.add(a4q5);

        // question 5 difficulty 1
        Question q5 = new Question("Nephelococcygia is " +
                "the practice of _____________________?", 1, answerListQ5);




        //list answer for question 6
        List<Answer> answerListQ6 = new ArrayList<>();

        // answer for question 6
        Answer a1q6 = new Answer(AnswerToken.A, "Beep! Beep! ");
        Answer a2q6 = new Answer(AnswerToken.B, "Vroom! Vroom! ");
        Answer a3q6 = new Answer(AnswerToken.C, "Ping! Ping! ");
        Answer a4q6 = new Answer(AnswerToken.D, "Ooga! Ooga!");
        answerListQ6.add(a1q6);
        answerListQ6.add(a2q6);
        answerListQ6.add(a3q6);
        answerListQ6.add(a4q6);

        // question 6 difficulty 2
        Question q6 = new Question("In the Road Runner and Coyote cartoons, " +
                "what famous sound does the Road Runner make?", 2, answerListQ6);



        //list answer for question 7
        List<Answer> answerListQ7 = new ArrayList<>();

        // answer for question 7
        Answer a1q7 = new Answer(AnswerToken.A, "Lesotho ");
        Answer a2q7 = new Answer(AnswerToken.B, "Luxembourg ");
        Answer a3q7 = new Answer(AnswerToken.C, "Burkina Faso ");
        Answer a4q7 = new Answer(AnswerToken.D, "Siberia");
        answerListQ7.add(a1q7);
        answerListQ7.add(a2q7);
        answerListQ7.add(a3q7);
        answerListQ7.add(a4q7);

        // question 7 difficulty 2
        Question q7 = new Question("Which landlocked country is " +
                "contained within another country?", 2, answerListQ7);




        //list answer for question 8
        List<Answer> answerListQ8 = new ArrayList<>();

        // answer for question 8
        Answer a1q8 = new Answer(AnswerToken.A, "Isaac Newton");
        Answer a2q8 = new Answer(AnswerToken.B, "Enrico Fermi");
        Answer a3q8 = new Answer(AnswerToken.C, "Albert Einstein");
        Answer a4q8 = new Answer(AnswerToken.D, "Niels Bohr");
        answerListQ8.add(a1q8);
        answerListQ8.add(a2q8);
        answerListQ8.add(a3q8);
        answerListQ8.add(a4q8);

        // question 8 difficulty 2
        Question q8 = new Question("Which man does NOT " +
                "have a chemical element named after him?", 2, answerListQ8);



        //list answer for question 9
        List<Answer> answerListQ9 = new ArrayList<>();

        // answer for question 9
        Answer a1q9 = new Answer(AnswerToken.A, "Baghdad");
        Answer a2q9 = new Answer(AnswerToken.B, "New Delhi");
        Answer a3q9 = new Answer(AnswerToken.C, "Cairo");
        Answer a4q9 = new Answer(AnswerToken.D, "Moscow");
        answerListQ9.add(a1q9);
        answerListQ9.add(a2q9);
        answerListQ9.add(a3q9);
        answerListQ9.add(a4q9);

        // question 9 difficulty 2
        Question q9 = new Question("The word tabby, " +
                "now used to refer to a cat, is derived from the" +
                " name of a district of which world capital?", 2, answerListQ9);



        //list answer for question 10
        List<Answer> answerListQ10 = new ArrayList<>();

        // answer for question 10
        Answer a1q10 = new Answer(AnswerToken.A, "Leg");
        Answer a2q10 = new Answer(AnswerToken.B, "Wing");
        Answer a3q10 = new Answer(AnswerToken.C, "Thigh");
        Answer a4q10 = new Answer(AnswerToken.D, "Breast");
        answerListQ10.add(a1q10);
        answerListQ10.add(a2q10);
        answerListQ10.add(a3q10);
        answerListQ10.add(a4q10);

        // question 10 difficulty 2
        Question q10 = new Question("Which part of a chicken " +
                "is commonly called the drumstick ?", 2, answerListQ10);



        //list answer for question 11
        List<Answer> answerListQ11 = new ArrayList<>();

        // answer for question 11
        Answer a1q11 = new Answer(AnswerToken.A, "Golda Meir");
        Answer a2q11 = new Answer(AnswerToken.B, "Benazir Bhutto");
        Answer a3q11 = new Answer(AnswerToken.C, "Indira Gandhi");
        Answer a4q11 = new Answer(AnswerToken.D, "Corazon Aquino");
        answerListQ11.add(a1q11);
        answerListQ11.add(a2q11);
        answerListQ11.add(a3q11);
        answerListQ11.add(a4q11);

        // question 11 difficulty 3
        Question q11 = new Question("Who was inducted into the Colorado" +
                " Women’s Hall of Fame because It was in Denver that she " +
                "discovered Zionism ?", 3, answerListQ11);




        //list answer for question 12
        List<Answer> answerListQ12 = new ArrayList<>();

        // answer for question 12
        Answer a1q12 = new Answer(AnswerToken.A, "Hannah Montana: The Movie");
        Answer a2q12 = new Answer(AnswerToken.B, "Sherlock Holmes");
        Answer a3q12 = new Answer(AnswerToken.C, "Tyler Perry’s Madea Goes to Jail");
        Answer a4q12 = new Answer(AnswerToken.D, "Paul Blart: Mall Cop");
        answerListQ12.add(a1q12);
        answerListQ12.add(a2q12);
        answerListQ12.add(a3q12);
        answerListQ12.add(a4q12);

        // question 12 difficulty 3
        Question q12 = new Question("Which of these 2009 movies " +
                "is directed by the person whose name appears in " +
                "its title?", 3, answerListQ12);




        //list answer for question 13
        List<Answer> answerListQ13 = new ArrayList<>();

        // answer for question 13
        Answer a1q13 = new Answer(AnswerToken.A, "The Stop Puck Committee");
        Answer a2q13 = new Answer(AnswerToken.B, "The Stop Ahab Committee");
        Answer a3q13 = new Answer(AnswerToken.C, "The Stop Gatsby Committee");
        Answer a4q13 = new Answer(AnswerToken.D, "The Stop Crusoe Committee");
        answerListQ13.add(a1q13);
        answerListQ13.add(a2q13);
        answerListQ13.add(a3q13);
        answerListQ13.add(a4q13);

        // question 13 difficulty 3
        Question q13 = new Question("In the 1970s, the founding members of " +
                "Greenpeace established a famous anti-whaling group with what " +
                "literature-inspired name?", 3, answerListQ13);



        //list answer for question 14
        List<Answer> answerListQ14 = new ArrayList<>();

        // answer for question 14
        Answer a1q14 = new Answer(AnswerToken.A, "Elmo");
        Answer a2q14 = new Answer(AnswerToken.B, "Big Bird");
        Answer a3q14 = new Answer(AnswerToken.C, "Oscar");
        Answer a4q14 = new Answer(AnswerToken.D, "Ernie");
        answerListQ14.add(a1q14);
        answerListQ14.add(a2q14);
        answerListQ14.add(a3q14);
        answerListQ14.add(a4q14);

        // question 14 difficulty 3
        Question q14 = new Question("Which Sesame Street character is " +
                "also known as The Grouch?", 3, answerListQ14);



        //list answer for question 15
        List<Answer> answerListQ15 = new ArrayList<>();

        // answer for question 15
        Answer a1q15 = new Answer(AnswerToken.A, "Al Pacino");
        Answer a2q15 = new Answer(AnswerToken.B, "Kirk Douglas");
        Answer a3q15 = new Answer(AnswerToken.C, "Jack Nicholson");
        Answer a4q15 = new Answer(AnswerToken.D, "Michael Douglas");
        answerListQ15.add(a1q15);
        answerListQ15.add(a2q15);
        answerListQ15.add(a3q15);
        answerListQ15.add(a4q15);

        // question 15 difficulty 4
        Question q15 = new Question("In the movie " +
                "Wall Street, which famous actor played the " +
                "character Gordon Gekko?", 4, answerListQ15);



        //list answer for question 16
        List<Answer> answerListQ16 = new ArrayList<>();

        // answer for question 16
        Answer a1q16 = new Answer(AnswerToken.A, "Australian");
        Answer a2q16 = new Answer(AnswerToken.B, "American");
        Answer a3q16 = new Answer(AnswerToken.C, "English");
        Answer a4q16 = new Answer(AnswerToken.D, "Irish");
        answerListQ16.add(a1q16);
        answerListQ16.add(a2q16);
        answerListQ16.add(a3q16);
        answerListQ16.add(a4q16);

        // question 16 difficulty 4
        Question q16 = new Question("What nationality is tennis" +
                " player Lleyton Hewitt?", 4, answerListQ16);



        //list answer for question 17
        List<Answer> answerListQ17 = new ArrayList<>();

        // answer for question 17
        Answer a1q17 = new Answer(AnswerToken.A, "Golda Meir");
        Answer a2q17 = new Answer(AnswerToken.B, "Benazir Bhutto");
        Answer a3q17 = new Answer(AnswerToken.C, "Indira Gandhi");
        Answer a4q17 = new Answer(AnswerToken.D, "Corazon Aquino");
        answerListQ17.add(a1q17);
        answerListQ17.add(a2q17);
        answerListQ17.add(a3q17);
        answerListQ17.add(a4q17);

        // question 17 difficulty 4
        Question q17 = new Question("Who was inducted into the Colorado" +
                " Women’s Hall of Fame because " +
                "It was in Denver that she discovered Zionism ?", 4, answerListQ17);



        //list answer for question 18
        List<Answer> answerListQ18 = new ArrayList<>();

        // answer for question 18
        Answer a1q18 = new Answer(AnswerToken.A, "Czar Nicholas II");
        Answer a2q18 = new Answer(AnswerToken.B, "Archduke Franz Ferdinand");
        Answer a3q18 = new Answer(AnswerToken.C, "Kaiser Wilhelm II");
        Answer a4q18 = new Answer(AnswerToken.D, "Vladimir Lenin");
        answerListQ18.add(a1q18);
        answerListQ18.add(a2q18);
        answerListQ18.add(a3q18);
        answerListQ18.add(a4q18);

        // question 18 difficulty 5
        Question q18 = new Question("Some surmise that Annie Oakley " +
                "could have changed the course of WWI if she had missed " +
                "shooting the ashes off a cigarette in whose mouth?", 5, answerListQ18);





        //List nr 1 of questions level 1
        List<Question> questionListLevel1 = new ArrayList<>();
        questionListLevel1.add(q1);
        questionListLevel1.add(q2);
        questionListLevel1.add(q3);
        questionListLevel1.add(q4);
        questionListLevel1.add(q5);

        //List nr 2 of questions level 2
        List<Question> questionListLevel2 = new ArrayList<>();
        questionListLevel2.add(q6);
        questionListLevel2.add(q7);
        questionListLevel2.add(q8);
        questionListLevel2.add(q9);
        questionListLevel2.add(q10);

        //List nr 3 of questions level 3
        List<Question> questionListLevel3 = new ArrayList<>();
        questionListLevel3.add(q11);
        questionListLevel3.add(q12);
        questionListLevel3.add(q13);
        questionListLevel3.add(q14);

        //List nr 4 of questions Level 4
        List<Question> questionListLevel4 = new ArrayList<>();
        questionListLevel4.add(q15);
        questionListLevel4.add(q16);
        questionListLevel4.add(q17);

        //List nr 5 of questions Level 5
        List<Question> questionListLevel5 = new ArrayList<>();
        questionListLevel5.add(q15);



        System.out.println();
        System.out.print("Whelcome to Whant to be a millionare !");
        System.out.println("Please enter your name");


        Scanner scan = new Scanner(System.in);
        String fName = scan.next();
        System.out.println(fName + " is playing th game !");




    }
}