package Section6.Learn;

import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String [] staffLastYear = {"Ariful", "Sazib", "Sajal"};
        String [] staffThisYear = {"Ariful", "Sazib", "Sajal"};
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
