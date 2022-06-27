package Section4.Projects;

import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat's your name, please?");
        String name = scanner.nextLine();
        System.out.println("My name is "+name);

        System.out.println("\nHow old are you?");
        int age = scanner.nextInt();
        System.out.println("I'm "+ age + " years old");

        scanner.nextLine();
        System.out.println("\nWhere are you from?");
        String address = scanner.nextLine();
        System.out.println("I'm from "+ address+".");

        System.out.println("\nAre you married? Type 'yes' or 'no'.");
        String married = scanner.nextLine();

        if (married.equals("yes") ||married.equals("no") ||married.equals(null)) {
            System.out.println("What's your gender?");
            System.out.println("""
                    
                    Select the perfect option, please.
                     \t 1. male\s
                     \t 2. female\s
                     \t 3. null""");
            String gender = scanner.nextLine();
        }
        System.out.println("\nAre you student?");
        String student = scanner.nextLine();
        System.out.println("\nWhat's your roll no");
        int rollNo = scanner.nextInt();

        System.out.println("\nHow many subjects do you have?");
        int subjects = scanner.nextInt();

        scanner.nextLine();
        System.out.println("""
                
                Which department are you studying?"
                test
                \t1.English
                \t\t2.Bangla
                \t\t\t3.Math
                \t\t4.Bio
                \t5.phy
                test""");

        String department = scanner.nextLine();

        System.out.println("\nThat's for today. Will you code tomorrow?");
        String today = scanner.nextLine();
        if (today.equals("yes") ||today.equals("no")) {
            System.out.println("\nWhich project will you do? Will you do new projects?");
            System.out.println("""
                    Select any option, please.
                    \t1.Student Management App
                    \t2.e-Commerce
                    \t3.New
                    \t4.yes""");
            String New = scanner.nextLine();
            if (New.equals("yes") ||New.equals("no")){
                System.out.println("""
                        \nWill you work both?
                        \t1.App
                        \t2.Web
                        \t3.yes""");
                String App = scanner.nextLine();
                if (App.equals("yes") ||App.equals("no")) {
                    System.out.println("""
                            \nWill you make new app?
                            \t1.yes
                            \t2.no""");
                    String no = scanner.nextLine();
                    if (no.equals("yes") ||no.equals("no")) {
                        System.out.println("\nWill you go somewhere tomorrow? Type 'yes' or 'no'");
                        String somewhere = scanner.nextLine();
                        if (scanner.equals("yes") ||scanner.equals("no")){
                            System.out.println("""
                                    \nWhere will you go?
                                    \t1.Dhaka
                                    \t1.Chittagong""");
                            System.out.println("\nWill you come early?");
                            String early = scanner.nextLine();
                            if (early.equals("yes") ||early.equals("no")) {
                                System.out.println("""
                                    \nWon't be a software engineer at google?
                                    \t1.yes
                                    \t2.100%
                                    \t3.soon""");
                                String soon = scanner.nextLine();
                                if (soon.equals("yes") ||soon.equals("no")){
                                    System.out.println("\nThat's for today. Good night." +
                                            "\t Allah Hafes" +
                                            "\tAssalamu Alaikum");
                                    String salam = scanner.nextLine();
                                    System.out.println(salam);
                                }
                            }
                        }

                    }
                }
            }
        }



    }
}
