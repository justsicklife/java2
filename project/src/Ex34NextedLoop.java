public class Ex34NextedLoop {
    public static void main(String[] args) {

        System.out.println("구구단을 가로로 출력하는 프로그램");

        for(int i = 2 ; i < 10 ; i++) {
            System.out.print("[" + i + "단] \t");
        }

        System.out.println();

        for(int i = 1 ; i < 10 ; i++) {
            for(int j = 2 ; j < 10 ; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.err.println();
        }
    }
}
