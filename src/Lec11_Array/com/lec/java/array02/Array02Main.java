package Lec11_Array.com.lec.java.array02;

/*  배열의 선언과 초기화
 	
 	배열 선언 따로, 초기화 따로
		타입[] 이름 = new 타입[배열의 길이];
		
	배열을 선언과 동시에 초기화 1
		타입[] 이름 = new 타입[] {a, b, c, ...};
		
	배열을 선언과 동시에 초기화 2
		타입[] 이름 = {a, b, c, ...};
		
	배열의 길이를 자동으로 알 수 있는 방법
		배열이름.length 
 */
public class Array02Main {

    public static void main(String[] args) {
        System.out.println("배열의 선언과 초기화");

        // 1.
        int[] korean = new int[3];

        //2.
        int[] english = new int[]{30, 20, 30};

        for (int n = 0; n < english.length; n++) {
            System.out.println("english[" + n + "] = " + english[n]);
        }

        // 3.
        int[] math = {99, 88, 77, 66};    // new int[]{99, 88, 77, 66}
        for (int n = 0; n < math.length; n++) {
            System.out.println("math[" + n + "] = " + math[n]);
        }

        // 수학점수들의 총점과 평균 계산
        int n = 0;
        int sum = 0;
        while (n < math.length) {
            sum += math[n];
            n++;
        }
        double avg = (double) sum / math.length;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

        // length
        int[] score = {10, 20, 30, 40, 50, 88};
        System.out.println("score.length = " + score.length);

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        System.out.println();

        int [] age = {34,55,67,12,2,91};
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("\n프로그램 종료");
    } // end main()

} // end class Array02Main











