package Section4.Learn;
public class Parameters {
    public static void main(String[] args) {
        measureParameters(2.5, 5.5);
        measureParameters(3.2, 4.1);
        measureParameters(3.5, 1.2);
        measureParameters(1.6, 5.6);
        measureParameters(10.1, 0.7);
        measureParameters(20.2, 5.6);
    }

    public static void measureParameters(double length, double width) {
        double area = length * width;
        System.out.println("The area of the rectangle with length " +length +
                " and width " + width + " is equal to " + area + "\n");
    }
}
