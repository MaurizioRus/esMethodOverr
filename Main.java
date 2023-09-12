public class Main {
    public static void main(String[] args) {

        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 200.0);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 400.0);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 350.0);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 800.0);


        Smartphone smartphone1 = new Smartphone("LG", "Nexus 5", 2300, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Apple", "iPhone 11", 3046, producerPrice2, retailPrice2);

        System.out.println("Smartphone 1:\n" + smartphone1.toString());
        System.out.println("\nSmartphone 2:\n" + smartphone2.toString());

        if (smartphone1.equals(smartphone2)) {
            System.out.println("\nSmartphone 1 is equal to Smartphone 2.");
        } else {
            System.out.println("\nSmartphone 1 is NOT equal to Smartphone 2.");
        }

        try {

            Smartphone clonedSmartphone = smartphone2.clone();

            System.out.println("\nCloned Smartphone details:\n" + clonedSmartphone.toString());

            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("\nSmartphone 2 is equal to cloned Smartphone.");
            } else {
                System.out.println("\nSmartphone 2 is NOT equal to cloned Smartphone.");
            }
        } catch (Exception exception) {

            System.err.println("Cloning error");
            exception.printStackTrace();
            System.err.println("Error");
        }
    }
}
