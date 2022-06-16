package Lec08_For.com.lec.java.for02;

public class For02Main {

    public static void main(String[] args) {
        System.out.println("For문 - 구구단 출력");

        System.out.println("구구단 2단");
        for (int i = 1; i <= 9; i++) {
            System.out.println("2 X " + i + " = " + 2 * i);
        }

        System.out.println();

        System.out.println("구구단");
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j  + " = " + i * j);
            }
        }

    } // end main()

} // end class For02Main












