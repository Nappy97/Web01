package Jungol_기초다지기.입력.자가진단07;

import java.util.Scanner;

//두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
//
//        (먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)
//
//출력 예: 16 * 5 = 80
//        16 / 5 = 3
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);

    }
}
