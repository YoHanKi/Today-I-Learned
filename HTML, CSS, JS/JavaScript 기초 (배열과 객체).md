# JavaScript 기초

> 출처 : weniv
> 

# 타입

## 배열 (Array)

배열은 **데이터를 순서대로 저장**하는 객체이다. 하나만 표현하는 **원시타입**과 달리 여러 개의 데이터를 **한 변수에 묶을 수 있기** 때문에 **추가, 제거, 정렬, 검색** 등 다양한 작업을 수행할 수 있다.

### 배열의 **특징**

1. **빈 배열로 생성**, **요소가 포함된 배열**로도 생성 가능.
2. **인덱스(index)**를 사용하여 값**(원소-elements)**에 접근할 수 있다. 
*(존재하지 않는 인덱스에도 접근 가능하다⇒ 자바스크립트만)*
3. 배열은 원소의 길이를 나타내는 **length 프로퍼티**를 가지고 있다.
*(추가적인 프로퍼티도 존재)*
4. **배열 안, 배열**을 가질 수 있다. 이를 **다차원 배열**이라 한다.

### **배열의 메서드**

1. **push()와 pop()**
배열 끝에 요소를 추가하는 `push()`, 배열 마지막 요소를 꺼내 반환하는 `pop()`
2. **shift()와 unshift()**
배열 첫 요소를 꺼내 반환하는 `shift()`, 배열 첫 요소에 추가하는 `unshift()`
3. **splice()**
배열의 요소를 추가, 제거, 교체하는 `splice()`
**3개의 전달인자(파라미터)**를 받는다. **삭제나 추가할 첫 인자**, 삭제할 **갯수를 적는 두번째 인자**, **추가할 요소의 세번째 인자**가 있다. 추가할 요소가 없다면 **생략할 수 있는데 이때 요소 삭제만 진행**한다. 
4. **slice()**
배열에서 요소를 추출하여 새로운 배열로 반환하는 메서드
**2개의 전달인자**를 받는다. **추출을 시작할 첫 인자**, **추출을 끝낼 두번째** 인자이다. **두번째** 인자는 **생략가능**하다.
5. **sort()**
배열의 요소를 정렬하는 `sort()`
**숫자의 경우 의도와 다르게 정렬**될 수 있다.*(유니코드 기준)* 이때 사용하는 것이 **비교함수(compareFunction)**을 사용하는데, 비교 기준을 부여하는 것과 같다.

```jsx
const num3 = [13, 9, 10];

num3.sort(function (a, b) {
  console.log('a: ' + a, 'b: ' + b);
  return a - b;
});
/**
"a: 9"
"b: 13" // a - b는 음수임으로 a를 앞으로 => [**9**, **13**, 10]

"a: 10"
"b: 9" // a - b는 양수임으로 b를 앞으로 => [**9**, 13, **10**]

"a: 10"
"b: 13" // a - b는 음수임으로 a를 앞으로 => [9, **10, 13**]

"a: 10"
"b: 9" // a - b 는 양수임으로 b를 앞으로 => [**9**, **10,** 13]
*/
```

> [!Tip]
> 💡 **Tim sort 알고리즘**
> 
> JavaScript 의 sort 메소드가 원소를 정렬하는 방법은 Tim sort (Tim Peters 제작)
> 
> **Tim sort는 합병 정렬(Merge sort)과 삽입 정렬(Insertion sort)의 아이디어를 결합한 알고리즘**으로 매우 안정적으로 동작하기 때문에 파이썬과 자바 등 다른 언어에서도 널리 사용 
> 
> 데이터를 여러 개의 덩어리로 분할하고, 이 덩어리들을 삽입 정렬 알고리즘으로 정렬한 다음, 합병 정렬 알고리즘을 이용해 정렬된 덩어리들을 하나로 합침. 이렇게 분할하고 정렬하는 과정에서, 이미 정렬된 데이터를 인식하고 이를 활용
> 
> 참고 : https://d2.naver.com/helloworld/0315536



1. **forEach()**
배열의 각 요소에 대해 주어진 함수를 실행하는 `forEach()`
인자로 배열 요소 인덱스를 받는다. **배열요소를 순환**, 요소를 **함수로 전달**하고, **각 요소에 대해 실행**한다.
**각 배열의 특정 작업을 수행할 때 사용.** 
2. **map()**
배열의 각 요소에 대해 주어진 함수를 실행, 결과를 새로운 배열로 반환하는 `map()`
첫번째 인자는 처리할 함수, 두번째 요소의 인덱스를 전달, 배열의 각 요소를 매개변수로 받아 처리한 후 결과 반환한다.

