public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20; // Maximum capacity
    private final DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // Add a single DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full, cannot add more items.");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc " + disc.getTitle() + " has been added.");
        }
    }

    // Add two DVDs
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart cannot hold both DVDs. It is almost full.");
        } else {
            itemsOrdered[qtyOrdered] = dvd1;
            itemsOrdered[qtyOrdered + 1] = dvd2;
            qtyOrdered += 2;
            System.out.println("The discs " + dvd1.getTitle() + " and " + dvd2.getTitle() + " have been added.");
        }
    }

    // Add multiple DVDs using varargs (removes the array method)
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full, cannot add more items.");
                return;
            }
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc " + disc.getTitle() + " has been added.");
        }
    }

    // Remove a DVD
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("DVD " + disc.getTitle() + " has been removed.");
                return;
            }
        }
        System.out.println("DVD " + disc.getTitle() + " not found in the cart.");
    }

    // Calculate total cost
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
