package Section4.Learn;

public class DocComments {
    public static void main(String[] args) {

    }

    /**
     * Function name: greet
     * <p>
     * Inside the function:
     * 1. prints: 'Hi'
     */
    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function name: printText
     *
     * @param name (String)
     * @param age  (String)
     *             <p>
     *             Inside the function:
     *             1. prints the name and age
     */
    public static void printText(String name, String age) {
        System.out.println("Hi, I'm " + name + " " + age + " years old.");
    }

    /**
     * Function name: calculatorArea
     *
     * @param length (double)
     * @param width  (double)
     * @return (double)
     * Inside this function:
     * 1. calculates the area and returns it.
     */
    public static double calculatorArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
