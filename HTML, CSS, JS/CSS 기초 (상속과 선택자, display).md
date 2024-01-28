
> 💡 **요약과 느낀점**
> CSS의 대한 이해와 문법을 설명한다.
> CSS 또한 HTML과 동일하게 독학으로 공부했었으나, 예나 지금이나 외울게 많아서 어려운 것 같다.


# **CSS 기초**


> **출처 weniv**

## **CSS란?**

Cascading Style Sheet의 약자로, CSS에서 스타일이 적용될 때, 우선순위로 적용된다.

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/a0e011d6-ee69-4e26-af71-8c32e3724536)
![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/0b062b14-fbd1-474b-aaed-86342f075815)

**선택자(Selector)** 해당 태그를 선택

**{** - 선언 시작 **속성(Property)** - 해당 속성 : **속성값(Property Value)** - 속성 값 **;** - 마침표 **}** - 선언 마침

**CSS 주석 = /* 내용 */**

https://www.color-hex.com/

**=> CSS 색상 관련 홈페이지**

## **CSS 적용**


1. **인라인 방식**

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/3793cf3b-29ca-4ad1-852c-19a0458cc04b)

초기에 사용하던 방식. HTML 태그 자체에 Style 속성으로 작성하는 방식. 스타일 적용에 제한이 있음.

(`:hover`, `::before`, `::after` 등 가상요소 불가)

1. **내부 스타일**

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/1fa5944b-8cf2-4ce7-942a-8468d8ec0500)

HTML head 요소 내부에만 위치 시킬 수 있는 스타일.

1. **외부 스타일**

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/0b8315c0-8af7-4107-9ea9-99ab8e373753)

head 내부에 위치, rel : relations 관계를 나타낸다.(일반적으론 stylesheet), href : 경로, 해당 CSS 위치를 나타냄.

**해당 방식을 가장 권장. HTML과 CSS를 분리하여 가독성과 효율성을 높일 수 있다.**

## **CSS 상속**


스타일을 적용시키는 방식은 다양하다.

- **개별로 인라인 스타일 적용 :** 이는 HTML 태그에 직접 적용시키는 방식
- **태그 선택자 적용 :** 각각의 태그를 CSS에 적용시키는 방식
- **그룹 선택자로 적용** : 적용하고자 하는 태그를 (,)으로 그룹시켜 적용시키는 방식
- **상속 이용 :** 적용시키려는 범위의 태그를 div 와 같은 블록레벨 요소로 포함시켜 적용시키는 방식

### **상속(Inheritance)**

- 상속이 되는 속성과 **되지 않는 속성이 존재**한다.
- width, height, margin, padding, border 와 같은 것은 상속되지 않는다.(요소의 크기와 관련된 속성)
- inherit : 속성값을 부모와 동일하게 상속 / initial : 속성값을 브라우저 기본 스타일
- button, input 요소처럼 form 관련 태그는 상속받지 않는다 (브라우저 기본 설정때문)

**CSS 속성 초기화를 위한 방식**이 있다. 브라우저의 기능은 최대한 살리는 노멀라이즈가 많이 사용된다.

- 노멀라이즈 : https://necolas.github.io/normalize.css/
- 리셋 CSS : https://meyerweb.com/eric/tools/css/reset/

## **CSS 선택자**

1. **전체 선택자(universal selector)** : 문서 내의 모든 요소 선택, *(애스터리스크)로 사용 가능
2. **타입(유형, 태그, 요소) 선택자(type selector)** : 특정 태그를 선택
3. **아이디 선택자(ID selector)(`#`)** : HTML 내에 id를 특정하여 선택. 중복되면 안되기 때문에 재사용성↓, JavaScript, 해시 링크와 함께 사용.
4. **클래스 선택자(class selector)(`.`)** : 한 페이지 내에 여러개가 존재 할 수 있어, 재사용성이 높다. 숫자로 시작되면 안되고, -과 _, 문자로 시작되어야 한다.
5. 특성 선택자(Attribute selector)(`[]`) : 속성/속성값 요소를 선택
6.  그룹 선택자(Group selector)(`,`) : 쉼표를 사용하여 다중 선택
7. **복합 선택자**

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/cbd44e8c-69b8-4ef1-b6f8-966c4b46a9f6)

- **자손(하위) 선택자 :** 자식 자손 모두를 선택할 수 있다. 공백을 통해 구분할 수 있다.

       EX) section p => section 태그 내의 p 태그 선택

- **자식 선택자 :** `>`를 사용하여 구분, **직계자손만**을 선택

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/fdfafc06-4aa2-4db7-af81-047bc0532f1e)

- **일반 형제 선택자** : `~`를 사용하여 구분. **기준점 기준 뒤 형제** 선택

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/8a3d039e-d01f-4947-bea6-69a7831efb50)

- **인접 형제 선택자 :** `+`를 사용하여 구분. 바로 **뒤 인접한 형제**만 선택

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/45ea0e7b-d089-48e2-9169-280b67d9898a)

1. **가상 클래스 선택자(pseudo selectors) : 요소에 선언되지 않은 임의에 클래스(인라인)**

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/f8d51240-3d2c-423a-b3ee-339690ace126)

       EX) `a:link` => 방문하지 않은 링크는 해당 CSS를 적용 / a:hover => 마우스 커서 존재 시 해당 CSS 적용

1. **구조적 가상 선택자**

`:first-child` => 형제 요소 그룹 중 첫 번째 요소, 첫 번째 요소가 해당 요소가 아니라면 적용 되지 않는다.

       EX) div p:first-child => div 자식요소 중 첫 번째 요소인 p에 적용.

