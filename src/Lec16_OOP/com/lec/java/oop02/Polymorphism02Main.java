package Lec16_OOP.com.lec.java.oop02;

/* 다형성의 유용성
	다형성에 의해서, 자식타입 객체가 부모타입으로 자동 형변환 가능!
	부모(조상)타입 만으로도 상속된 모~든 자손 타입들을 담을수 있다.
*/

public class Polymorphism02Main {

    public static void main(String[] args) {
        System.out.println("다형성의 사용 (유용성)");

        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Car();
        Vehicle car3 = new HybridCar();

        Vehicle[] car = new Vehicle[3];
        car[0] = new Vehicle();
        car[1] = new Car();
        car[3] = new HybridCar();

        for (int i = 0; i < car.length; i++) {
            car[i].displayInfo();
        }

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        driveCar(new Vehicle());
        driveCar(new Car());
        driveCar(new HybridCar());

        // instanceof 연산자
        // 용법: 변수/값 instanceof 클래스
        // 결과: true / false

        System.out.println();
        System.out.println(car1 instanceof Vehicle);
        System.out.println(car2 instanceof Vehicle);
        System.out.println(car1 instanceof Car);

        System.out.println("\n 프로그램 종료");
    } // end main()

    public static void driveCar(Vehicle v){
        v.setSpeed(100);
        v.displayInfo();
    }

} // end class












































