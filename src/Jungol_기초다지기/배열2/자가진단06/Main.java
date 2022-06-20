package Jungol_기초다지기.배열2.자가진단06;

import java.util.Scanner;

/*5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 각 개인별로 평균이 80 이상이면
“pass” 그렇지 않으면 “fail”을 출력하고 합격한 사람의 수를 출력하는 프로그램을 작성하시오.*/
public class Main {

    public static void main(String[] args) {

        int[][] score = new int[5][4];

        Scanner sc = new Scanner(System.in);

        for (int stu = 0; stu < score.length; stu++) {
            for (int subj = 0; subj < score[stu].length; subj++) {
                score[stu][subj] = sc.nextInt();
            }
        }

        sc.close();

        int sum;
        double avg;
        int success = 0;
        for (int stu = 0; stu < score.length; stu++) {
            sum = 0;
            avg = 0.0;

            for (int subj = 0; subj < score[stu].length; subj++) {
                sum += score[stu][subj];
            }
            avg = (double) sum / score[stu].length;
            if (avg>=80){
                System.out.println("pass");
                success ++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println("Successful : " + success);

    }
}
