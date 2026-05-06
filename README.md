# 202530128 정하형 java2 

## 5/6

### ArrayList 와 벡터의 차이
- 동적으로 크기가 늘어나는 배열 기반의 클래스 입니다.
- 요즘은 ArrayList 가 기본 선택지
- Vector는 이제 거의 사용하지 않고, 멀티스레드가 필요하면 다른 방법을 사용해라

### ArrayList<E>
- 가변 크기 배열을 구현한 클래스
- 백터와 거의 동일
- 다수의 스레드가 동시에 ArrayList 에 접근할 때 동기화 되지 않음

### 제네릭은 형판과 같은 개념
- 제네릭 클래스나 메서드를 형판에서 찍어내듯이 생성할수 있다.

### 컬렉션의 특징
- 컬렉션은 제네릭 기법으로 구현
- 제네릭
- 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메서드를 일반화 시키는 기법 
- 클래스나 인터페이스 이름에 <E>, <K>, <V> 등 타입 매게변수
- 제네릭 컬렉션 사례 : 벡터
- <E> 에서 E 에 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 활용
- 정수만 다루는 컬렉션 벡터 Vector<Integer>

### 컬렉션의 개넘
- 요소 라고 불리는 가변 개수의 객체들의 저장소
- 객체들의 컨테이너라고도 불림
- 요소의 개수에 따라 크기 자동 조절
- 요소의 삽입, 삭제에 따른 요소의 위치 자동 이동
- 고정 크기의 배열을 다루는 어려움 해소
- 다양한 객체들의 삽입 삭제 검색 등의 관리 용이

## Math 클래스 
- 기본 산술 연산 메소드를 제공하는 클래스
- 모든 메서드는 static 으로 선언
- 클래스 이름으로 호출가능
- Math.random() 메서드로 난수 발생
- random() 은 0 보다 크거나 같고 1.0 보다 작은 실수 난수 발생
- 1에서 100 까지의 랜덤 정수 10개를 발생시키는 코드 사례

### StringTokenizer 클래스
- 구분 문자를 기준으로 문자열을 분리한느 클래스 
- 구분 문자 : 문자열을 구분할 때 사용되는 문자
- 토큰 : 구분 문자로 분리된 문자열

### StringBuffer 클래스
- 가변 스트링을 다루는 클래스
- String 클래스와달리 문자열 변경 가능
- 가변 크기의 버퍼를 가지고 있어 문자열 수정 가능
- 문자열의 수정이 많은 작업에 적합

### trim
- 키보드나 파일로부터 스트링을 입력시  스트링 앞뒤 공백이 끼는 경우가 많다. -> trim() 을 이용하면 스트링 앞 뒤에 있는 공백제거

### String 활용 
- 스트링 비교, equalse() 와 compareTo()
- 스트링 비교에 == 연산자 절대 사용 금지
- equalse() : 스트링이 같으면 true , 아니면 false

- int compareTO(String anotherString)
- 문자열이 같으면 0 리턴
- 이 문자열이 anotherString 보다 먼저 나오면 음수 리턴
- 이 문자열이 anotherString 보다 나중에 나오면 양수 리턴

### 스트링 객체의 주요 특징
- 스트링 객체는 수정 불가능
- 리터럴 스트링이든 new String() 이든 

### 스트링 리터럴과 new String()
- 스트링 링터럴 
- 자바 가상 기계 내부에서 리터렐 테이블에 저장되고 관리됨
- 응용프로그램에서 공유됨
- 스트링 리터럴 사례 : String s= "abc";


### String의 생성과 특징
- 자바는 기본 데이터 타입에 String 이 없음. 대신 String 클래스를 제공

### 박싱과 언박싱
- 박싱 :  기본타입의 값을 Wrapper 객체로 변환하는것
- 언박싱 : Wrapper 객체에 들어 있는  기본타입의 값을 빼내는 것 . 박싱의 반대.

- 자동박식과 자동 언박싱 : JDK 1.5 부터 박싱과 언박싱은 자동으로 이루어지도록 컴파일 됨

### 주요 메서드 
- 가장 많이 사용하는 Integer 클래스의 주요 메서드 : 다른 Wrapper 클래스의 메서드는 이와 유사

### Wrapper 클래스
- Wrapper 클래스 : 자바의 기본 타입을 클래스한 8개 클래스 통칭
- 용도 : 객체만 사용할 수 있는 컬렉션 등에 기본 타입의 값을 사용하기 위해 Wrapper 객체로 만들어 사용

### Object 클래스
- 모든 자바 클래스는 반드시 Object 를 상속바도록 자동 컴파일
- 모든 클래스의 수퍼 클래스
- 모든 클래스가 상속받는 공통 메서드 포함

### 자바 플랫폼의 모듈화
- 자바 플랫폼
- 자바의 개발 환경과 자바의 실행환경을 지칭. JAVA SE 포함
- 자바 API 의 모든 클래스가 여러 개의 모듈로 재구성됨
- 모듈 파일은 JDK 의 jmods 디렉터리에 저장하여 배포 

