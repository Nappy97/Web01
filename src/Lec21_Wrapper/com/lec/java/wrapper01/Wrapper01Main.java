package Lec21_Wrapper.com.lec.java.wrapper01;

/* Wrapper 클래스: 기본 자료형(primitive type)의 데이터를 감싸는 클래스
 * 기본 자료형: boolean, char, byte, short, int, long, float, double
 * Wrapper: Boolean, Character, Byte, Short, Integer, Long, Float, Double
 *
 * Wrapper 클래스는 String 과 마찬가지로 immutable(불변) 이다.
 */

public class Wrapper01Main {

    public static void main(String[] args) {
        System.out.println("Wrapper 클래스");
        System.out.println("wrapper 클래스에 값을 저장하는 방법");
        System.out.println();

        Integer i1 = 100;
        i1 = i1 + 200;
        System.out.println("i1 = " + i1);

        // 1. 생성자 이용
        Integer num1 = new Integer(123);    // deprecated 됨.


        // 2. wrapper 클래스의 static 메소드인 valueOf() 메소드를 사용
        Integer num2 = Integer.valueOf(123);
        System.out.println("num2 = " + num2);

        System.out.println(num1 == num2);    // Wrapper 간의 == 비교는 주소 비교다
        System.out.println(num1.equals(num2));    // Wrapper 간 값비교


        // 3. new Integer() VS Integer.valueOf()
        Integer num3 = new Integer(123);
        Integer num4 = Integer.valueOf(123);

        System.out.println(num1 == num3);
        System.out.println(num2 == num4);


        // 4. literal 상수로 생성
        Integer num5 = 123;

        System.out.println(num2 == num5);


        // 5. valueOf(문자열) 가능!
        Integer num6 = Integer.valueOf("123");


        // 6. 산술 연산 가능
        num6 *= 2;
        System.out.println(num6);


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class
















