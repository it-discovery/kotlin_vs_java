package it.discovery.java8;

public class DiscountFactory {

    public static Discount getDiscount(int amount) {
        if (amount < 0 || amount >= 100) {
            throw new IllegalArgumentException("Invalid discount value: " + amount);
        }
        Discount discount = null;
        switch (amount) {
            case 0:
                discount = new NoDiscount();
                break;
            case 50:
                discount = new HalfDiscount();
                break;
            default:
                discount = new Discount(amount);
        }
        return discount;
    }
}