> [!Note]
> ❓ **forEach()와 map()**
> 별 반 달라보이지 않으나, forEach는 반환값이 없는 반면, map은 새로운 배열을 반환한다.


1. **filter()**
기존의 배열에서 **특정 조건을 만족하는 요소들만** 추출하는`filter()`
**배열에서** 특정 숫자나 날짜 등의 **필요한 정보를 가진 원소만 추출할 때 유용**하다.

```jsx
const arr11 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const newArr = arr11.filter(el => el % 2 === 0);

console.log(newArr);
```

1. **includes()**
요소가 포함이 되어 있으면 true, 아니면 false를 반환하는 `includes()`

```jsx
const arr1 = ['hello', 'world', 'hojun']
arr1.includes('world')
```

## 객체(Object)

객체는 배열처럼 **여러 개의 데이터를 한 변수에 저장할 수 있는 자료형**이다. 차이점은 배열은 인덱스 번호를 통해 접근해야 했다면, ***객체는 키(key)와 값(value)이 있어 키-값 쌍***으로 이루어져 있다.

### 객체의 특징

1. 객체의 리터럴 표현은 중괄호(`{}`)를 사용하여 생성한다. 키와 값은 콜론(`:`)으로 구분하며, **키-값을 합쳐 자산(프로퍼티-properties)**라 표현한다.
*최신문법에서 `function()` 없이 접근가능하다.*
2. 객체의 속성값에 접근하기 위해서는 **객체 이름 + 점 연산자 + 접근하고자 하는 값의 key를 입력**해야한다. 객체의 속성 이름이 변수명 규칙을 지켰다면, **대괄호(`[]`)를 사용하여 속성에 접근**할 수도 있다.
3. 객체에 속성을 추가하기 위해서는 객체 이름 뒤에 점(`.`)과 새로운 속성 이름을 입력하고, 새로운 값을 할당한다.(객체에서 속성을 삭제하려면 delete 키워드를 사용)

### 객체의 메소드

1. **hasOwnProperty()**
객체가 특정 프로퍼티를 가지고 있는지를 나타내는 불리언 값을 반환.
2. **for… in**
객체의 반복을 위한 기능.
**객체 안 프로퍼티 접근**, **어떤 키와 값을 가지는지 확인 및 수정**할 경우 사용.
in 앞의 값에는 매번 반복마다 다른 속성이름(Value name)이 `변수(variable)`로 지정.

```jsx
const person = {
  name: '재현',
  age: 20,
  gender: 'male'
};

for (let key in person) {
  console.log(`${key}: ${person[key]}`);
}
```

> [!Tip]
> 💡 for … in 문은 순서대로 반복되지 않으므로, 순서가 중요하다면 일반 반복문을 사용하는 것이 좋다.
> 

1. **keys(), values()
Object.keys()는 이름(key)**들을, **Object.values()는 값(value)**들을 **배열로 반환**
 *keys 메서드는 IE9 버전부터 지원하며, values 메서드는 IE를 지원하지 않습니다.* 

> [!Tip]
> 💡 **Object는 자바스크립트 안에 기본적으로 내장되어 있는 객체**이다.
> 여러가지 유용한 값과 메서드를 미리 만들어 놓은 객체라고 생각하면 된다.

## this

### this 란?

**this는 객체를 가리키는 참조 변수**. this는 호출되는 **위치에 따라 다른 값을 출력하기 때문에 🚨주의**해야한다.

```jsx
function a(){ console.log(this) }
a();
```

```jsx
let myObj = {
    val1: 100,
    func1: function () {
        console.log(this);
    }
}

myObj.func1();
```

> [!Note]
> ❓ **window 객체란 브라우저 환경의 전역공간**.*(Node.js 환경에선 global)*
> 어떤 객체는 메소드가 아닌 **단독호출 함수의 this 전역공간을 참조**하게 된다.

**👉예시이다.**
**this.name을 생성**하는 **sayName** 함수를 생성한 후,

각각의 name을 생성, 오브젝트로 peter, bruce를 생성한다. 이후 각각의 sayName 함수를 실행하면 