### 모듈 개념
- java 9 에서 도입된 개념
- 패키지와 이미지 등의 리소스를 담은 컨테이너
- 모듈 파일(.jmod) 로 저장

### package 의 운영 방법
- 패키지 이름은 도메인 기반으로 시작 
- 형식 : com.회사이름.프로젝트명.기능
- 기능 역할별로 하위 패키지를 구분
- 디렉터리 구조와 package 선언을 정확히 일치해야함
- import 는 필요한 만큼만 * 전체 import 는 피하는 것이 좋습니다.

### 디폴트 패키지
- package 선언문이 없는 자바 소스 파일의 경우
- 컴파일러는 클래스나 인터페이스를 디폴트 패키지에 소속시킴
- 디폴트 패키지 -> 현재 디렉터리

### 패키지 만들기
- 클래스 파일 이 저장되는 위치는?
- 클래스나 인터페이스가 컴파일 되면 클래스 파일 생성
- 클래스 파일은 패키지로 선언된 디렉터리에 저장
- 패키지 선언
- 소스 파일의 맨앞에 컴파일 후 저장될때 패키지 지정 -> 패키지 명

## 4/29

### 자바 패키지와 모듈이란?
- 패키지 
- 서로 관련된 클래스와 인터페이스를 컴파일한 클래스 파일들을 묶어 놓은 디렉터라
- 하나의 응용 프로그램은 한 개 이상의 패키지로 작성
- 패키지는 jar 파일로 압축할 수 있음

- 모듈 
- 여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너
- 하나의 모듈만 하나의 .jmod 파일에 저장

- java 9 부터 모듈화 도입
- 플랫폼의 모듈화 : java 9 부터 자바 API 의 모든 클래스들(자바 실행환경)을패키지 기반에서 모듈들로 완전히 재구성
- 응용프로그램의 모듈화 : 클래스들은 패키지로 만들고, 다시 패키지를 모듈로 만듦 모듈 프로그래밍은 어렵고 복잡

### 패키지 개념과 필요성
- 3명이분담하여 자바 응용프로그램을 개발하는 경우, 동일한 이름의 클래스가 존재할 가능성이 있음.
- 합칠 때 오류 발생 가능성.

### 추상클래스 vs 인터페이스
- 공통점
- 추상 메서드를 가지고 있어야 한다.
- 인스턴스화 할 수 없다.
- 상속받아 구현한 구현체의 인스턴스를 사용해야 한다.
- 상속한 클래스는 추상 메서드를 반드시 구현해야 한다.

### 인터페이스의 구성 요소들의 특징
- 상수 : public 허용 , public static final 생략
- 추상 메서드 : public abstract 생략가능
- default 메서드 :
- 인터페이스에 코드가 작성된 메서드
- 인터페이스를 구현하는 클래스에 자동 상속
- public 접근 지정만 허용. 생략가능


### 자바의 인터페이스
- 소프트웨어를 규격화된 모듈로 만들고 , 인터페이스가 맞는 모듈을 조립하듯이 응용프로그램을 작성하기 위해서 사용
- 자바의 인터페이스 
- 클래스가 구현해야 할 메서드 들이 선언되는 추상형
- 인터페이스 선언 : interface 키워드로 선언. 

### 추상 클래스의 목적
- 추상 클래스의 목적
- 상속을 위한 슈퍼 클래스로 활용하는 것
- 서브 클래스에서 추상 메서드 구현
- 다형성 실현

### 추상 클래스의 상속과 구현
- 추상 클래스 상속
- 추상 클래스를 상속받으면 추상 클래스가 됨
- 서브 클래스도 abstract 로 선언해야함

- 추상클래스 구현
- 서브 클래스에서 슈퍼 클래스의 추상 메서드 구현
- 추상 클래스를 구현한 서브 클래스는 추상 클래스가 아님

### 추상 클래스의 인스턴스 생성
- 추상 클래스는 온전한 클래스가 아니기 때문에 인스턴스를 생성할수 없음


### 추상 클래스 
- 추상 메서드 
- : abstract 로 선언된 메서드, 메서드의 코드는 없고 원형만 선언

- 추상 클래스 
- 추상 메서드를 가지며, abstract 로 선언된 클래스
- 추상 메서드 없이 , abstract 로 선언한 클래스

### 오버로딩과 오버라이딩

- 메소드 오버로딩
- 조건 : 메서드의 이름은 반드시 동일함 메서드 인자의 개수나 인자의 타입이 달라야 성립

- 메서드 오버라이딩
- 메서드의 이름 인자의 타입 인자의 개수 인자의 리턴 타입 등이 모두 동일하여야 성

### 예제 메소드 오버라이딩으로 다형성 실현
```java
public class Ex54MethodOverridingEx {
    static void paint(Shape p) {
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
  
        paint(new Shape());
        paint(new Circle());
        paint(new Rect());
    }
}

class Shape {
    public void draw(){
        System.out.println("Shape");
    }
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
```

