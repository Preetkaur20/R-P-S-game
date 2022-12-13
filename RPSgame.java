import java.util.Random;
import java.util.Scanner;

public class RPSgame {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int comp_choice = r.nextInt(3);

        System.out.println("0 --> Rock\t 1 --> Paper\t 2 --> Scissor ");
        System.out.println("Computer Choose : " + comp_choice);
        System.out.print("What You Choose :");
        int user_choice = s.nextInt();
        System.out.println("You choose : " + user_choice);

        if (comp_choice == user_choice) {
            System.out.println("Draw");
        } else if (comp_choice == 0) {
            if (user_choice == 1) {
                System.out.println("You won");
            } else if (user_choice == 2) {
                System.out.println("Computer won");
            } else if (comp_choice == 1) {
                if (user_choice == 0) {
                    System.out.println("Computer won");
                } else if (user_choice == 2) {
                    System.out.println("You won");
                }
            } else if (comp_choice == 2) {
                if (user_choice == 0) {
                    System.out.println("You won");
                } else if (user_choice == 1) {
                    System.out.println("Computer won");
                }
            }

        }

    }
}
