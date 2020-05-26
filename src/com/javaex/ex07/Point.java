package com.javaex.ex07;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// equals() 메소드를 작성하세요.

	@Override
	public boolean equals(Object obj) {

		Point p2 = (Point) obj;
		Point p3 = (Point) obj;
		Point p4 = (Point) obj;

		if (this.x == p2.x && this.y == p2.y) {
			return true;
		} else if (this == p2) {
			return true;
		} else if (this.x == p3.x && this.y == p3.y) {
			return true;
		} else if (p4.x == this.x && p4.y == this.y) {
			return true;
		} else {
			return false;
		}

	}

}
