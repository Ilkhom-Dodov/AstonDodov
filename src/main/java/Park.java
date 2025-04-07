public class Park {

    private static class Ride {
        String name;
        String opensAt;
        String closesAt;
        int price;

        private Ride(String name, String opensAt, String closesAt, int price) {
            this.name = name;
            this.opensAt = opensAt;
            this.closesAt = closesAt;
            this.price = price;
        }
    }
}
