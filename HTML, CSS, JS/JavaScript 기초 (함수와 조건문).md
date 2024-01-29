# JavaScript 기초

> 출처 : weniv

## 함수


### 함수란?

**반복적으로 필요한 코드를 하나의 덩어리로 묶어 필요할 때마다 꺼내 쓸 수 있도록 만든 것**이 **함수**가 하는 역할!

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/0bf9cdd1-567f-4a76-8a8f-bcc67d3ffda4)


```jsx
//기본적인 자바스크립트 함수 코드
function func(pars1,pars2...) {

return result
}

func(args1, args2...)
```

| 용어 | 번역 | 의미 |
| --- | --- | --- |
| Parameter | 매개변수 | 함수와 메서드에 입력 변수 이름 |
| Argument | 전달인자, 인자, 인수 | 합수와 메서드에 실제 입력되는 값 |

보통 혼용해서 사용하는 경우가 많은데, **파선아실(파라미터 선언, 아규먼트 실제)**라고 줄여 부른다.

> [!Note]
> ❓ **console.log 와 return??**
> `console.log`는 콘솔 창에 표시되는 단순 출력이며, `return`은 함수 실행의 결과 값이다. 함수 내 `return`을 만나면 함수는 종료된다.
> 

### 함수 사용 장점

1. 재사용성이 높아진다.
2. 유지보수가 용이해진다.
3. 구조파악이 쉽다.

### 함수의 활용

아규먼트(인자)는 매개변수보다 적거나 많아도 에러가 발생하지 않는다.

> [!Note]
> ❓ **함수와 메서드??**
> 자바스크립트에서는 `function func() {}` 는 함수, `{function func() {}}`가 메서드이다. **자바와 조금 개념이 다를 수 있으므로 🚨주의**해야 한다.
> 

### 함수 선언 방식

1. **함수 선언문과 함수 표현식**

함수는 **function + 함수명 + () + {} 의 조합인 구문으로 선언하는 선언문**과, 함수명 없이 선언하여 값으로 할당하는 **표현식(Expression)**으로 선언 가능하다.

```jsx
// 함수 선언문
function sum(x, y){
  return x + y;
}

// 함수 표현식
let sumXY = function(x, y){
  return x + y;
};
console.log(sum(10, 20));
console.log(sumXY(10, 20));
```

> [!Note]
> ❓ **구문(Statement)과 표현식(Expression)
> 구문은** 자바스크립트 명령문, 작업 수행을 위한 코드 블록. 반복, 조건문이 여기에 포함된다.
> **표현식은** 값으로 평가될 수 있는것을 의미. 값이나 연산자등이 여기에 해당된다. **함수표현식은 함수를 값처럼 사용하기 때문!**


1. **화살표함수**

화살표 함수는 표현식으로 사용해야 한다.**(자바의 람다식과 같다)**

> ~~선언문을 간략하게 표현식, 표현식을 간략하게 화살표함수가 아닐까??~~
> 

```jsx
//선언문
function func(x,y) { return x+y; }
//표현문
let func = function(x,y) { return x+y; };
//화살표 함수
let func = (x,y) => x+y ;
```

1. **즉시실행함수 (IIFE, Immediately Invoked Function Expression)**

함수를 정의함과 동시에 즉시 실행하는 방법이다.

```jsx
//즉시실행함수
(function() {
	document.querySelector(".btn")
					.addEventListener("click", function(){console.log('click!')});
})();
```

# 조건문

## 조건문

조건문은 조건에 따라 실행되는 코드. 조건식이 참, 거짓에 따라 코드를 수행할지 여부를 판단한다.

### if문

1. **if문 :** 가장 기본적인 조건문이다.

```jsx
let test=5;
if(test < 10) { //codes }
//조건이 참일 시 조건문 실행
```

자바와 동일하게 코드가 한 줄 일 시 중괄호를 생략할 수 있지만 가독성이 떨어질 수 있다.

1. **if-else문 :** 조건이 거짓일 경우 실행할 코드가 필요할 시 사용하는 조건문이다.

```jsx
if(x == y){
  document.write('if문으로 실행되었습니다.');
} else if(y == z){
  document.write('else if문으로 실행되었습니다.');
} else {
  document.write('else문으로 실행되었습니다.');
}
```

### 삼항연산자 **(Conditional ternary operator)**

if-else문을 간단하게 표현하는 방법이다.

```jsx
조건식 ? 참일 시 실행코드 : 거짓일 시 실행코드;
true ? console.log('true') : console.log('false');
```

**삼항연산자는** 값으로 표현되기 때문에 **표현식(Expression)**이다.

삼항연산자는 2중으로 사용하여 **코드를 가볍게 할 수 있으나**, **가독성이 떨어질 수 있다.**

> [!Note]
> ❓ **파싱?**
> 형변환이 필요한 경우가 더러 있는데 `parseInt();` 를 사용하면 형변환이 가능하다. 이러한 형변환을 **파싱**이라고 한다.
> 

### Switch문

switch문은 하나의 변수를 여러 값과 **비교**하여 **실행코드를 결정**할 수 있다.

```jsx
switch (표현식) {
  case 값1:
    // 값1에 대한 실행 코드
    break;
  case 값2:
    // 값2에 대한 실행 코드
    break;
  ...
  default:
    // 모든 case에 해당하지 않을 때 실행될 코드
    break;
}
```

표현식의 값을 **`case` 와 비교**하여 **실행**하나, 모든 값과 **일치하지 않을 경우, `default`로 진행**한다. **`break`는** Switch문을 **빠져나오는 문법**이다.

> [!Tip]
> 💡 **switch문의 특징**
> 
> - **break**에 의해서 조건문 밖으로 이동
> - 일치내용 없으면 **default** 문으로 이동
> - **default** 문은 선택사항

`break`가 없다면 switch문의 모든 코드를 비교, `default`**까지 실행**되기 때문에 🚨**유의**해야 한다.
