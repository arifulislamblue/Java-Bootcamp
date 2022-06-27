package Section7;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", "Blue", 5000.00, 2015);


        Car toyota = new Car("Toyota", "Blue", 25000.00, 2025);

        System.out.println("This " +nissan.getMake()+ " worth is $" +nissan.getPrice()+" and color is " + nissan.getColor());
        System.out.println("This " +toyota.getMake() + " worth is $" +toyota.getPrice()+" and color is " + toyota.getColor());

    }

}
