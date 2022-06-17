package Lec10_Loop.com.lec.java.loop01;

/* break;
 * 순환문(for, while, do~while) 안에서 break를 만나면
 * break를 감싸는 가장 가까운 순환문 종료
 */
public class Loop01Main {

    public static void main(String[] args) {
        System.out.println("Break");

        int num = 1;
        while (num <= 10) {
            System.out.println(num);

            // num 값이 3이 되는 순간 while 순환문 종료
            if (num == 3) {
                break;
            }

            num++;
        }

        System.out.println("while 종료 후 num = " + num);


        System.out.println();
        // 2와 7의 최소공배수를 출력
        // 최소공배수: 공배수 중에서 가장 작은 수

        num = 1;
        while (num <= 100) {
            if (num % 2 == 0 && num % 7 == 0) {
                System.out.println(num);
                break;
            }

            num++;
        }


        System.out.println();
        System.out.println("무한 루프와 break;");

        num = 1;
        while (true) {
            System.out.println(num);
            num++;

            // 어떤 조건을 만족하면 무한르프를 끝내기
            if (num == 5) {
                break;
            }
        }


        System.out.println();
        for (num = 1; ; num++) {    // for 의 조건식을 비워두거나, true 이면 무한르프
            if (num == 5) {
                break;
            }

            System.out.println(num);
        }

        System.out.println();
        // 2단은 x 2 까지 출력
        // 3단은 x 3 까지 출력

        // TODO


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class


















