package Section6.Learn;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int [] [] grades = {
                {72, 74, 78, 76},
                {80, 81, 82, 73},
                {76, 76, 76, 67}
        };
//
//        grades[0] [0] = 72;
//        grades[0] [1] = 74;
//        grades[0] [2] = 78;
//        grades[0] [3] = 76;
//
//        grades[1] [0] = 80;
//        grades[1] [1] = 80;
//        grades[1] [2] = 80;
//        grades[1] [3] = 80;
//
//        grades[2] [0] = 90;
//        grades[2] [1] = 90;
//        grades[2] [2] = 90;
//        grades[2] [3] = 90;



        System.out.println("\tAriful: " +Arrays.toString(grades [0]));
        System.out.println("\tArif: " +Arrays.toString(grades [1]));
        System.out.println("\tAri: " +Arrays.toString(grades [2]));
    }
}
