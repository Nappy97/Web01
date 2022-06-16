package Lec07_Switch.com.lec.java.switch02;

public class Switch02Main {

    public static void main(String[] args) {
        System.out.println("switch 연습");

        // 도전
        // switch ~ case 조건문을 사용해서
        // 짝수 이면 --> "짝수입니다"  출력
        // 홀수 이면 --> "홀수입니다"  출력

        int num = 99;
        int rNum = num % 2;

        switch (rNum) {
            case 0:
                System.out.println("짝수 입니다.");
                break;

            case 1:
                System.out.println("홀수 입니다.");
                break;

            default:
                System.out.println("Mol?Lu");
                break;
        }


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class