### 오버라이딩 목적, 다형성 실현
- 오버라이딩으로 다형성 실현
- 하나의 인터페이스에 서로 다른 구현
- 슈퍼 클래스의 메서드를 서브 클래스에서 각각 목적에 맞게 다르게 구현
- 사례 : Shape의 Draw() 메서드를 Line,Rect,Circle에서 오버라이딩하여 다르게 구현]

### 서브 클래스 객체오와 오버라이딩 메서도 호출
- 오버라이딩 한 메서드가 실행됨을 보장

### 메소드 오버라이딩
- 서브 클래스에서 슈퍼 클래스의 메소드 중복 작성
- 슈퍼 클래스의 메소드 무력화, 항상 서브 클래스에 오버라이딩한 메서드가 실행되도록 보장됨
- 메서드 무시하기로 번역되기도 함
- 오버라이딩 조건
- 슈퍼 클래스 메서드의 원형(메서드 이름,인자 타입및개수,리턴 타입) 동일 하게 작성

### 다운 캐스팅
- 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
- 업캐스팅 된 것을 다시 원래대로 되돌리는 것
- 반드시 명시적 타입 변환 지정

### 그렇다면 왜 p = s 로 업캐스팅을 한 걸까?
- 이 사례는 업캐스팅의 제한 사항을 설명하기 위한 코드 입니다.
- 실제로는 이런 식으로 업 캐스팅을  사용하지 않습니다.
- 실제로는 여러 자식 클래스를 하나의 부모 타입으로 다루기 위해 사용합니다.
- 이렇게 하면 공통된 타입 으로 여러 자식 클래스를 한 배열에 담을수 있습니다.
- 대신 접근은 Person 수준에서만 가능합니다.


### 업 캐스팅 개념
- 하위 클래스의 레퍼런스는 상위 클래스를 가리킬 수 없지만, 상위 클래스의 레퍼런스는 하위 클래스를 가리킬 수 있다는 설명.
- 생물이 들어가는 박스에 사람이나 코끼리를 넣어도 무방
- 사람이 코끼리 모두 생물을 상속받았기 때문
- 업 캐스팅이란 
- 서브 클래스의 레퍼런스를 슈퍼 클래스 레퍼런스에 대입
- 슈퍼 클래스 레퍼런스로 서브 클래스 객체를 가리키게 됨

### 예제 super()를 활용한 ColorPoint 작성
```java
class Point1 {
    private int x,y;

    public Point1() {
        this.x = this.y = 0;
    }

    public Point1(int x,int y){
        this.x = x; 
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint1  extends Point1{
    private String color;
    public ColorPoint1(int x,int y ,String color) {
        super(x,y);
        this.color = color;
    } 

    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}

public class Ex52SuperEx {
    public static void main(String[] args) {
        ColorPoint1 cp = new ColorPoint1(5, 6, "blue");
        cp.showColorPoint();
    }
}

```

### 서브 클래스와 슈퍼 클래스의 생성자 선택
- 슈퍼 클래스와 서브 클래스 : 각각 여러 개의 생성자 접근 가능
- 서브 클래스의 객체가 생성될 때 : 슈퍼 클래스 1개와 서브 클래스 생성자 1개 가 실행
- 서브 클래스의 생성자와 슈퍼클래스의 생성자가 결정되는 방식
- 개발자의 명시적 선택
- 서브 클래스 개발자가 슈퍼 클래스의 생성자 명시적 선택

### 슈퍼 클래스의 멤버에 대한 서브 클래스의 접근
- 슈퍼 클래스의 private 멤버 : 서브클래스에서 접근 x
- 슈퍼 클래스의 디폴트 멤버 : 서브 클래스가 동일한 패키지에 있을 때 접근가능
- 슈퍼 클래스의 public 멤버 : 서브 클래스는 항상 접근 가능

### 자바 상속의 특징
- 클래스 다중 상속 불허
- 자바는 인터페이스 다중 상속 가능


### 예제 클래스 상속 
```java
public class Ex51ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.setColor("red");
        cp.set(3, 4);
        cp.showColorPoint();
    }

}

class Point {
    private int x,y;

    public void set(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" +x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color =color;
    }

    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}
```

### 클래스 상속과 객체
- 상속 선언 : extends 키워드 사용
- 부모 클래스를 물려받아 자식 클래스를 

## 4/15

### static 의 활용
- 전역 변수와 전역 함수를 만들때 활용
- 공유 멤버를 만들 때 : static 으로 선언한 멤버는 클래스의 객체들 사이에 공유

### 접근 지정자 
- 접근 지정자 4가지 : public private protected 디폴트
- 접근 지정자의 목적
- 클래스나 일부 멤버를 공개하여 다른 클래스에 접근하도록 허용
- 객체 지향 언어의 캡슐화 정책은 멤버를 보호하는것 접근 지정은 캡슐화에 묶인 보호를 일부 해제할 목적으로 사용

### 자바의 패키지 개념
- 패키지
- 상호 관련있는 클래스파일 을 저장하여 관리하는 디렉토리
- 자바 응용프로그램은 하나 이상의 패키지로 구성

