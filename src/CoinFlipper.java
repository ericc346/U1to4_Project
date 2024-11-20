import java.util.Arrays;
import java.util.ArrayList;

public class CoinFlipper {
    private String[] hort;

    public CoinFlipper()
    {

    }
    public String[] flipCoin(int flipNumber){
        hort = new String[flipNumber];

        for(int i = 0; i < flipNumber; i++){
            String ht;
            int random = (int)(Math.random()*2) +1;
            if(!(random == 1)){
                ht = "tails";
            }
            else{
                ht = "heads";
            }
            hort[i] = ht;
        }
        return hort;
    }

    public int getScore(String[] coinFlips, String[] userPredicts){
        int score = 0;
        for(int i = 0; i < coinFlips.length; i++){
            if(coinFlips[i].equals(userPredicts[i])){
                int random = (int) (Math.random()*10)+1;
                score += random;
            }
            else{
                score --;
            }

        }
        return score;
    }
    public String toString(String name, int score){
        return name + " has a score of " + score;
    }

    public void winner(String name, String nameTwo, int score, int otherScore){
        System.out.println("Surprise! There's bonus points!");
        System.out.println("For each letter in your name, you get one point extra!");
        score += name.length();
        otherScore += nameTwo.length();
        if(score > otherScore){
            System.out.println("The Winner is " + name + " with the score of " + score);
        }
        if(otherScore > score){
            System.out.println("The Winner is " + nameTwo + " with the score of " + otherScore);
        }
        if (otherScore == score){
            System.out.println("No one wins! Both of you don't win");
        }
        if (otherScore == score && name.equalsIgnoreCase(nameTwo)){
            System.out.println("No one wins! At least you have the same name");
        }
    }
    public void coins(){
        System.out.println(Arrays.toString(hort));
    }
}
