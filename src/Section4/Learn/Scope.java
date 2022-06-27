package Section4.Learn;

public class Scope {
    public static void main(String[] args) {
        someFunction();


    }
    public static void someFunction() {
        int apples = 5;
        int age = 25;
        System.out.println(apples);
    }
}
