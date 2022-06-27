package Section4.Projects;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {

        /*
         * We have added a scanner
         * Printed first message so that user can understand
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play Quiz Game.");

        /*
         * In this section, we have scanned few variables where we collected user information
         * For example:
         * 1. Prints: Name
         * 1. Prints: Age
         * 1. Prints: Interest
         */

        System.out.println("Share your information,please.");
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("My name is: " + name);

        System.out.println("\nWhat's your age?");
        int age = scanner.nextInt();
        System.out.println("I'm " + age + " years old.");
        scanner.nextLine();

        System.out.println("\nWrite 'yes' If you are interested.");
        String interest = scanner.nextLine();
        System.out.println(interest + ", I'm interested.");



        /*
         We declared few methods
         * 1. method: "favorite-color"
         * 2. method: "color"
         * 3. method: "gender"
         */

        String gender = null;
        String favoriteColor = null;


        int score = 0;
        if (interest.equals("yes")) {
            System.out.println("""
                                            
                    Chose your gender,please.
                    \t 1. male\s
                    \t 2. female\s
                    \t 3. others\s""");
            gender = scanner.nextLine();
            System.out.println("I'm " + gender + ".");

            /*
             * In this section, we have asked few basic question using scanner
             */

            System.out.println("\nIf you like BLUE color, write 'yes',please.");
            favoriteColor = scanner.nextLine();
            System.out.println(favoriteColor + ", I like blue.");
            if (favoriteColor.equals("yes")) {
                System.out.println("""

                         Great! Chose any color,please.
                        \t 1. blue\s
                        \t 2. sky blue\s
                        \t 3. navy blue\s""");
                favoriteColor = scanner.nextLine();
                System.out.println("My favorite color is " + favoriteColor + ".");

                /*
                 * In this section, we asked users that he or she is interested or not!
                 * We applied an if statements to ask multiple questions
                 */

                System.out.println("\nAre you ready to play quiz? Write 'yes',please.");
                String quiz = scanner.nextLine();
                System.out.println(quiz + ", I'm ready to play.");

                /*
                 * First question
                 * We used scanner to know the input and match the output
                 */

                if (quiz.equals("yes")) {
                    System.out.println("\n1.Who is making this quiz app?");
                    System.out.println("\ta) Ariful\n\tb) Sajal\n\tc) Sazib \n\td Mominul");
                    String answer1 = scanner.nextLine();
                    System.out.println(answer1 + " is making this quiz app.");
                    System.out.println("I know and strongly believe that " + answer1 + " will be Software Engineer at " + "Google soon.");

                    /*
                     * Second question
                     * We used scanner to know the input and match the output
                     */
                    System.out.println("\n2. Who likes blue?");
                    System.out.println("\ta) Ariful\n\tb) Sajal\n\tc) Sazib \n\td Mominul");
                    String answer2 = scanner.nextLine();
                    System.out.println(answer2 + " likes blue.");

                    /*
                     * Third question
                     * We used scanner to know the input and match the output
                     */

                    System.out.println("\n3. What makes blue cheese blue?");
                    System.out.println("\ta) mold \n\tb) milk from bluish cows \n\tc) food coloring \n\td sugar");
                    String answer3 = scanner.nextLine();
                    System.out.println("I'm sure the answer is " + answer3 + ".");

                    /*
                     * Forth question
                     * We used scanner to know the input and match the output
                     */

                    System.out.println("\n4. What is the name of the U.S. Navy's aerial stunt team?");
                    System.out.println("\ta) Blue Thunder \n\tb) Bluebirds \n\tc) Blue Eagles \n\td Blue Angels");
                    String answer4 = scanner.nextLine();
                    System.out.println(answer4 + " is the name of U.S. Navy's aerial stunt team.");

                    /*
                     * Fifth question
                     * We used scanner to know the input and match the output
                     */

                    System.out.println("\n5. In popular music culture, the color blue is said to represent which " + "following emotions?");
                    System.out.println("\ta) envy \n\tb) embarrassment \n\tc) fear \n\td sadness");
                    String answer5 = scanner.nextLine();
                    System.out.println("The color blue is represent " + answer5 + ".");

                    /*
                     * We reassigned local variable
                     * Used int variable to find the right answer and know the result
                     * Initialized 'score' variable to '0' so that we can add scores
                     * In the last of this part, we added all the right and wrong answers and printed result three ways
                     * if (score >= 15) printed: Congratulations and added the name scanned by user
                     * else if (score >= 5 || score < 15)  printed:'Not bad'
                     *  else: 'Try next time,please'
                     *
                     */

                    if (answer1.equals("a") || answer1.equals("Ariful")) {
                        score += 5;
                    }
                    if (answer2.equals("a") || answer2.equals("Ariful")) {
                        score += 5;
                    }
                    if (answer3.equals("a") || answer3.equals("mold")) {
                        score += 5;
                    }
                    if (answer4.equals("a") || answer4.equals("Blue Thunder")) {
                        score += 5;
                    }
                    if (answer5.equals("a") || answer5.equals("envy")) {
                        score += 5;
                    }

                    System.out.println("Your final score is: " + score + "/25");

                    if (score >= 15) {
                        System.out.println("Wow! You passed! Congratulations to you " + name + "!");

                    } else {
                        System.out.println("Not bad");
                    }
                }
            }

        } else {
            System.out.println("Chose the right option, please");
        }

        /*
         * In this section, we added all the important information then provided
         */

        System.out.println("\nHere are the details:");
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your gender: " + gender);
        System.out.println("Your favorite color: " + favoriteColor);
        System.out.println(score);
    }

    /**
     * @param gender = We added gender method option using switch statement
     * @return = Return the value that user input
     */

    public static String gender(String gender) {
        double randomNumber = Math.random() * 1;
        int integer = (int) randomNumber;
        return switch (integer) {
            case 1 -> "male";
            case 2 -> "female";
            case 3 -> "other";
            default -> "";
        };

    }

    /**
     * @return = Return the value that user input
     */

    public static String favoriteColor() {
        double randomNumber = Math.random() * 1;
        int integer = (int) randomNumber;
        return switch (integer) {
            case 1 -> "blue";
            case 2 -> "sky blue";
            case 3 -> "navy blue";
            default -> "";
        };
    }
}