package DailyQuiz.Day2_5;

public class Cart extends Product {
    private Product[] products;

    Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;
        int totalDeliveryCharge = 0;

        for (int i = 0; i < products.length; i++) {
            products[i].getDiscountAmount();
            totalWeight += products[i].getWeight();
            totalPrice += products[i].getPrice();
        }
        totalDeliveryCharge = totalWeight < 3 ? 1000 :
                totalWeight < 10 ? 5000 : 10000;

        if (totalPrice > 30000) {
            totalDeliveryCharge = totalPrice < 100000 ? totalDeliveryCharge - 1000 : 0;
        }
        return totalDeliveryCharge;
    }
}

