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
