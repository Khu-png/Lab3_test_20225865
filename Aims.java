public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart an0der = new Cart();

        //Create new dvd object and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        an0der.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "George Lucas", 87, 24.95f);
        an0der.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 24.95f);
        an0der.addDigitalVideoDisc(dvd3);

        //Print total cost of the items in the cart
        System.out.println("Total cost is: ");
        System.out.println(an0der.totalCost());

        //Remove disc form cart
        an0der.removeDigitalVideoDisc(dvd2);
        System.out.println("Total cost is: ");
        System.out.println(an0der.totalCost());



    }
}