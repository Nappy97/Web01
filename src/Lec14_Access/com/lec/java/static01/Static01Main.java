package Lec14_Access.com.lec.java.static01;

import java.util.Scanner;

// 클래스에 선언된 멤버 변수/멤버 메소드는
// static 여부에 따라 아래와 같이 불려진다

// 인스턴스 변수: 
//   static 이 안붙은 변수
//   인스턴스를 생성한 다음에(new 생성자(); 호출된 다음에)
//   사용할 수 있는 변수
// 인스턴스 메소드:
//   static 이 안 붙은 메소드
//   인스턴스를 생성한 다음에(new 생성자(); 호출된 다음에)
//   사용할 수 있는 메소드

// 클래스 변수(static 변수):
//   클래스의 멤버 변수들 중에서,
//   인스턴스를 생성하지 않아도 사용할 수 있는 변수
// 클래스 메소드(static 메소드):
//   인스턴스를 생성하지 않아도 사용할 수 있는 메소드


public class Static01Main {

	int a = 100;
	static int b = 200;
	
	// 클래스 메소드 (static)
	public static void test() {
		System.out.println("Hello Java!");
	}
	
	// 인스턴스 메소드 (non-static)
	public void test2() {
		System.out.println("안녕하세요");
	}
	
	public static void main(String[] args) {
		System.out.println("인스턴스 변수/메소드 vs 클래스 변수/메소드");
		
//		System.out.println(a);
		System.out.println(b);
		
		test();
		
		// ★ static 안에선 static 아닌것을 사용할수 없다!
//		test2();
		
		// 인스턴스 변수/메소드는 '인스턴스'를 만들어 사용해야 한다
		Static01Main tc = new Static01Main();
		tc.test2();
		
	} // end main()

} // end class Static01Main











