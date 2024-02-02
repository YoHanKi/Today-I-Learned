package weekly.quiz;

import java.math.BigDecimal;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);

        Product[] shopList = new Product[3];
        long totalPrice = 0;
        double totalWeight = 0;

        System.out.println("장바구니에 추가할 상품종류번호를 입력하세요.(1.식료품, 2.화장품, 3.대형가전)");
        for(int i = 0; i < shopList.length; i++) {
            //이름, 무게, 가격(long) 순
            switch (std.nextLine()) {
                case "1":
                    Beauty beauty = new Beauty("꽃을든 남자 All in one", 1.5, 15000L);
                    shopList[i] = beauty;
                    totalPrice += shopList[i].getPrice().longValue();
                    totalWeight += shopList[i].getWeight();
                    beauty.print();
                    break;
                case "2":
                    Grocery grocery = new Grocery("누텔라(대형)", 3.5, 33000L);
                    shopList[i] = grocery;
                    totalPrice += shopList[i].getPrice().longValue();
                    totalWeight += shopList[i].getWeight();
                    grocery.print();
                    break;
                case "3":
                    LargeAppliance largeAppliance = new LargeAppliance("LG 세탁기", 30.25, 3000000L);
                    shopList[i] = largeAppliance;
                    totalPrice += shopList[i].getPrice().longValue();
                    totalWeight += shopList[i].getWeight();
                    largeAppliance.print();
                    break;
                default: continue;
            }
        }
        System.out.printf("총 가격 : %,2d 총 무게 : %.2f kg ", totalPrice, totalWeight);
        DeliveryChargeCalculator cart = new Cart();
        BigDecimal charge = cart.getDeliveryCharge(totalWeight, new BigDecimal(totalPrice));
        System.out.printf("배송비 : %2d", charge.longValue());

    }
}