### 가비지 컬렉션
- JVM 가비지 자동 회수
- 가용 메모리 공간이 일정 이하로 부족해질때
- 가비지를 수거하여 가용 메모리 공간으로 확보
- 가비지 컬렉터 에 의해 자동 수행
- 강제 가비지 컬렉션 강제 수행
- 이 코드는JVM 에 강력한 가비지 컬렉션 요청

### 가비지
- 가리키는 레퍼런스가 하나도 없는 객체
- 더 이상 접근할 수 없어 사용할 수 없게 된 메모리
- 가비지 컬렉션 : 자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집, 반환

### 객체 소멸
- new 로 할당 받은 객체와 메모리를 jvm 으로 되돌려 주는 행위
- 자바는 객체 소멸 연산자 없음
- 객체 소멸은 JVM 의 고유한 역할

- C/C++ 에서는 할당 받은 객체를 개발자가 프로그램 내에서 삭제해야함
- C/C++ 의 프로그램 작성을 어렵게 만드는 요인
- 자바에서는 사용하지 않는 객체나 배열을 돌려주는 코딩 책임으로부터 개발자 해방

### 객체 치환 시 주의점
- 객체 치환은 객체 복사가 아니며 레퍼런스 복사이다.

### 메서도 오버로딩 
- 한 클래스 내에서 두 개 이상의 이름이 같은 메서드 작성
- 메소드 이름이 동일해야 함 
- 매게 변수의 개수 혹은 타입이 달라야함
- 리턴 타입은 오버로딩 과 관련없음
- 성공한 오버로딩과 메서드 호출

### 인자 전달 - 배열이 전달되는 경우
- 배열 레퍼런스만 매개 변수에 전달 : 배열 통쨰로 전달되지 않음
- 객체가 전달되는 경우와 동일 : 매게변수가 실인자의 배열 공유

### 인자 전달 - 기본 타입의 값이 전달되는 경우
- 매게변수가 byte, int , double 등 기본 타입으로 선언되었을 때
- 호출자가 건네는 값이 매게변수에 복사되어 전달. 실 인자값은변경되지 않음


### 메서드 
- 메서드는 C/C++ 의 함수와 동일하다
- 자바의 모든 메서드는 반드시 클래스 안에 있어야 한다(캡슐화 원칙)
- 메서드 형식
- 접근 지정자 : 다른 클래스에서 메서드를 접근할 수 있는지 여부 선언
- public private protected 디폴트
- 리턴 타입 : 메소드가 리턴하는 값의 데이터 타입

### 예제 
```java
class Circle {
    int radius;

    public Circle(int radius) {
        this.radius  =radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

}

public class Ex46CircleArray {

    public static void main(String[] args) {
        Circle[] c;
        c = new Circle[5];
        
        for(int i = 0 ; i < c.length ; i++) {
            c[i] = new Circle(i);
        }

        for(int i = 0 ; i < c.length; i++) {
            System.out.println((int)(c[i].getArea()) + " ");
        }
    }    
}
```

### 객체 배열
- 객체에대한레퍼런스 배열
- 자바에 객체 배열 만들기 3단계
- 1. 배열 레퍼런스 변수선언
- 2. 레퍼런스 배열 생성
- 3. 배열의 각 원소 객체 생성

### this 레퍼런스
- 객체 자신에 대한 레퍼런스
- 컴파일러에 의해 자동 관리, 개발자는 사용하기만 하면 됨
- this 멤버 형태로 멤버를 접근할 때 사용

### 생성자의 종류
- 기본 생성자 매게 변수 없고, 아무 작업 없이 단순 리턴하는 생성자
- 기본 생성자가 자동 생성 되는 경우
- 클래스에 생성자가 하나도 선언되어 있지 않을 때
- 컴파일러에 의해 기본 생성자를 자동 생성하지 않는다.

### 예제
```java
public class eX44Book {
    String title;
    String author;

    public eX44Book(String t) {
        title = t;
        author = "작자미상";
    }

    public eX44Book(String t,String e) {
        title = t;
        author = e;
    }

    public static void main(String[] args) {
        eX44Book littlePrince = new eX44Book("어린 왕자","생텍쥐페리");
        eX44Book loveStroy = new eX44Book("춘향");
        System.out.println(littlePrince.title +  " "  +littlePrince.author);
        System.out.println(loveStroy.title +  " " + loveStroy.author);
    }
}
```

### 생성자의 특징
- 생성자 이름은 클래스 이름과 동일
- 생성자는 여러 개 작성 가능
- 생성자는 객체 생성시 한 번만 호출
- 생성자의 목적은 객체 생성 시 초기화
- 생성자는 리턴 타입을 지정할 수 없음

### 생성자 개념과 목적
- 생성자
- 객체가 생성될 때 초기화 목적으로 실행되는 메서드
- 객체가 생성되는 순간에

### 예제 Rectangle 클래스 만들기 연습
```java
import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close();
    }
}
```

