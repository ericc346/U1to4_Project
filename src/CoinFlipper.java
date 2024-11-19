import java.util.Arrays;
import java.util.ArrayList;

public class CoinFlipper {

    public CoinFlipper()
    {
        String start = "Please enter how much coin flips you would want to predict.";
    }
    public String[] flipCoin(int flipNumber){
        String[] hort = new String[flipNumber];

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

    public int getScore(String[] hort, String[] userPredicts){
        int score = 0;
        for(int i = 0; i < hort.length; i++){
            if(hort[i].equals(userPredicts[i])){
                int random = (int) (Math.random()*10)+1;
                score += random;
            }
            else{
                score --;
            }

        }
        return score;
    }
}
