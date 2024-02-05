package DailyQuiz.Day2_5;



public class Product implements Promotion {
    private String name;
    private int price;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void getDiscountAmount() {
        switch (getName()) {
            case "beauty":
                setPrice(getPrice() - 2000);
            case "grocery":
                setPrice(getPrice() - 10000);
        }
    }
}