`:last-child` => 형제 요소 그룹 중 마지막 요소

`:nth-child` => 형제 사이 중 괄호 안 조건에 따라 선택, (CSS 함수)

`:not` => 부정 선택자.

### **CSS 선택자 우선순위**

CSS언어에서 충돌 시 우선순위로 적용이 된다.

- 후자 우선의 원칙
- 구체성(명시도)의 원칙
- 중요성의 원칙

1. **후자우선의 원칙**

동일한 선택자, 속성이 사용될 경우 가장 마지막에 적용된 속성을 따르게 된다.

1. **구체성의 원칙**

선택자의 구체성(명시도)이 높은 선택자 속성을 따른다.

**가중치 : 아래와 같은 기준으로 가중치가 높은 선택자의 속성이 부여된다.**

| inline 스타일 속성 | 1000점 => 점수가 높아 잘 사용하지 않는다. |
| --- | --- |
| id | 100점 |
| class, 가상 클래스, 속성 선택자 |  10점 |
| type, 가상 요소 선택자  | 1점 |

**=>** 가중치가 서로 같은 순위일 경우, 합산하여 비교

https://specificity.keegan.st/ 가중치 비교 사이트

1. **중요성의 원칙**

**!important** 다른 CSS 어떤 선언보다도 우선

=> **자연스러운 상속을 깨트리기 때문**에 오류/ 버그 발생 시 유지보수가 어려움.

1. EX) color: red !important;

## **display 속성**

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/47dd5a05-9efc-49b5-9d89-57531805ffb0)

박스의 유형을 결정. 레이아웃을 설정한다.

> 
> 💡 ***CSS 속성으로 시각적인 부분만 바뀐 것일 뿐, 태그 자체의 요소가 바뀐 것은 아니다!***
> 

**display의 요소**

block : 요소 전후에 줄 바꿈을 생성하는 블록 요소로 변경

inline : 요소 전후에 줄 바꿈을 생성하지 않는 인라인 요소로 변경

inline-block : inline과 동일하게 줄 바꿈이 없지만, width, height 등 넓이 관련 값을 설정 가능

flex : 내부 자식 요소들의 위치를 부모 요소 안에서 단방향(x,y 1차원)으로 설정 가능

~~grid : 내부 자식 요소들의 위치를 부모 요소 안에서 양방향(x,y 2차원)으로 설정 가능~~

none : 접근성 트리에서 해당 요소가 제거. 스크린 리더에도 읽히지 않는다.

## **CSS Box Model**

HTML 요소를 감싸는 상자. 웹페이지는 수많은 상자가 모여 있는 구조

**마진(`margin`)** : 테두리 밖의 영역(요소의 영역으로 포함하지 않는다)

**테두리(`border`) :** 요소와 패딩을 감싸는 **테두리(영역이 아님)**

**패딩(`padding`) :** 요소 영역을 감싸는 영역

**요소(`element`) :** 컨텐츠 영역

**inline** 박스는 정의된 **일부 동작만** 사용 

=> **width, height, 상하 margin 값이 적용되지 않는다.**

**width**

요소의 너비를 설정. 미설정 시 auto(브라우저 기본값)로 설정.

**height**

요소의 높이를 설정. 미설정 시 auto(브라우저 기본값)로 설정.

**padding**

요소 영역을 감싸는 영역을 설정.

padding: 10px 10px 10px 10px; => top, right, bottom, left 순으로 작성.

**margin(색상 추가 불가)(블록 요소는 남은 여백을 margin으로 채워넣는다)**

테두리 밖의 영역을 설정. 요소와 요소 사이 여백을 넣을 때 사용.

margin: auto 0 auto auto; top, right, bottom, left 순으로 작성.

- margin auto사용 시 여백을 사용하여 정렬하지만, 세로 정렬은 적용할 수 없다.

> [!Tip]
> 💡 **마진병합 현상(Margin Collapsing)**
> 
> 1. 요소와 요소 사이에 공간이 있을 경우, 더 높은 값의 마진 값만 적용
> 2. 부모 자식 요소에서 자식 요소의 마진 값이 부모의 높이에 영향을 미치지 않는다.
> 
> **왜 발생하는가?**
> 
> 공식문서에도 위와같은 정확한 내용은 설명되어 있지 않다. 가장 유력한 가설은 수직 마진을 이용한 레이아웃을 쉽게 설정하기 위해서라고 추측하고 있다.
> 
> **해결방법**
> 
> **overflow** 값을 사용
> 
> **display : inline-block** 값을 적용
> 
> **border** 값을 적용.
> 
> **display : flow-root** 사용
> 

**border : 테두리를 지정**

테두리 요소가 차지하는 전체 너비, 높이의 일부

=> border-width / border-style / border-color 가 존재

**box-sizing : 너비 높이값 하나로 간편하게 지정할 수 있다.**

content-box : 기본값. 너비, 높이, border, padding 포함하지 않음.

border-box : width, height으로 너비, 높이, border, padding 까지 포함된 값으로 지정된다.

width = 콘텐츠 너비 + border + padding

**overflow : 부모의 영역을 넘어설 때, 자식 요소의 성질을 설정할 수 있다.**

=> hidden : 요소 크기만큼 잘라냄 / scroll : 요소 크기만큼 잘라내고 스크롤 제공 / visible : 기본값. 자르지 않음 / auto : 자동으로 스크롤바 제공

**border-radius : 상자의 모서리를 둥글게 처리한다.**

**opacity : 불투명도를 설정(0 투명 1 불투명)**