### 예제
- 반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스이 객체를 생성하라
```java
public class Ex41Circle {
    int radius;
    String name;

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Ex41Circle pizza;
        pizza = new Ex41Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + " 의 면적은 " + area);

        Ex41Circle donut = new Ex41Circle();
        donut.radius = 2;
        donut.name = "자바 도넛";
        area =donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}

```

### 자바 클래스 구성
- class 키워드 선언
- 멤버 : 클래스 구성 요소. 필드와 메서드
- 클래스에 대한 public 접근 지정 : 다른 모든클래스에서 사용 허락
- 멤버에 대한 public 접근 지정 : 다른 모든 클래스에게 멤버 접근 허용

## 4/8

### 자바 클래스의 구성
- class 키워드로 선언
- 멤버 : 클래스 구성 요소.
- 클래스에 대한 public 접근 지정 : 다른 모든 클래스에서 클래스 사용 허락
- 멤버에 대한 public 접근 지정 : 다른 모든 클래스에게 멤버 접근 허용

### 클래스와 객체
- 클래스 : 객체의 속성과 행위 선언. 객채의 설계도 혹은 틀

- 객체 : 클래스의 틀로 찍어낸 실체
- 프로그램 실행 중에 생성되는 실체
- 메모리 공간을 갖는 구체적인 실체
- 인스턴스 라고도 부름



### 객체지향언어의목적
- 소프트웨어 생산성 향상
- 컴퓨터 산업 발전에 따라 소프트웨어의 생명 주기 단축
- 소프트웨어를 빠른 속도로 생산할 필요성 증대

- 객체지향언어
- 상속 , 다형성 , 객체 , 캡슐화 등 소프트웨어 재사용을 위한 여러 장치 내장
- 소프트웨어 재사용과 부분 수정 빠름
- 소프트웨어를 다시 만드는 부담 대폭 줄임
- 소프트웨어 생산성 향상

### 다형성
- 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것
- 사례
- 메소드 오버로딩 : 한 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드
- 메소드 오버라이딩 : 슈퍼 클래스의 메소드를 동일한 이름으로 서브클래스마다 다르게 구현

### 자바의 상속
- 상위 클래스의 멤버를 하위 클래스가 물려받음
- 상위 클래스 : 슈퍼 클래스
- 하위 클래스 : 서브 클래스, 슈퍼 클래스 코드의 재사용, 새로운 특성 추가 가능

### 상속
- 상위 객체의 속성이 하위 객체에 물려 줌
- 하위 객체가 상위 객체의 속성을 모두 가지는 관계
- 실세계의 상속 사례
- 나무는 식물의 속성과 생물의 속성을 모두 가짐
- 사람은 생물의 속성은 가지지만 식물의 속성은 가지고 있지 않음

### 자바의 객체 지향 특성
- 캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게하는것
- 객체의 가장 본질적인 특징
- 외부의 접근으로부터 객체 보호

- 자바의 캡슐화 
- 클래스 객체 모양을 선언한 틀
- 객체 : 생성된 실제 : 클래스 내에 메서드와 필드 구현

### 자바의 예외 클래스
- 자바는 응용프로그램이 실행 중 오류를 탐지 할 수있도록 많은 예외 클래스 형태로 제공

### 자바의 예외 처리, try-catch-finally 문
- 예외 처리 : 발생한 예외에 대해 개발자가 작성한 프로그램 코드에서 대응하는 것
- try-catch-finally 문 사용. finally 블록은 생략 가능

### 예외처리 예제
```java
import java.util.Scanner;

public class Ex312DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;
        
        System.out.println("나뉨수를 입력하세요 : ");
        dividend = scanner.nextInt();
        System.out.println("나눗수를 입력하세요 : ");
        divisor = scanner.nextInt();
        System.out.println(dividend  + " 를 " + divisor + "로 나누면 몫은" 
            + dividend / divisor + "입니다"
        );
        scanner.close();
    }
}

```

### 자바의 예외 처리
- 예외 : 실행 중 오동작이나 결과에 악영향을 미치는 예상치 못한 발생 
- 자바에서 실행 중 발생하는 에러를 예외 처리

- 실행 중 예외가 발생하면 : 자바 플랫폼은 응용프로그램이 예외를 처리하도록 호출
- 응용프로그램이 예외를 처리하지 않으면 프로그램 강제 종료 시킴

- [예외 발생 경우]
- 정수를 0 으로 나누는 경우
- 배열의 크기보다 큰 인덱스로 배열의 원소를 접근하는 경우
- 정수를 읽는 코드가 실행 되고 있을 때 사용쟈가 문자를 입력한 경우


### 메소드의 배열 리턴
- 배열의 레퍼런스만 리턴, 배열 전체가 리턴되는 것은 아님
- 메소드의 리턴 타입
- 리턴하는 배열 타입과 리턴을 받는 배열 타입일치
= 리턴 타입에 배열의 크기를 지정하지 않음


