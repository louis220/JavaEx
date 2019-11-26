package com.bit.javaex.api.objectclass.examples2;


public class Circle {
	
	private int x;
	private int y;
	private int radius;
	
	public Circle (int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int getSame() {
		return radius; 
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if (obj instanceof Circle ) {
			
			Circle other = (Circle)obj;
			return getSame() == other.getSame();
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	
}
