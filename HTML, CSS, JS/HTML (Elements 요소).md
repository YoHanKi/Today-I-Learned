# HTML 기초 (Elements 요소)
> 출처 weniv

### 프론트앤드란?

웹 브라우저에서 동작 할 수 있는 언어(HTML, CSS, JavaScript)를 이용하여 사용자가 이용하는 웹페이지를 만드는 작업

기존 프론트앤드는 백엔드 개발자가 병행하였으나, 모바일의 폭발적인 성장으로 인해 프론트앤드의 중요성이 높아지게 됨

### **퍼블리셔?**

![Untitled (11)](https://github.com/YoHanKi/BootCamp/assets/139758405/8424b97a-f9d4-42c8-a590-1b794c6adb82)


프론트앤드 이전의 용어로써, 일반적으로 하는일은 비슷하다.(정확히는 이미지를 편집하느냐에 따라 다름)

### **프론트앤드가 해야할 일**

성능측정(에니메이션 퍼포먼스, 서버와의 통신시간, 지연시간), 웹 렌더링(렌더링 성능 최적화), 웹 접근성(스크린 리더, 색약 색맹 고려), 웹 표준 준수, 검색엔진 최적화(SEO), 레거시 브라우저 대응(IE, 모바일), R&D(미래 기술 대비), 디자이너와 기획자 조율

이와같이 프론트앤드가 하는일은 다양하므로, 백엔드 개발자가 협업에 있어 이해하고 접근하는 것이 중요하다.

## **HTML**

**서로 다른 컴퓨터에서 동일한 문서의 공유를 위해 처음 개발 되었다. HTML(hyper text markup language)로 작성된 문서를 HTTP(Hyper text transfer protocol) 방식으로 보내는 것**

### 요소(Elements) 분석

### 태그(tag)

![Untitled (10)](https://github.com/YoHanKi/BootCamp/assets/139758405/af2daef4-9d15-488a-aba5-4e6acbfe0fd3)


HTML는 브라우저가 코드에서 발생한 예외를 대신 처리해주기 때문에 오류를 알려주지 않고 웹브라우저가 임의로 결과를 보여주므로, 마크업 검사를 진행하는 것이 좋다.

- 예외처리 : 예외 상황을 대비한 코드

https://validator.w3.org/ => 마크업 검사 서비스

![Untitled (6)](https://github.com/YoHanKi/BootCamp/assets/139758405/ae346230-e19f-4194-bf12-8e8f282d2c4a)


![Untitled (8)](https://github.com/YoHanKi/BootCamp/assets/139758405/a87aac56-7119-4b5c-a912-2f35ff71c90f)

문법이 잘못되어도 특별한 예외를 발생하지 않고 진행한다.

### **빈 요소/셀프 클로징**

닫는 태그가 없는 요소가 존재한다.<br><input><img> 등은 없이도 가능하다.(XHTML에서는 /으로 닫아줘야한다)

### **주석 => Ctrl+/ 사용가능**

협업에 있어 코드 분석이 난해하기 때문에, 주석으로 표시하는 것이 중요하다.

### **부모, 형제, 자식, 자손**

![Untitled (9)](https://github.com/YoHanKi/BootCamp/assets/139758405/2a67848d-3fdd-4ada-a166-78195eb6a2ad)


HTML, CSS를 작성하다 보면 부모, 형제, 자식 등등 자주 사용하게 되는데 난해하기 때문에 이해하는 것이 중요하다.

### **HTML의 기본적 해석**

!DOCTYPE html

**=> html Living Standard 문서라는 의미/ DTD(Document type Definition)이라고 함**

**미작성 시 쿼크모드(하위호환이 가능하도록 랜더링 방식이 달라짐)로 실행되기 때문에 조심.**

html lang="en"

**=> 문서의 루트, 최상단 요소. 스크린 리더의 기본 설정 요소가 된다.**

head

**=> 기계가 식별할 수 있는 문서 정보(meta data)를 담고 있다.**

meta charset="UTF-8"

**=> 문자 세팅 정보(UTF-8은 세계 규약)**

meta http-equiv="X-UA-Compatible" content="IE=edge"

**=> 브라우저 호환성을 위해 작성**

meta name="viewport" content="width=device-width, initial-scale=1.0"

**=> viewport = 사용자가 보고 있는 화면을 의미 / width = device-width 기기와 넓이가 동일 / initial 화면 비율은 1.0**

title

**=> 브라우저의 제목 표시줄이나 페이지 탭에 보이는 문서 제목을 정의(60자 이하)**

link rel="stylesheet" href="style.css"

**=> 외부 스타일 시트, 폰트, 파비콘을 연결할 때 사용/hyper-references 경로. 연결 시 참조할 파일의 위치**


mozilla 재단의 사이트. HTML 관련해서 표준문서에 가장 가까움.

https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/rel **HTML 관련 자료**

### **블록요소**

부모 요소의 공간만큼 본인의 크기도 가진다. 블록라인을 선언 시 언제나 새로운 줄에서 시작, 좌우 양측으로 최대한 늘어나 가능한 모든 너비를 차지, 구조적 요소를 나타낼 때 사용한다.

**인라인 요소 안에 블록 요소는 들어갈 수 없다.(문법적 오류이지만 예외가 발생하지 않으므로 유의)**

*예외적으로 <a> 태그는 블록 요소 중첩이 가능하다.*

### **인라인 요소**

항상 블록 레벨 요소 내에 사용. 할당된 공간만 차지한다. width, height 등 크기를 지정할 수 없고, padding, border, margin 속성을 사용할 순 있지만 상하 margin 불가.

### **HTML 태그**

**용도에 맞게 구분해서 사용해야 협업과 기계가 인식하기에 편리하다.(하위호환성을 고려하여 작성하는 방식도 존재. IE의 경우 인식을 못할 때, 커스텀 태그로 인식하여 의도와 다르게 보일 가능성이 높음)**

div(division) : 컨텐츠 분할 요소(**블록**) = 스타일을 주기 전까진 어떠한 영향도 주지 않음. **스타일 적용을 위한 용도로 사용할 것을 권장**

span(content span) : 컨텐츠 분할 요소(**인라인**) = div와 동일

**Sections(IE에서 작동하지 않을 가능성 높음) 구획을 나누기 위한 요소**

header : 소개 및 탐색에 도움(head 태그와 혼동 x, 중첩, footer 사용 x)

main : body의 주요 콘텐츠

footer : 페이지의 작성자, 저작권정보, 관련 문서 등의 내용

nav(navigation bar) : 다른 페이지로의 링크를 사용. 메뉴, 목차, 브래드크럼(breadcrumb)으로 사용.

article : 독립적인 부분(영역이 제거되어도 문제가 없는 부분)

section : 제목 요소를 자식으로 포함(의미가 있는 구획을 나눌 때 사용)

aside : 각주, 광고, 배너등에 일반적으로 사용
