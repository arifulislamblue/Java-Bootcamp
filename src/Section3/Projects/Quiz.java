package Section3.Projects;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Who is the boy?");
        System.out.println("\ta) Ariful\n\tb) Sajal\n\tc) Sazib \n\td Mominul");
        String answer1 = scanner.nextLine();

        System.out.println("2. Who is the boy?");
        System.out.println("\ta) Ariful\n\tb) Sajal\n\tc) Sazib \n\td Mominul");
        String answer2 = scanner.nextLine();

        System.out.println("3. Who is the boy?");
        System.out.println("\ta) Ariful\n\tb) Sajal\n\tc) Sazib \n\td Mominul");
        String answer3 = scanner.nextLine();

        System.out.println("4. Who is the boy?");
        System.out.println("\ta) Ariful\n\tb) Sajal\n\tc) Sazib \n\td Mominul");
        String answer4 = scanner.nextLine();
        int score = 0;

        if (answer1.equals("a")) {
            score += 5;
        }
        if (answer2.equals("a")) {
            score += 5;
        }
        if (answer3.equals("a")) {
            score += 5;
        }
        if (answer4.equals("a") || answer4.equals("b")) {
            score += 5;
        }
        System.out.println("Your final score is:" + score);

        if (score >= 15) {
            System.out.println("Wow! You passed!");
        } else if (score >= 5 || score < 15) {
            System.out.println("Not bad");
        } else {
            System.out.println("Try next time, please.");
        }


    }
}
