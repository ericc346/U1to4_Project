import java.util.Arrays;

public class CoinFlipper {

    private String[] hort;
    private final String  playerOne;
    private final String playerTwo;


    public CoinFlipper(String playerOne, String playerTwo) //constructor with parameters
    {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String[] flipCoin(int flipNumber) // creates an array with the coin flipped based on user inputted number
    {
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

    public int getScore(String[] coinFlips, String[] userPredicts)  //checks if index of the user predicts array
                                                                    // equal coin flip array assign points randomly
                                                                    // adds points to the score return score
    {
        int score = 0;
        for(int i = 0; i < coinFlips.length; i++){
            if(coinFlips[i].equals(userPredicts[i])){                   // if user predict matches coin flip
                int random = (int) (Math.random()*10)+1;                // int that is 1 to 10
                score += random;                                        // add int to score
            }
            else{
                score --;
            }

        }
        return score;
    }

    public String toString(String name, int score){
        return name + " has a score of " + score;                           // returns String
    }

    public void winner(String name, String nameTwo, int score, int otherScore) //prints winner
    {
        System.out.println("Surprise! There's bonus points!");
        System.out.println("For each letter in your name, you get 1 point extra!");
        score += name.length();
        otherScore += nameTwo.length();
        if(score > otherScore){
            System.out.println("The Winner is " + name + " with the score of " + score); //score bigger than other Score
        }
        if(otherScore > score){
            System.out.println("The Winner is " + nameTwo + " with the score of " + otherScore); //opposite
        }
        if (otherScore == score && !(name.equalsIgnoreCase(nameTwo))){  //tie
            System.out.println("No one wins! Both of you don't win");
        }
        if (otherScore == score && name.equalsIgnoreCase(nameTwo)){     //tie and player1 and player2 same name
            System.out.println("No one wins! At least you have the same name");
        }
    }

    public void coins() //print the coin flipped array
    {
        System.out.println("Correct Prediction: " + Arrays.toString(hort));  // turns array into string
    }

    public void player(int score, int scoreTwo) //prints final score with player name
    {
        System.out.println("Player 1: " + playerOne +" has score of " + (score + playerOne.length()));
        System.out.println("Player 2: " + playerTwo +" has score of " + (scoreTwo + playerOne.length()));
    }

    public void playerOne() //prints player one turn
    {
        System.out.print("Player One Turn:");
    }

    public void playerTwo(){
        System.out.print("Player Two Turn:");
    } //prints Player two turn

    public void gameCelebration(boolean gameEnd) //game end sequence
    {
        int i = 0;
        while(gameEnd) {
            i++;
            System.out.println("!!!!!!!!!!!!!!!!!!!!!Game Over!!!!!!!!!!!!!!!!!!!!!!");
            if(i > 5) {                                                 //once i is greater than 5 the  while loop stops
                gameEnd = false;
            }
        }
    }
}
