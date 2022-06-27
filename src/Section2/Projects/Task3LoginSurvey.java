package SectionTwo;

import java.util.Scanner;

public class Task3LoginSurvey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your first name?");
        String firstName = scan.nextLine();
        System.out.println("What's your last name?");
        String lastName = scan.nextLine();
        System.out.println("What's your age?");
        int age = scan.nextInt();
        System.out.println("Make a username");
        String username = scan.nextLine();
        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        System.out.println("What country is that?");
        String country = scan.nextLine();
        System.out.println("Thank you for joining" + firstName + "!");
//        String fullName = firstName + lastName;
//        System.out.println("Your full name is ");

        System.out.println("\n" +"Here is the information you entered:");

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Username: " + username);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);

    }
}