### 2차원 배열 생성 및 활용하기
```java
public class Ex39ForeachEx {
    public static void main(String[] args) {
        double score[][] = {
            {3.3,3.4},
            {3.5,3.6},
            {3.7,4.0},
            {4.1,4.2}
        };  

        double sum = 0;

        for(int year = 0 ; year <score.length; year++) {
            for(int term = 0 ; term< score[year].length; term++) {
                sum += score[year][term];
            }
        }

        int n = score.length;
        int m = score[0].length;

        System.out.println("4년 전체 평점 평균은 " + sum / (n*m));
    }
}
```

### 2차원 배열
- 2차원 배열 선언
- 2차원 배열 생성
- 2차원배열의 구조
```java
int intArray[][];
intArray = new int[2][5];
```

### 예제 for-each 문 활용
- for-each 문을 활용하여 int[] 배열의 합을 구하고, String[] 배열의 문자열을 출력하는 사례를 보인다.
```java
```

### 배열의 for-each 문
- for-each 문 : 배열이나 나열의 원소를 순차 접근하는데 유용한 for 문
- for-each 문으로 정수 배열의 합을 구하는 사례
```java
int[] n = {1,2,3,4,5};
int sum = 0;
for(int k : n) {
    sum += k;
}
```

### 배열의 length 필드 활용
- 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 평균을 출력하라

### 함수 호출 시 배열 전달 비교 
- 자바가 c/c++ 에 비해 배열을 다루기 10배 편한 구조임

### 배열의 크기, length 필드
- 자바의 배열은 객체로 처리
- 배열의 크기는 배열 개체의 length 필드에 저장
- length 필드를 이용하여 배열의 모든 값을 출력하는 사례

## 4/1

### 예제 37
```java
import java.util.Scanner;

public class Ex37ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[];
        intArray = new int[5];

        int max = 0;
        System.out.println("양수 5 개를 입력하세요");

        for(int i = 0 ; i < 5 ; i++) {
            intArray[i] =   scanner.nextInt();
            if(intArray[i] > max){
                max =intArray[i];
            }
        }

        System.out.println("가장 큰 수는 " +max + " 입니다.");

        scanner.close();
    }
}
```

### 레퍼런스 치환과 배열 공유
- 레퍼런스 치환으로 두 레퍼런스가 하나의 배열 공유


### 배열 인덱스와 배열 원소 접근
- 배열의 인덱스는 0부터 크기는 1 부터
- 인덱스를 잘못 사용한 경우
- 반드시 배열 생성 후 접근

### 배열 선언 및 생성 디테일
- 배열은 선언과 생성의 두 단계 필요 : 선언과 동시에 생성할 수 있음
- 배열 선언 : 배열 이름 선언
- 배열 생성 : 배열 공간 할당 받는 과정
- 배열 초기화 : 배열 생성과 값 초기화

### 배열 
- 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조로 한 번에 많은 메모리 공간 선언
- 같은 타입의 데이터들이 순차적으로 저장되는 공간으로 인덱스를 이용하여 원소 데이터접근.
- 반복문을 이용하여 처리하기 에 적합한 자료구조
- 배열 인덱스 : 0 부터 시작

### break 예제
```java
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit 를 입력하면 종료됩니다.");
        while(true) {
            System.out.println(">>");
            String text = scanner.nextLine();
            if(text.equals("exit")){
                break;
            }

        }
        System.out.println("종료합니다.");
        
        scanner.close();
    }

}
```

### break 문
- 반복문 하나를 즉시 벗어날 때 사용. 하나의 반복문 벗어남
- 중첩반복의 경우안쪽 반복문의 break 문이 실행되면 안쪽 반복문 벗어남

### continue 예제 
```java
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 5 개 입력하세요");

        int sum = 0;

        for(int i = 0 ; i < 5 ; i++) {
            int n = scanner.nextInt();
            if(n <= 0) {
                continue;
            }
            else {
                sum += n;
            }
            System.out.println("양수의 합은 :" + sum);
        }

        scanner.close();
    }
}
```

### continue 문
- 반복문을 빠져 나가지 않고 , 다음 반복으로 제어변경.
- 반복문에서

### 예제 2

```java
public class Ex34NextedLoop {
    public static void main(String[] args) {

        System.out.println("구구단을 가로로 출력하는 프로그램");

        for(int i = 2 ; i < 10 ; i++) {
            System.out.println("[" + i + "단] \t");
        }

        for(int i = 1 ; i < 10 ; i++) {
            for(int j = 2 ; j < 10 ; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.err.println();
        }
    }
}
```

### 예제 1

```java
public class Ex34NextedLoop {
    public static void main(String[] args) {
        // 2 단 부터 9단 까지 반복
        for(int i = 2 ; i < 10 ; i++) 
        {
            System.out.println("[" + i +"단]");
            // 각 단의 1 부터 9 까지 곱셈
            for(int j = 1 ; j < 10 ; j++) {
                System.out.print(i+"*" + j + "=" + i*j);
                System.out.println("\t");
            }
            // 단이 끝날 때마다 줄바꿈
            System.out.println();
        }
    }
}
```

