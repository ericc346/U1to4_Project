import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int flips;
        Scanner askNumber = new Scanner(System.in);
        Scanner askName = new Scanner(System.in);
        Scanner askPredict= new Scanner(System.in);
        System.out.print("Enter number of coin you want to flip: ");
        flips = Integer.parseInt(askNumber.nextLine());


        CoinFlipper help = new CoinFlipper();
        String[] cars = help.flipCoin(flips);
        String[] userPredict = new String[flips];
        System.out.print("Enter player one name: ");
        String playerOne = askName.nextLine();
        for(int i = 0; i < flips ; i++){
            System.out.println();
            System.out.println("-------------");
            System.out.println("Current Coin Number: " + (i+1));
            System.out.print("Enter a heads or tails for coin number " + (i +1) +": ");
            String prediction = askPredict.nextLine();
            userPredict[i] = prediction.toLowerCase();

        }
        int score = (help.getScore(cars,userPredict));
        System.out.println();
        System.out.println(help.toString(playerOne,score));
        System.out.println();
        System.out.println();
        System.out.print("Enter player two number: ");
        String playerTwo = askName.nextLine();

        for(int i = 0; i < flips ; i++){
            System.out.println();
            System.out.println("-------------");
            System.out.println("Current Coin Number: " + (i+1));
            System.out.print("Enter a heads or tails for coin number " + (i +1) +": ");
            String prediction = askPredict.nextLine();
            userPredict[i] = prediction.toLowerCase();

        }
        int scoreTwo = (help.getScore(cars,userPredict));
        System.out.println(help.toString(playerTwo,scoreTwo));
        System.out.println();
        help.winner(playerOne,playerTwo,score,scoreTwo);
    }
}