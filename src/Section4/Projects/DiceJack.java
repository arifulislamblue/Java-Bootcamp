package Section4.Projects;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int roll = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 to 6");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers can't be less than 1. Game End. ");
            System.exit(0);
        }
        int sumOfNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll + roll2 + roll3;
        System.out.println("Dice sum = " + sumDiceRolls + " . Number sum = " + sumOfNumbers);

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Number can't be higher than 6");
        }

        scanner.close();

        System.out.println(roll);
        System.out.println(roll2);
        System.out.println(roll3);

    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }
}