### 중첩반복
- 반복문이 다른 반복문을 내포하는 구조

```java
public class Ex34NextedLoop {
    public static void main(String[] args) {
        for(int i = 1 ; i < 10 ; i++) 
        {
            for(int j = 1 ; j < 10 ; j++) {
                System.out.println(i+"*" + j + "=" + i*j);
                System.out.println("\t");
            }
            System.out.println();
        }
    }
}
```

### do-while 문
- 작업문은 한 번 반복 실행.
- 조건식이 참인 동안 반복 실행

### while 문
- while 문의 구성과 코드 사례 : 조건식이 참인 동안 반복 실행



### 예제
```java
public class Ex01 {
    public static void main(String[] args) {
        int i , sum =0;

        for(i = 1 ; i <= 10 ; i++) {
            sum +=i;
            System.out.println(i);

            if(i <= 9){
                System.out.println("+");
            } 
            else {
                System.out.println("=");
                System.out.println(sum);
            }
        }
    }
}
```

### 반복문과 배열 그리고 예외 처리

### switch 예제
```java
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("월 (1~12)을 입력하시오");
        int month = scanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄 입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름 입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을 입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울 입니다.");
                break;
            default:
                break;
        }
    }
}
```

### switch 문에서 break 의 역할
- switch 문 내의 break문

### switch 문
- switch 문의 식과 case 문의 값 비교


### 다중 if-else 문
- 다중 if 문 
- 조건문이 너무 많은 경우, switch 문 사용 권장

### 예제 2-11 
- 나이를 입력 받아 20 대 인지 판별하는 
```java
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하시오: ");
        int age = scanner.nextInt();

        if((age>= 20) && (age < 30)) {
            System.out.println("20대 입니다."); 
            System.out.println("20대 라서 행복합니다.."); 
        } else {
            System.out.println("20대가 아닙니다.");
        }
        scanner.close();
    }
}

```

### 조건문 단순 if 문 if else 문
- 단순 if 문 
- if 의 괄호 안에 조건식 
- 실행문장이 단일 문장인 경우 둘러싸는 , 생략가능

- if else 문 
- 조건식이 ture 이면 실행 문장 1 . false 이면 실행문장 2 실행

### 비트 연산
- 비트 개념
```java
byte x = 10;
```

- 비트 논리 연산 : 비트끼리 AND,OR,NOT 연산
- 비트 시프트 연산 : 비트를 오른쪽이나 왼쪽으로 이동


```java
public class Ex09 {
    public static void main(String[] args) {
        int a= 3,b=5;

        System.out.println("두 수의 차는 " + ((a>b) ? (a-b) : (b-a)));
    }
}
```

### 조건 연산 
- 3개의 피연자로 구성된 삼항 연산자
- opr1 ? opr2 : opr3 -> opr1 이 결과가 true 면 opr2 , false 면 opr3
- if else 를 조건 연산자로 간결하게 표현 가능

### 비교 연산과 논리 연산

- 비교 연산자 : 두 개의 값을 비교하여 true , false 결과
- 논리 연산자 : 두 개의 논리 값에 논리 연산, 논리 결과

## 3/25

### 산술 연산자
- 산술 연산자 : 더하기 , 뺴기. 곱하기. 나누기 , 나머지

### 연산자 
- 연산 : 식을 계산하여 결과를 얻어내는 과정

### scanner 예제
```java
import java.util.Scanner;

public class Boo {
    public static void main(String[] args) {
        System.out.println("이름 , 도시 ,나이, 체중 ,독신 여부를 빈칸으로 분리해서 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("당신의 이름은 : " + name + " 입니다,"); 
        String city = scanner.next();
        System.out.println("당신이 사는 도시는 " + city + "입니다.");
        int age = scanner.nextInt();
        System.out.println("당신의 나이는 " + age + "입니다.");
        double weight = scanner.nextDouble();
        System.out.println("당신의 체중은 " + weight + "입니다.");
        boolean single = scanner.nextBoolean();
        System.out.println("당신의 독신 여부는 " + single + "입니다.");
        scanner.close();
    }
}

```

### 자바의 키 입력 : Scannre
- Scanner 클래스
- 읽은 바이트를 문자 정수 실수 불린 문자열 등 다양한 타입으로 변환하여 리턴
- 객체를 생성하서 사용
- 키보드에 연결된 System.in에게 키를 읽게 하고, 원하는 타입으로 변환하여 리턴.
- 입력되는 키 값을 공백으로 구분되는 토큰 단위로 읽음

### 타입 변환 예제
```java
public class TypeConversion24 {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;

        System.out.println(b+ i); // b 가 int 타입으로 자동변환
        System.out.println(10/4);
        System.out.println(10.0/4); // 4 가 4.4으로 자동 변환
        System.out.println((char)0x12345678);
        System.out.println((byte) (b+i));
        System.out.println((int) 2.9 + 1.8);
        System.out.println((int)(2.9+1.8));
        System.out.println((int)2.9 + (int) 1.3);
    }
}
```

