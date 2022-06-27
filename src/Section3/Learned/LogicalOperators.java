package Section3.Learned;

public class LogicalOperators {
    public static void main(String[] args) {

        //OR  || OPERATORS
        int englishGrade = 56;
        int mathGrade = 48;
        String language = "Java";

        if (englishGrade > 75 || mathGrade >75 || language.equals("Java")) {
            System.out.println("Congratulations, you got this scholarship.");
        } else {
            System.out.println("We are sorry, you have better option somewhere else.");
        }

        //AND && Operators
        int credits = 55;
        double GPA = 3.55;
        if (credits >= 25 && GPA >=4.5){
            System.out.println("You earned your diploma.");
        } else {
            System.out.println("Sorry, you need at least 25 credits and minimum 4.5 GPA.");
        }
    }
}
