package weekly.quiz;

import java.math.BigDecimal;

public class LargeAppliance extends Product implements DeliveryChargeCalculator {

    LargeAppliance(String name, Double weight, long price) {
        super.setName(name);
        super.setWeight(weight);
        super.setPrice(new BigDecimal(price));
    }

    @Override
    public BigDecimal getDeliveryCharge(Double weight, BigDecimal price) {
        BigDecimal charge = null;
        if(weight < 3.0) {
            charge = new BigDecimal(1000L);
        } else if(weight < 10.0) {
            charge = new BigDecimal(5000L);
        } else charge = new BigDecimal(10000L);

        if (price.longValue() > 100000) {
            charge = new BigDecimal(0L);
        } else if (price.longValue() > 30000) charge = charge.subtract(new BigDecimal(1000L));

        return charge;
    }

    @Override
    public void print() {
        System.out.printf("상품명 : %2s, 무게 : %.2f kg 가격 : %,2d 원\n", getName(), getWeight() , getPrice().longValue());
    }
}
