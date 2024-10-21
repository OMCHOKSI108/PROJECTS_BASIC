import java.util.Scanner;

public class Numberguess{

    public static void game() {
        Scanner sc = new Scanner(System.in);
        int num = 1 + (int)(100 * Math.random());
        int t = 5, g, i;

        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");

        for (i = 0; i < t; i++) {
            System.out.println("Guess the number:");
            g = sc.nextInt();

            if (num == g) {
                System.out.println("Congrats! You guessed the number.");
                break;
            } else if (num > g && i != t - 1) {
                System.out.println("The number is greater than " + g);
            } else if (num < g && i != t - 1) {
                System.out.println("The number is less than " + g);
            }
        }

        if (i == t) {
            System.out.println("You have exhausted your trials.");
            System.out.println("The number was " + num);
        }
    }

    public static void main(String arg[]) {
        game();
    }
}
