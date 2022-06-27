package Section3.Projects;

import java.util.Scanner;

public class DealershipApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = scanner.nextLine();
        switch (option) {
            case "a":
                System.out.println("What's your budget?");
                int budget= scanner.nextInt();
                if (budget >= 2499999) {
                    System.out.println("Great! Toyota Prius Blue car is available for you. ");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'!");
                    boolean insurance = scanner.hasNextBoolean();
                    scanner.nextLine();
                    System.out.println("\nDo you have driving licence? Write 'yes' or 'no'!");
                    scanner.nextLine();
                    boolean licence = scanner.hasNextBoolean();
                    System.out.println("\nWhen will you buy this car?");
                    String carTime = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Car sold! Happy to business with you.");

                } else {
                    System.out.println("\nWe don't sell car under 100000. Sorry");
                }
                break;
            case "b":
                System.out.println("\nWhat is your car valued price?");
                int carValue = scanner.nextInt();
                System.out.println("\nWhat is your selling price?");
                int sellPrice= scanner.nextInt();
                if(sellPrice>= carValue) {
                    System.out.println("We will buy your car. Call us soon!");
                    System.out.println("We've added your car. \nStay connected wit us. \nThank you.");
                }


                break;
            default:
                System.out.println("Invalid option");
        }
        scanner.close();
    }
}
