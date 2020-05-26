package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
	}

}

//		==의 경우에는 비교하고자 하는 대상의 주소를 비교하는 반면
//		equals의 경우에는 비교하고자 하는 대상 자체를 비교한다.
//		p1과 p2의 경우에는 담긴 값이 같을 뿐 사용하는 주소들은 다르다.
//		따라서 같은 방식으로 p1과 p2, p2와 p3, p3와 p4의 경우에는 모두 false가 출력된다.
//		히지만 p4와 p1의 경우에는 같은 주소를 쓰기 때문에 값과 주소가 모두 같다.
//		따라서 위에서 주어진 코드 중 유일하게 true값이 출력된다. 