### 타입 변환
- 자동 타입 변환 : 컴파일러에 의해 원래의 타입보다 큰타입으로 자동변환
- 강제 타입 변환 : 개발자의 의도적 타입 변환

### 예제
```java
public class Bar {
    public static void main(String[] args) {
        final double PI = 3.14; // 원주율을 상수로 하면
        double radius = 10.2; // 원의 반지름
        double circleArea = radius * radius * PI; // 원의 면적 계산

        // 원의 면적을 화면에 출력한다.
        System.out.println("반지름 " + radius   + " , ");
        System.out.println("원의 면적");
        System.out.println("원의 면적 = " +  circleArea);
    }   
}
```

### var 키워드
- var 키워드는 타입을 생략하고 변수 선언을 할 수 있습니다.
- 컴파일러가 추론하여 변수 타입을 결정한다.
- 변수 선언하 떄 초기값이 주지 않으면 컴파일 오류가 발생합니다.
- var 는 지역변수 선언에만 사용가능
    - 지역변수 : 메서드 내부에 선언되는 변수.
    - 클래스 필드 : 클래스 내부에 선언되는 변수. 객체가 생성될때 함꼐 만들어지는 변수.
- 다음과 같이 사용하면 좋다
- 기본적 명시적 자료형 사용하자 
- 가독성 유지될 수 있는 경우에 만 var 쓰자
- 상수를 적극적으로 활용하자

### 상수 선언
- final 키워드 사용합니다.
- 선언 할 때 초기화 지정합니다.
- 실행 중 값의 변경은 불가능합니다.

### 변수의 선언
- 변수 : 프로그램 실행 중에 값을 임시로 저장하기 위한 메모리의 공간으로 프로그램 수행 중 변경될 수 있음.
- 변수 선언 : 데이터 타입에서 정한 크기의 메모리를 할당

### 메모리 구조
- 힙 영역은 프로그래머가 직접 공간을할당 , 해제하는 메모리 공간입니다. JAVA 의 경우 JVM 이 담당합니다.
- 스택 영역은 프로그램이 자동으로 사용하는 임시 메모리 영역입니다.
- 힙이 스택을 침범하는 경우를 힙 오버 플로우 라고 하고 , 스택이 힙을 침범하는 경우를 스택 오버 플로우 라고 합니다.


### 참조 자료형 
- 포인터는 임의의 메모리 주소를 저장 하는 반면 , 참조 자료형은 주소를 저장할 수 없습니다.
- 직접 주소를 갖고 있지는 않지만, JVM이 해당 주소로 안내해 주게 됩니다.
- 객체를 참조하는 변수 유형으로 , 힙 영역에 저장된  객체의 메모리주소를 가리키게 됩니다.
- NEW 키워드로 객체를 생성하는 것이 바로 참조 자료형을 선언하는 것입니다.
- 이렇게 선언된 참조 자료형은 JVM 이 대신 객체의 주소를 저장합니다.
- 배열, 인터페이스, 열거형도 객체이기 떄문에 참조 자료형 입니다.
- 객체를 참조하지 않을 때 null 값을 가질 수 있습니다.
- 같은 객체를 여러 변수가 참조할 수 있고, == 연산자로 객체의 주소도 비교할수 있습니다.

### java 의 데이터 타입
- 기본 자료형 8개
- 기본 타입의 크기는 CPU 나 운영체제에 따라 변하지 않음
- 레퍼런스형 1개이며 용도는 다음 3가지 : 포인터와 유사한 개념이지만 메모리 주소는 아님

- 문자열은 기본 타입이 아님. String 클래스로 문자열 표현
- 문자열 리터럴 : "jdk" , "한글", "계속하세요"
- 문자열 이나 문자열과 다른 자료형의 리터럴 + 연산을 할 경우 결과는 문자열로 반환합니다.


### 두 정수를 더하는 함수

``` java
/*
 두 정수를 더하는 sum() 함수를 정의하고.
 main() 함수에서 이 함수를 호출하여 결과를 출력하는 에제
*/
public class Foo {
    // main() 메서드에서 실행이 시작.
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(1,10);
        a = '?';

        System.out.println(a); // 문자 ? 출력
        System.out.println("Hello"); // 문자열 Hello 출력
        System.out.println(s); // 정수 s 출력
    }

    // 두 정수를 더하는 메소드 출력
    public static int sum(int n,int m) {
        return n + m;
    }
}
```

## 3/18

함수 지향 언어

- 함수형 언어는 함수를 일급 객체로 취급하고 , 상태 변경을 피하고 불변성을 지향하는 프로그래밍 패러다임이다.
- 함수형 언어에서는 함수의 조합으로 복잡한 작업을 수행하며, 상태 변경 대신에 데이터를 변환하는 방식으로 프로그램을 작성합니다.
- 재귀, 고차함수, 순수함수 등의 개념을 중요시 하며, 병렬 처리와 높은 수준의 추상화를 지원합니다.
- Python,Kotlin,Haskell, Lisp, Scala
