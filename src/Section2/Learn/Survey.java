package SectionTwo.Learned;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, Thank you for taking the survey");
int counter = 0;
        System.out.println("What's your full name, please?");
      String name = scanner.nextLine();

      counter++;
      System.out.println("\n" +"How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();

        counter++;
        System.out.println("\n" +"How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();

        counter++;
        System.out.println("\n" +"How many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();

        counter++;
        System.out.println("\n" +"How many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter++;counter++;

        System.out.println("\n" + "Thank you " + name + " for answering all " + counter + " questions.");
        System.out.println("\n" + "Your fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee " +
                "expenses");
        System.out.println("Weekly,you spend " + (coffeeAmount*coffeePrice) + " on coffee");
        System.out.println("Weekly, you speand " + (foodAmount*foodPrice) + " on fast food");
        scanner.close();
    }

}
