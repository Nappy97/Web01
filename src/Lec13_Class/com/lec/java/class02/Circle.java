package Lec13_Class.com.lec.java.class02;

public class Circle {
    // 원의 속성 -> 멤버변수
    double radius;

    // 생성자 (constructor)
    public Circle(){
        System.out.println("Circle() 생성자 호출");
    }

    // 원의 동작 -> 멤버메소드

    //원의 둘레 계산
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    //원의 넓이 계산
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
