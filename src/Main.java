import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int flips;

        Scanner askNumber = new Scanner(System.in);
        Scanner askName = new Scanner(System.in);
        Scanner askPredict = new Scanner(System.in);    // make it simpler to know which Scanner

        System.out.print("Enter number of coin you want to flip: ");
        flips = Integer.parseInt(askNumber.nextLine());                //number of coin flips
        System.out.println();

        System.out.print("Enter player one name: ");
        String playerOne = askName.nextLine();                        //names player one and two
        System.out.print("Enter player two number: ");
        String playerTwo = askName.nextLine();

        CoinFlipper help = new CoinFlipper(playerOne, playerTwo);
        String[] cars = help.flipCoin(flips);                       //creates the array for the coin flips
        String[] userPredict = new String[flips];

        System.out.println();
        help.playerOne();                                       // prints Player one turn

        for(int i = 0; i < flips ; i++){
            System.out.println();
            System.out.println("-------------");
            System.out.println("Current Coin Number: " + (i+1));
            System.out.print("Enter a heads or tails for coin number " + (i +1) +": ");     //ask for player one prediction
            String prediction = askPredict.nextLine();
            userPredict[i] = prediction.toLowerCase();                                      //puts in it an array

        }

        int score = (help.getScore(cars,userPredict));                      //assign player one score to score

        System.out.println();
        System.out.println();
        System.out.println();
        help.playerTwo();                                                       // prints Player two turn

        for(int i = 0; i < flips ; i++){
            System.out.println();
            System.out.println("-------------");
            System.out.println("Current Coin Number: " + (i+1));
            System.out.print("Enter a heads or tails for coin number " + (i +1) +": ");
            String prediction = askPredict.nextLine();                                  //ask for player two prediction
            userPredict[i] = prediction.toLowerCase();                                    //puts in it an array

        }

        System.out.println();
        System.out.println("Player 1:" + help.toString(playerOne,score));
        int scoreTwo = (help.getScore(cars,userPredict));             //assign player two score to scoreTwo

        System.out.println("Player 2:" + help.toString(playerTwo,scoreTwo));
        System.out.println();

        help.winner(playerOne,playerTwo,score,scoreTwo);                // prints out winner
        System.out.println();

        help.player(score,scoreTwo);                                    // print out final score
        help.coins();

        System.out.println();
        boolean gameEnd = true;
        help.gameCelebration(gameEnd);                                  // prints out game end celebration 5 times

    }
}