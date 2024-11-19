import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int flips;
        Scanner askNumber = new Scanner(System.in);
        System.out.print("Enter a number: ");
        flips = Integer.parseInt(askNumber.nextLine());
        CoinFlipper help = new CoinFlipper();
        System.out.println(Arrays.toString(help.flipCoin(flips)));

    }
}