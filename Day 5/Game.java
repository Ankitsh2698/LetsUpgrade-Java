package com.letsupgrade;

public class Game {

    Question[] questions = new Question[3];
    Player player= new Player();

    public void initGame(){

        for(int i=0;i<3;i++){
            questions[i]= new Question();
        }

        questions[0].question="Who is the Strongest Avenger ?";
        questions[0].option1="Iron Man";
        questions[0].option2="Spider Man";
        questions[0].option3="Thor";
        questions[0].option4="Wanda";
        questions[0].correctAnswer=1;

        questions[1].question="What is the closest planet to sun ?";
        questions[1].option1="Venus";
        questions[1].option2="Mercury";
        questions[1].option3="Earth";
        questions[1].option4="Jupiter";
        questions[1].correctAnswer=2;

        questions[2].question="What is the Capital of India ?";
        questions[2].option1="Delhi";
        questions[2].option2="Mumbai";
        questions[2].option3="Nashik";
        questions[2].option4="Kerala";
        questions[2].correctAnswer=1;


    }

    public void play(){

        player.getDetails();
        for (int i=0;i<3;i++){
            boolean status = questions[i].askQuestion();
            if (status==true){
                System.out.println("Correct");
                player.score++;
            }
            else {
                System.out.println("Wrong");
            }
        }

        System.out.println(player.name + " your score is "+ player.score);

    }
}