Hero / Peter Parker / Bruce Wayne 이 실행된다.

> [!Note]
> ❓ **this.name은 전역변수로 생성**되는데, **전역변수는 프로그램 종료 시 까지 메모리를 차지하고 있기때문에 전역변수 범위는 침범하지 않는게 좋다**
>
> 
```jsx
/ * this */
function sayName(){
  console.log(this.name);
}
var name = 'Hero'; 

let peter = {
  name : 'Peter Parker',
  sayName : sayName
}

let bruce = {
  name : 'Bruce Wayne',
  sayName : sayName
}
sayName();
peter.sayName(); 
bruce.sayName();
```

### this 특징

this는 함수가 만들어질 때가 아닌, **실행될 때 그 값이 결정**된다.

# 객체지향 프로그래밍

## 객체지향 프로그래밍이란 무엇일까?

**프로그래밍 방법론 중 하나**로, 객체를 만들어 서로 소통하도록 하는 방법이다.

객체는 우리가 표현하고자 하는 **구체적인 기능을 추상적으로 표현**한 것이다.

```jsx
const game = {
    winrate : 100,
    team : function() {
        this.winrate-=20;
        console.log('승률이 하락했습니다');
    }
}
const hanzo = {
    weapon : 'bow',
    selection : function(hero) {
        hero.team();
    }
}

hanzo.selection(game);
```

이처럼 객체가 서로 상호작용하게 하는 것이 **객체지향 프로그래밍**이다. 

## 생성자(constructor)

객체의 추상화를 하였지만, 이는 한번 생성하면 재사용성이 크게 떨어진다. 이를 **효율적인 방법으로 만드는 방법이 생성자**이다.

생성자는 객체를 만들 때 **new** 연산자와 함께 사용하는 함수이다. *(아래는 내장 생성자이다.)*

```jsx
let myArr = new Array(1,2,3);
```

### 생성자를 왜 사용할까?

**생성자를 통해 생성된 객체는 같은 프로퍼티와 메서드를 공유**할 수 있다.

### 커스텀 생성자 만들기

**생성자는 함수**이며, 암묵적으로 **대문자로 시작**하는 이름을 가지는 것으로 약속 되어있다.

```jsx
function Factory(){}
let robot1 = new Factory();
```

new 키워드 앞에 붙게되면 실행 되었을 때, 자동적으로 객체를 생성하고 반환한다. 이러한 객체를 **인스턴스(instance)**라고 한다. 때문에 **생성자 함수와 객체의 관계는 instanceof 로 확인**이 가능하다.

> [!Note]
> 이렇듯 우리가 필요에 따라서 배열(Array), 객체(Object)를 사용하는 것 처럼, 우리가 필요할 때 사용할 수 있는 우리만의 객체를 만들어서 사용할 수 있도록 도와주는 것이 바로 생성자이다!
> 

## 프로토타입(prototype)

객체의 메서드를 등록할 때마다 새로운 함수를 생성하는 건, 자원의 낭비이다. 이것을 해결하는 것이 **프로토타입**이다.

### 프로토타입이란?

프로토타입은 어떤 공간을 가리키고 있는 특정 객체에 대한 참조이다. 

**생성자 함수가 인스턴스를 생성**하면 **숨겨진 프로퍼티[[Prototype]]이 존재**하게 된다.*(코드상으로는 `__proto__` 로 표현)* `__proto__` 프로퍼티는 자신을 만든 생성자 함수의 `prototype`을 참조하는 역할이다.

**즉, new 키워드를 통해 생성자 함수의 `prototype`과 인스턴스의 `__proto__` 가 연결**

- **추가 설명**
    
    > [!Tip]
    > 💡  `prototype` 과 `__proto__` 는 다르다
    > prototype은 오직 function안에 존재하는 참조값이며,  `__proto__`  는 객체 안에 존재하는 숨겨진 프로퍼티이다. 인스턴스는 `__proto__`를 통해 생성자 함수의 `prototype`에 접근하여 필요한 여러가지 값과 메서드를 사용할 수 있다.
    > 
  
    
    **프로토타입은 모든 인스턴스가 하나의 메서드를 공유하도록 만들어 자원을 효율적으로 사용하도록 도와준다.**
    

## 객체의 상속


