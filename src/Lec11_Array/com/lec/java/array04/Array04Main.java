package Lec11_Array.com.lec.java.array04;

import java.util.Arrays;
import java.util.Scanner;

/* 연습
 * 길이 5개 int 형 배열을 선언하고
 * 사용자로부터 5개 정수를 입력받아 초기화 한뒤
 *
 * 총점, 평균, 최대값, 최소값  출력해보기
 */
public class Array04Main {

    public static void main(String[] args) {
        System.out.println("배열 연습");

        int[] score = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.print("점수 입력: ");
            score[i] = sc.nextInt();
        }
        sc.close();

        System.out.println();
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        double avg = (double) total / score.length;
        System.out.println("total = " + total);
        System.out.println("avg = " + avg);

        System.out.println("for문을 이용한 방법");
        int max = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {   // i 번째 점수와 max 값을 비교해서 더 큰 값을 다시  max 에 덮어쓰기
                max = score[i];
            }
        }
        System.out.println("최대값 = " + max);

        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i]< min){
                min = score[i];
            }
        }
        System.out.println("최소값 = " + min);


        System.out.println("Arrays.sort를 이용한 방법");
        Arrays.sort(score);
        System.out.println("최대값 : " + score[score.length - 1]);
        System.out.println("최소값 : " + score[0]);

        // Stream 을 이용한 방법
        System.out.println("Stream을 이용한 방법");
        System.out.println("최대값 : " + Arrays.stream(score).max().getAsInt());
        System.out.println("최소값 : " + Arrays.stream(score).min().getAsInt());
        System.out.println("\n프로그램 종료");
    } // end main()

} // end class Array04Main








