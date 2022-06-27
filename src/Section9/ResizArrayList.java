package Section9;

import java.util.ArrayList;

public class ResizArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ariful");
        names.add("Sajal");
        names.add("Sazib");
        names.add("Aziz Mia");
        names.add("Mominul");


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
