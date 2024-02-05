# 아래 그림과 같은 클래스와 인터페이스를 생성하고, 기능을 구현하세요.

쇼핑몰의 상품을 구현하고 해당 상품들의 배송비를 계산하는 문제입니다.

### 클래스 및 인터페이스 구조

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/aa8af5e4-4d4c-4548-b4e5-5ac23caf2eae)

| Product | 상품 (부모 클래스) |
| --- | --- |
| Grocery
Beauty
LargeAppliance | 세부 상품들 (자식 클래스) |
| Cart | 장바구니
해당 문제에서는 배송비를 계산하는 메소드만 구현합니다. |
| Promotion | 쇼핑몰 이벤트 (인터페이스)
해당 문제에서는 할인 금액을 리턴하는 메소드만 구현합니다. |

### 명세

쇼핑몰에서 판매하는 상품 종류는 아래 3가지 입니다.

- 식료품 (Grocery)
- 화장품 (Beauty)
- 대형가전 (LargeAppliance)

각 상품들은 서로 다른 `무게`, `가격`, `할인금액` 속성을 가집니다.

| 상품 | 무게 | 가격 | 할인금액 |
| --- | --- | --- | --- |
| Grocery | 3 | 20000 | 2000 |
| Beauty | 2 | 30000 | 10000 |
| LargeAppliance | 5 | 50000 | 0 |

배송비는 3가지 상품의 무게의 **총합**, 가격의 **총합**으로 계산합니다.

무게에 따라 배송비가 책정됩니다.

| 무게 | 배송비 |
| --- | --- |
| 3미만 | 1000 |
| 3이상 10미만 | 5000 |
| 10이상 | 10000 |

무게로 책정된 배송비는 아래와 같이 상품 가격에 따라 추가 계산이 됩니다. **여기서의 가격은 할인 금액이 적용된 가격**입니다.

| 가격 | 배송비 |
| --- | --- |
| 30000미만 | 배송비 변동 없음 |
| 30000이상 100000미만 | 배송비 1000 할인 |
| 100000이상 | 배송비 무료 |

### 메인 메소드

메인 메소드는 아래 코드를 사용해주세요. 최종 결과는 `9000`이 출력되어야 합니다.

```java
public static void main(String[] args) {
	Product beauty = new Beauty("beauty", 30000, 2);
	Product grocery = new Grocery("grocery", 20000, 3);
	Product largeAppliance = new LargeAppliance("largeAppliance", 50000, 5);

	Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
	int totalDeliveryCharge = cart.calculateDeliveryCharge();
	System.out.println(totalDeliveryCharge);    // 결과: 9000
}
```
