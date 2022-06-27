package Section4.Learn;

public class Chorus {
    public static void main(String[] args) {
        System.out.println("Function or Method way: ");
        singChorus();

    }
    public static void singChorus() {
        System.out.println("Don't blame it on the sunsine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on the good times");
        System.out.println("Blame it on the boogie\n");

        System.out.println("Loops way: ");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Don't blame it on the sunsine");
            System.out.println("Don't blame it on the moonlight");
            System.out.println("Don't blame it on the good times");
            System.out.println("Blame it on the boogie\n");

        }
    }
}