package mainPackage;

public class Game {

    private int roll =0;
    private int[] rolls= new int[21];

    public void roll(int pins){
        rolls[roll++] = pins;

    }

    public int getScore(){
        int score  = 0;
        int pointer = 0;
        for(int frame =0; frame < 10; frame++){
            int currentFrame = rolls[pointer] + rolls[pointer+1];
            if(rolls[pointer] == 10){
                score+=10 + rolls[pointer+2] + rolls[pointer+3];
                pointer++;
            } else {
                if(currentFrame == 10){
                    score+= 10 + rolls[pointer+2];
                } else {
                    score += currentFrame;
                }
                pointer+=2;
            }


        }




        return score;

    }
}
