package SectionTwo.Projects;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHello, What's your name?");
        String name = scanner.nextLine();
        System.out.println("\nHi " + name + "! I'm your online friend. Which country are you from?");
        String country = scanner.nextLine();
        System.out.println("\nI hear it's tremendous in " + country + ". I'm from Java. How old are you?");
        int age = scanner.nextInt();
        System.out.println("\nSo, you're " + age +" years old. You'll be happy to know that I was born in 1995.");
        System.out.println("\nEnough about me. What's your favorite programming language? Don't say Python");

        scanner.nextLine(); //TRAP - It was important

        String language = scanner.nextLine();
        System.out.println("\nThat means " + language +" is your favorite programming language. Happy to chat with " +
                "you " +name + ". We'll chat again soon.\nHave a peacefull life.");
        scanner.close();
    }
}
