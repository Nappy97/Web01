package Jungol_기초다지기.선택제어문.자가진단03;

import java.util.Scanner;

/*나이를 입력받아 20살 이상이면 "adult"라고 출력하고 그렇지 않으면 몇 년후에 성인이 되는지를
"○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.
출력 예: 2 years later*/
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        int adult = 20;

        age = sc.nextInt();

        if (age >= 20) {
            System.out.println("adult");
        } else if (age == 19) {
            System.out.println(adult - age + " year later");
        } else if (age < 0) {
            System.out.println("음수는 입력할 수 없습니다.");
        } else {
            System.out.println(adult - age + " years later");
        }

        sc.close();
    }
}
