package Jungol_기초다지기.입력.형성평가04;

import java.util.Scanner;

//세 개의 정수를 입력받아 합을 출력하는 프로그램을 작성하시오.
//
//
//
//        (자기주도 C언어 10판에 맞게 수정하였습니다.)
//
//출력 예: sum = 170
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.printf("sum = %d\n", num1 + num2 + num3);

        sc.close();
    }
}
