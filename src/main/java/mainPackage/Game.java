package mainPackage;

public class Game {

    private int roll =0;
    private int[] rolls= new int[21];

    public void roll(int pins){
        rolls[roll++] = pins;
    }

    public int getScore() {
        int score =0;
        for(int i =0;i < 21; i++){
            score += rolls[i];
        }
        return score;
    }

}