자기자신에게 존재하지 않는 프로퍼티나 메서드를 프로토타입을 통해 추적하는 과정을 **프로토타입 체이닝**이라고 한다.

```jsx
function Parent() {
    this.name = '재현';
}
Parent.prototype.rename = function (name) {
    this.name = name;
}
Parent.prototype.sayName = function () {
    console.log(this.name);
}
```

```jsx
function Child() {
    Parent.call(this);
}

Child.prototype = Object.create(Parent.prototype); // 지정된 프로토타입 객체를 갖는 새 객체를 만듭니다.

Child.prototype.canWalk = function () {
    console.log('now i can walk!!');
}
```

child함수에 `call` 함수는 **Child 함수가 Parent함수 안 프로퍼티에 접근할 수 있게 만들어**준다.

> [!Note]
> ❓ 그렇다면 위와같은 상속의 **단점**이 무엇일까?
> 1. 조상을 생성할 때, 나누어 생성해야하기때문에 가독성이 떨어진다. 
> 2. 타언어(C++, 파이썬, 자바의 Class 와 같은 기능이지만, 다른 언어의 사용으로)와 연관성이 떨어져 유지보수가 어려울 수 있다.

### Class의 등장

ES6부터 타언어와 같은 Class가 등장하였다. 클라스는 `class 키워드 + 이름 + 중괄호` 로 이루어져 있다. 

```jsx
class Robot {
    // 클래스의 생성자 함수입니다. 하나의 클래스는 하나의 생성자만 정의
        //생성자 함수는 new 키워드가 호출될때 자동으로 실행
    constructor(name) {
        this.name = name;
    }

    // 메소드를 정의. 메소드는 클래스가 생성한 인스턴스를 통해 사용
    sayYourName() {
        console.log(`삐리비리. 제 이름은 ${this.name}입니다. 주인님.`);
    }
}
```

객체지향의 중요한 개념중 하나인 **인캡슐레이션**을 달성할 수 있다. 

***인캡슐레이션(Encapsulation)**은 객체 지향 프로그래밍(OOP)의 개념 중 하나로, 데이터와 해당 데이터를 조작하는 메서드들을 하나의 단위로 묶는 것이다.*

> [!Note]
> ❓ 이처럼 내부적인 동작은 동일하지만 더 보기 좋고 편리하게 개선된 문법을 슈가신텍스 (Syntactic sugar) 라고 부른다. (classes 문법은 여러가지 추가된 문법이 있다.)
> 

> [!Tip]
> 🙋🏻‍♂️ **자바스크립트는 프로토타입 기반 객체지향 언어** 
> 
> 1983년에 C 언어가 객체지향 페러다임을 받아들이면서 C++가 탄생했다.
> C++가 만들어진 이래 classes의 개념은 모든 객체지향 언어에서 공통적으로 사용되었다.
> 
> 자바스크립트가 2015년 classes 개념을 받아들이고 객체지향의 모습을 가지게 되었다.
> 
> > If I had done classes in JavaScript back in May 1995, I would have been told that it was too much like Java or that JavaScript was competing with Java. [...] I was under marketing orders to make it look like Java but not make it too big for it’s britches […] [it] needed to be a silly little brother language.
> > 
> 
> *Brendan Eich, JavaScript creator*
> 
> 이러한 이유로 자바스크립트는 classes 문법을 도입하는 대신 prototype 을 이용해 객체지향적인 코드를 구현하는 방식을 택하게 되었다고 한다.
> 

### Class로 상속


상속은 extends 키워드를 사용한다. 상속을 받은 클래스는 ‘파생 클래스’(derived classes)’라 부르며, 프로퍼티를 상속받기 위해 super 함수를 사용한다.

*super는 부모 생성자를 참조(나타낸다)*

**super 사용 주의점**

- 파생 클래스 생성자 함수를 사용하고 싶으면 super 함수를 사용.
- 파생클래스에 생성자 함수가 없다면 super 함수가 자동으로 호출되어 프로퍼티 상속을 받게 한다.
- 생성자 함수에서 **this값을 사용할 경우 super가 반드시 this 앞에 실행**되어야 한다.

```jsx
class BabyRobot extends Robot {
    constructor(name) {
				//반드시 this 앞에 선언
        super(name);
        this.ownName = '아이크';
    }

    sayBabyName() {
        this.sayYourName();
        console.log('Suceeding you, Father!');
    }
}
```
