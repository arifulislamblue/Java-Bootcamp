package Section6.Learn;

public class Looping2D {
    public static void main(String[] args) {
        int [] [] grades = {
                {72, 74, 78, 76},
                {80, 81, 82, 73},
                {76, 76, 76, 67}
        };

         for (int i =0; i < grades.length; i++) {
             switch (i) {
                 case 0:
                     System.out.print("\tAriful: ");
                     break;
                 case 1:
                     System.out.print("\tArif: ");
                     break;
                 case 2:
                     System.out.print("\tAri: ");
                     break;

             }
             for (int j =0; j < grades[i].length; j++) {
                 System.out.print(grades[i][j] +" ");
             }
             System.out.print("\n");
         }

    }
}
