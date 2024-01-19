
>💡 **요약와 느낀점**
>HTML의 자세한 문법을 설명한다.
>이전에 공부했던 내용이라 특별히 어려운 점은 없었던 것 같다. 좀 더 Semantic 태그를 사용하도록 노력하자!

</aside>

# **HTML 기초**

> **weniv**
> 

## **Contents**

**h1~h6(heading)** : heading 태그는 목차와 같다.(순서를 지키는 것이 좋다)

**a(anchor:닻)** (**인라인**) : 페이지의 위치, 파일, 이메일 주소 등 URL로 연결할 수 있는 하이퍼링크를 사용한다.

- href = mailto : 메일주소/ tel : 전화번호 등으로 사용 가능
- target = _self : 현재탭 / _blank : 새 탭
- download = URL에 위치하는 대상을 저장, 브라우저에서 읽을 수 있는 형식이라면 실행.

**p(paragraph)** : 하나의 문단(블록). 하나의 완결된 문장을 넣어주는 것이 중요.

**Strong :** 굵은 글꼴(**인라인**). 스크린리더에서 거센 억양으로 나타남. (Strong > em > mark)

- b(bold)와는 다름. b는 특별한 의미가 없으므로, 사용하지 않는다.

**br(line break)** : 줄 바꿈 요소. html은 \n(엔터)를 지원하지 않기 때문에 필요시 사용.

**hr(Horizontal Rule)** : 단락을 구분할 때 사용하는 구분선(블록). 실무에서 거의 사용하지 않는다.(CSS로 대체)

**code** : 프로그래밍 코드를 작성할 때 사용.

**pre(Preformatted)** : html에 작성된 텍스트 그대로 가져오는 태그. 고정폭 글꼴의 한계가 있다.

## **목록태그**

**ol(order list)** : 순차적 목록(블록) / type = 숫자(default), A, a, i, I 등으로 설정 가능. li만 자식으로 가질 수 있음.

**ul(unorder list)** : 비순차적 목록(블록) li만 자식으로 가질 수 있음.

**li(list item)** : ol, ul의 자식요소로만 사용 가능.

## Media

**img** : 문서의 이미지를 삽입

- src = 경로를 설정
- alt = 대체 텍스트(스크린 리더 고려), 이미지에 대한 설명(중복이라면 빈값으로)
- 하단에 빈공간이 생길 시 : img 또한 **인라인**이므로 CSS 설정을 추가 해준다.

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/70d61a9f-fe32-4557-9778-a295bb5c0c18)

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/32bd4778-085b-489d-9c71-d8f9be3c5e34)



## **Form태그**

사용자에게 입력 받은 정보를 제출하기 위한 문서 구획(제출 외 단순 사용 목적일 경우 사용할 필요 없다)

**method 속성**

양식을 제출할 때 사용할 HTTP 메서드. 대표적으로 GET과 POST

- **POST**

양식 데이터를 요청 본문으로 전송. **캐시되지 않고, 히스토리에 남지 않음**. 쿼리 문자열과는 별도로 전송하기 때문에 보안성이 높고, 길이 제한이 없다.

enctype = 데이터의 MIME 타입을 나타냄.(application/x-www-form-urlencoded(기본값), multipart/form-data(파일 포함 시)

- **GET**

데이터를 URL에 포함하여 “?“ 구분자 뒤에 이어 붙여 전송. **브라우저에 의해 캐시되어 저장**

### **Name/Value**

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/1fd7792b-ca21-4f0b-9f68-84a2c6c74bf2)


이름과 값을 짝으로 양식과 함께 전송

**Action 속성**

작성된 양식 데이터를 처리할 URL을 명시. 명시되지 않았을 경우, 현재 페이지의 URL로 보내진다.

**Autocomplete 속성**

입력요소를 자동입력 가능하게 할 수 있는 속성

**label 속성**

input 속성과 함께 사용. for를 사용하여 input란과 묶어줄 수 있다.

- 제목요소 배치X = 필요 시 fieldset, legend 사용.
- button과 같이 value 속성을 가진 input 요소는 필요하지 않다.

**Button 속성**

클릭 가능한 버튼 생성.

- button = 기본 action 없음. 일반적으로 JavaScript와 연결하여 사용.
- submit = 서버로 양식 데이터를 제출
- reset = 초깃값으로 돌아감.

## **INPUT 속성**

![image](https://github.com/YoHanKi/Today-I-Learned/assets/139758405/0e1ad1f0-d969-4c95-a0f4-e7020a70c034)



disabled는 수정과 전송이 안되며, readonly는 수정은 X 전송은 진행된다.

**button / reset / submit**

=> **버튼 태그와 동일**하나, **button 태그는 여는 태그와 닫는 태그 사이에 여러 컨텐츠 삽입이 가능!**

**text / password / url / search / tel**

=> maxlength/ minlength를 사용하여 문자수 길이를 조절할 수 있다.

**checkbox / radio**

=> checkbox : 다중 값 선택 또는 해제 가능 / radio : 여러개 중 하나의 값을 선택

**file**

=> accept = 파일유형을 지정 / mutiple = 지정할 경우 여러개의 파일을 선택할 수 있다.

**number**

=> 숫자 입력란 = max,min,step을 지정하여 값을 지정할 수 있다.

**Select**

**=> multiple** 여러개 항목 선택 가능 / size 한번에 노출되는 수를 조절

**fieldset**

**=>** form 관련 요소들을 묶을 때 사용. **legend로 그룹의 제목을 제공**

**textarea**

텍스트를 입력할 수 있는 영역을 만든다.

=> cols, rows, maxlength, minlength, placeholder 등으로 영역의 크기를 조절할 수 있다.

## **Table 태그**

표를 생성할 때 사용한다.

**tr(row), th(header), td(data) =** 행과 열, 셀 내용을 의미한다.

**Caption** **=** 테이블의 제목이나 설명을 의미 => **CSS caption-side로 위치를 변경**할 수 있음

**thead, tbody, tfoot** = 의미상의 테이블을 나눌 때 사용

**colspan, rowspan** = 셀병합 기능

**colgroup** = 열 그룹을 만들고 싶을 때 사용

**col =** 테이블 열을 하나 이상 묶을 때 사용. 필수 요소는 아님.

**테이블의 표준문서**

https://www.w3.org/TR/CSS21/tables.html#columns
