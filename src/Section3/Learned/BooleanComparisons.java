package Section3.Learned;

public class BooleanComparisons {
    public static void main(String[] args) {
        //NOTES
        // > greater than
        // > less than
        // <= greater than or egual to
        // <= less than or egual to
        // == egual to
        // != not egual to
        // eguals egual to (for String)
        //!eguals not egual to (for string)

        int englishGrade = 99;
        int banglaGrade = 98;
        int mathGrade = 98;

        System.out.println(englishGrade != mathGrade);
        System.out.println(banglaGrade != mathGrade);

        String sentence = "I love this course";
        String sentence2 = "I love this course";
        System.out.println(!sentence.equals(sentence2));

        double sales = 25.5;
        double costs = 5.0;
        double profit = sales -costs;

        System.out.println(profit);
    }
}
