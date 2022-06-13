package Lec03_Variables.com.lec.java.variable;

//자바의 기본 자료형(primitive data type)
//정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
//실수 타입: float(4바이트), double(8바이트)
//문자 타입: char(2바이트)
//논리 타입: boolean(1바이트)
public class Variable03Main {
    public static void main(String[] args) {

        System.out.println("byte: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);

        byte num1 = -128;
        byte num2 = 0;
        byte num3 = 123;
//        byte num4 = 128; // 에러: byte 에 저장할 수 있는 크기를 넘선 값 대입

        System.out.println("short: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);

        short num5 = -12345;
        short num6 = 12345;
        short num7 = 32767;
//        short num8 = 32768;

        System.out.println("int: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);

        int num9 = 987654321;
//        int num10 = 9876543210;

        System.out.println("long: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

//        long num10 = 9875643210;
        long num11 = 9875643210L;

//        리터럴(literal) :코드에 직접 입력하는 값.
//        리터럴도 타입이 있다.
//        정수타입리터럴은 int 타입으로 인식라려한다.
//        실수타입리터럴은 double 타입으로 인식하려한다

        long num12 = 12;    // long(8) <- int(4)
        long num13 = 12L;   // long(8) <- long(8)
        int num14 = 12;     // int(4) <- int(4)
//        int num15 = 12L;  // int(4) <- long(8) (X) 에러!
    }
}
