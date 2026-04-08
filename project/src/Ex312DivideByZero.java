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
        try {
            System.out.println(dividend  + " 를 " + divisor + "로 나누면 몫은" 
                + dividend / divisor + "입니다"
            );
        } catch(ArithmeticException e) {
            System.out.println("나눗수를 입력하세요 : ");
            divisor = scanner.nextInt();

             System.out.println(dividend  + " 를 " + divisor + "로 나누면 몫은" 
                + dividend / divisor + "입니다"
            );
        } finally {
            scanner.close();
        }
    }
}
