# JavaScript 기초

> 출처 : weniv
> 

## 반복문

### 반복문이란?

```jsx
text += '<section><h2>' + cars[0] + '</h2></section>'
text += '<section><h2>' + cars[1] + '</h2></section>'
text += '<section><h2>' + cars[2] + '</h2></section>'
text += '<section><h2>' + cars[3] + '</h2></section>'
text += '<section><h2>' + cars[4] + '</h2></section>'

console.log(text)
// document.body.innerHTML = text
// document.write(text)
```

해당 데이터를 여러 개를 반복할 때, 위 코드처럼 반복해서 작성해야 한다면, 반복된 코드를 개발자에게 불편함을 선사한다.

이러한 반복되는 코드를 자동으로 반복 시켜주는 것이 `반복문`이다.

```jsx
const cars2 = ["BMW", "Volvo", "Saab", "Ford", "Flat", "Audi"];
let text2 = ''
for (let i = 0; i < cars2.length; i++) {
    text2 += '<section><h2>' + cars2[i] + '</h2></section>' 
}
text2
document.body.innerHTML = text2;
```

### for문

```jsx
//가장 기본적인 반복문 for
for(초기화식; 조건식; 증감식) {실행문;}
```

초기화식, 조건식, 증감식은 생략할 수 있다.(조건이 갖춰졌다면).

> [!Tip]
> 💡 생략할 순 있으나, 세미콜론(`;`)은 생략할 수 없다.
> 
> 

### while문

```jsx
while (조건식) {// 조건식이 참일 때 실행될 코드}
```

조건이 거짓이 될 때까지 반복하는 반복문이다.

- **do-while문**

조건식이 거짓이더라도 반드시 실행되어야 하는 실행문이 있다면 사용한다.

`do`에서 먼저 실행 이후 `while`(반복문)을 실행하기 때문이다.

```jsx
let input;

do {
  input = prompt("숫자를 입력하세요.");
} while (isNaN(input));

console.log("입력한 숫자는 " + input + "입니다.");
```

### 반복문의 break & continue

반복문에서 조건에 따른 종료 이전에 필요에 따라 종료가 필요하다면 `break`를 사용하여 반복문을 종료시킬 수 있다. `break`는 `모든 반복문`, `switch`에서 사용 가능하다.

```jsx
// 예시 1
let num = 0;
while (num < 11) {
 num++;
 document.write(num, '<br>');
 if(num > 5){
   break;
 }
}
```

`continue`는 조건문과 같이 사용하여, `조건문`이 만족하면 그 반복은 **건너뛰고 다음 반복문으로 진행**하게 된다.

```jsx
// 예시 2
let i = 0;
while (i < 100) {
		i++;
	if (i === 14) {
			console.log(i + '살 부터 중학생이 됩니다.');
			break;
	}
}
console.log('중학교 입학을 축하합니다');
```

# 타입

## Type 이란?

자바스크립트의 타입은 자료형으로 해석된다. **다양한 데이터를 용도에 맞게 사용하기 위함**인데, **컴퓨터는 2진수로 저장하기 때문**에 컴퓨터에게 해당 데이터를 어떻게 처리될지 정하게 되는 것이다.

타입은 크게 데이터를 저장하는 **원시타입**, 객체로서 저장되는 **참조타입**으로 ****나뉜다.

### 원시타입(Primitive Types)

원시타입은 값이 변경 불가하며, 값을 변수에 저장, 전달할때 값에 의한 전달을 한다는 것. 이는 참조가 저장되는 것이 아닌, 값 자체**(가리키고 있는 값을 따라가서 실제 메모리에 저장된 주소)**가 복사되어 저장된다.

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/94684b71-7048-4d8e-aa80-17e078b75ea9)

> 데이터를 그대로 가져온다고 생각하면 된다.
> 

`string, number, bigint, boolean, undefined, symbol, null이 원시타입`

### 객체타입 (Object Types)

객체타입의 **특징**은

1. 객체는 프로퍼티로 값과 메서드를 가지며, 객체의 상태와 동작을 나타낸다.
2. 값을 변수에 저장할 때 **값의 위치**가 저장된다. 때문에 다른 변수에 할당 할때는  **값의 참조(위치)**가 저장된다.

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/28e3fc00-a171-4263-bb68-51e7b56eac5a)

> [!Tip]
> 💡 자바스크립트는 **원시타입도 마치 객체타입처럼 사용**할 수 있게 **autoboxing** 과정을 거친다.
> 이는 원시타입, 객체타입의 **일관적인 사용을 제공하기 위함**이다.
> 
> ```jsx
> let val = 'hello!';
> console.log(val.toUpperCase());
> 
> // 위의 코드가 내부적으로는 아래처럼 실행. 이것이 바로 autoboxing
> 
> let val = 'hello!';
> let temp = new String('hello!');
> console.log(temp.toUpperCase());
> temp = null;
> ```
> 
