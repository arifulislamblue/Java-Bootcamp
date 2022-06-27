package Section3.Learned;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        int grade = 32;
        if (grade>=90) {
            System.out.println("Great job, you passed and got Goden Egg!");
        } else if (grade>=70){
            System.out.println("You got an A");
        }  else if (grade>=60){
            System.out.println("You got an b");
        }  else if (grade>=50){
            System.out.println("You got an C");
        }  else if (grade>=40){
            System.out.println("You got an -C");
        } else {
            System.out.println("Don't worry! You have better option to change yourself");
        }



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What's your name?");
//        String name = scanner.nextLine();
//        System.out.println("Hi " + name + ". What's your English grade?");
//        int counter = 0;
//        int englishGrade = scanner.nextInt();
//        System.out.println("What's your Math grade?");
//        counter++;
//        int mathGrade = scanner.nextInt();
//        System.out.println("What's your Bangla grade?");
//        counter++;
//        int banglaGrade = scanner.nextInt();
//
//        int subjectLength = scanner.nextInt(counter);
//
//
//        if (englishGrade > 33) {
//           System.out.println("Great job, You passed");
//        }
    }
}
