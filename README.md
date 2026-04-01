# 202530128 정하형 java2 

## 4/1

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
