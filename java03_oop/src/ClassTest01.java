import java.util.Calendar;
import java.util.Scanner;

public class ClassTest01 {
	// 멤버변수(필드) : 현재 클래스 내에서는 사용 가능한 전역변수
	// 멤버변수는 초기값이 자동으로 설정된다. (main에서 선언한 지역변수는 초기값이 들어가지 않는다.)
	// 멤버변수의 초기값 : 정수(byte,short,int,long)은 0, 실수(float,double)는 0.0, 논리(boolean)은 false, 배열, 클래스형(객체형)은 null.
	// 
	int num; // 초기값 : 0
	int[] arr; // 초기값 : null
	String userId; // 초기값 : null
	Calendar now; // 초기값 : null
	
	int dataNum = 1234;
	String name = "이름";
	String myName = "권정훈";
	Scanner scan = new Scanner(System.in);
	
	// 메소드 : 기능구현, 변수선언, 계산, 기본 명령어(if, switch, for, while, ... 등을 기술할 수 있다)
	// 1. 생성자 메소드 
	//		: 메소드명이 클래스명과 같아야 한다.
	// 		: 반환형이 없다.
	//		: 생성자 메소드는 여러 개 만들 수 있다. 단, 매개변수의 갯수나 데이터형이 달라야 한다.
	//		: 생성자 메소드를 만들지 않을 경우 컴퍼일러가 매개변수 없는 생성자를 자동으로 클래스에 넣어준다.
	// 		: 객체 생성시 한 번 실행됨. new 생성자(). 객체의 초기값을 설정할 때 사용한다.
	
	public ClassTest01() {
		System.out.println("ClassTest01() 생성자 메소드 실행");
	}
	public ClassTest01(int num) {
		int data = 500;
		System.out.println("ClassTest01(int num) 생성자 메소드 실행"+num);
	}
	public ClassTest01(String name) {
		System.out.println("ClassTest01(String name) 생성자 메소드 실행"+name);
	}
	public 	ClassTest01(int num, String name) { // 생성자 메소드의 데이터형은 동일하지만(int, String), 개수가 다르므로 허용된다.
		// 멤버변수에 지역변수 값을 설정하기
		// this 키워드 : 메소드의 지역변수와 멤버변수가 같은 변수명을 가질 때, 멤버변수를 지정하는 키워드(this
		this.num = num;
		System.out.println("ClassTest01(int num, String name) 생성자 메소드 실행"+", "+num+", "+name+", "+this.num+", "+myName);
	}
	
	
	// 2. (일반적인) 메소드 : 기능구현
	// 		: 필요한 만큼 생성 가능
	//  	: 반환형이 존재한다. public 반환형 메소드명(arg1, arg2, ...) { }
	// 		: 반환형은 메소드를 실행한 결과가 메소드 밖으로 나가는 방법
	// 		: 반환형이 void인 경우 반환값이 없다.
	public void method1() {
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println("c="+a+b);
		// void : 빈환값이 없다, 메소드가 실행이 끝난 이후에는 a, b, c는 사라진다. 
	}
}


