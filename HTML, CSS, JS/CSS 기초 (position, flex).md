# **CSS 기초**

## **form 관련 가상 클래스**

- **:enabled / :disabled** = 활성화, 비활성화 상태
- **:read-only / :read-write** = 사용자가 편집할수 없는/있는 상태
- **:checked** = input 유형이 checkbox, radio 유형일 때, 선택된 상자 지정
- **:required** = 필수입력해야 하는 요소 지정

## **position**


### **position 이란?**

HTML 태그의 위치를 지정해주는 속성. position 속성을 이용하여 레이아웃을 결정할 수 있다.

### **position 종류**

1. **posiotion : static**

모든 태그는 static값을 가진다. 즉 HTML은 정상적인 흐름(normal flow)에 따라 위치가 지정되게 된다.

> normal flow란 작성 순서대로 작동하는 것.
> 

1. **position : relative**

static(자신의 원래 위치)에서 상대적인 속성을 가지고 있다.

```jsx
position:relative; 에 값 left:50px; 작성 시 원래 위치보다 좌로 50px 이동.
```

1. **position : absolute**

부모 요소 기준으로 상대적이 아닌, 절대적 기준으로 위치를 지정할 수 있다. (기준점이 없다면 HTML의 root요소를 기준으로 잡는다.)

```jsx
position : absolute; top: 30px; left: 30px; 작성 시 부모 요소 기준 좌상단 30px 이동.
```

> absolute 요소는 nomal flow에서 벗어나기 때문에, 다른 static 요소가 그 자리를 차지하게 된다.
> 

1. **position : fixed**

사용자가 보고있는 브라우저 화면(Viewport)를 기준으로 위치하고 싶을 때 사용하면 된다.

> 일반적으로 모달창의 경우 사용한다.
> 

1. **position : sticky**

sticky 속성이 적용된 요소는 조상에 스크롤이 존재한다면 가장 가까운 부모 요소 컨텐츠 영역에 달라붙는다.

> top 등 위치를 지정하면 sticky의 위치가 변하게 된다. / -webkit- => 브라우저 제조사의 접두사
> 

> [!Tip]
> 💡 **웹킷이란?**  웹 브라우저를 만드는데 기반을 제공하는 오픈소스 응용 프레임워크이다.

1. **z-index**

position 사용 시 요소가 겹쳐보이는데, 어떤 요소가 더 위로 나타날지는 z-index 속성으로 지정이 가능하다. 오직 static이 제외한 position 속성값이 적용된 요소의 Z 축 순서를 지정할 수 있으며, 값이 클수록 위로 나타난다.

> 부모는 값을 높여 자식 위로 올라올 수 없으며, 자식은 부모의 뒤로 이동할 수 있다. / 현업에선 10단위로 사용
> 

## **flex : 유연하게 움직일 수 있는 속성**


### **flex-container에 사용하는 속성**

**display:flex를 적용하여 flex를 실행할 수 있다.**

자식 요소가 컨테이너 안 공간을 맞추기 위해 크기를 키우거나 줄이는 방법을 설정하는 방법.

> 부모 요소 = flex-container / 자식 요소 = flex-item / 1차원적 레이아웃을 위해 사용
> 

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/41710226-152a-49b6-9297-784756057afd)


### **flex-direction**

컨테이너 내에 아이템을 배치할 때 주축, 방향을 지정

- row : 기본값. 왼쪽에서 오른쪽 방향
- column : 위에서 아랫방향
- row-reverse : 오른쪽에서 왼쪽방향
- column-reverse 아래에서 위방향

### **justify-content**

주축을 기준으로 배열의 위치를 조절, 간격 설정할 수 있다.

- flex-start / flex-end center / space-between 자동 여백 정렬 / space-around 양옆 기준 여백 정렬 / space-evenly 양옆 여백 정렬(전체 여백 동일 크기)

### **align-items, align-content**

- align-items 교차축(주축의 반대)을 기준으로 정렬**(세로정렬에 사용가능)**
- align-content 컨테이너의 교차 축의 아이템들이 여러 줄일 때 사용 가능
- flex-wrap:wrap인 상태에서 사용해야 함

### **gap**

아이템 사이의 간격을 설정할 때 사용한다.

### **flex-wrap**

한줄에 배치되게 할 것인지, 여러 행으로 나누어 표현할 것인지 결정한다.

> 초과 시 다음줄에 배치할 수 있다.
> 

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/232dda31-690c-482f-983f-a97a50a0c9b1)

### **flex-flow**

flex-direction, flex-wrap 단축 속성

## **flex-item에 속성**

### flex-basis

- flex item의 초기 크기를 설정
- width, height와 다른점은 축의 방향에 따라 달라지며, 내부 콘텐츠에 따라 유연한 크기를 가진다.
- auto 기본값 / 적용 시 row => width 값 무시 / column => height 값 무시

> 유동적인 반응은 반응형 웹 페이지에 주로 사용된다,(ex-휴대폰 가로모드)
> 

### **flex-grow : basis값보다 크게할 때 사용**

아이템이 컨테이너 내부에서 할당할 수 있는 공간의 정도를 지정

형제 요소가 같은 값을 가질 시 동일한 공간을 할당(부모 요소의 end까지)

> [!Tip]
> 💡 값 1 => 자식요소 모두 동일한 크기 할당
> 
> 값 2 => 특정 하나만 줄 경우 다른 자식 요소보다 **두배 여백 공간을 할당(여백만 할당, 전체크기가 커지진 않음)**
> 
> 전체 공간을 키우고 싶다면 flex-basis:0 으로 지정

### **flex-shrink : basis값보다 작게할 때 사용**

아이템 크기 고정 및 축소에 사용 / 0으로 설정 시 basis값보다 작아질 수 없다.

### **align-self**

부모의 align-items 속성을 덮어 flex-item에게 개별적인 align-items 속성을 부여

stretch : 기본값

### **flex**

해당 속성의 단축 속성

```jsx
flex : 1 1 100px; /*flex-grow / flex-shrink / flex-basis*/
```
