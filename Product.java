public class Product {

    public static void main(String[] args) {
        printProductInfo();

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("BMW X6", "01.01.2007", "BMW AG", "Germany", 5000000, false);
        productsArray[1] = new Product("KIA K5", "23.03.2015", "Kia Motors", "South Korea", 2450000, true);
        productsArray[2] = new Product("Hyundai Sonata", "20.12.2019", "Hyundai Motor Company", "South Korea", 2800000, false);
        productsArray[3] = new Product("Lamborghini Gallardo", "10.06.2002", "Automobili Lamborghini S.p.A.", "Italy", 9000000, true);
        productsArray[4] = new Product("Changan UNI-V", "15.04.2021", "Changan Automobile Group", "China", 3000000, true);
    }

    private String name;
    private String productionDate;
    private String manufacturer;
    private String originCountry;
    private int price;
    private boolean reserved;

    private Product (String name, String productionDate, String manufacturer,
                    String originCountry, int price, boolean reserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.price = price;
        this.reserved = reserved;
    }

    static Product car = new Product("Audi TT RS", "13.10.2017",
                                "Audi AG", "Germany",
                                    6300000, true);

    private static void printProductInfo () {
        String nameInfo = car.name;
        String productionDateInfo = car.productionDate;
        String manufacturerInfo = car.manufacturer;
        String originCountryInfo = car.originCountry;
        int priceInfo = car.price;
        boolean reservedInfo = car.reserved;
        System.out.println(nameInfo + " " + productionDateInfo + " " + manufacturerInfo + " "
                            + originCountryInfo + " " + priceInfo + " " + reservedInfo);
    }
}