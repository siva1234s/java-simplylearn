package com.mphasis;

public class TypeCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit Type conversion");
		// implicit conversion
		byte b=65;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		System.out.println("value of " + b );
		System.out.println("value of " + s );
		System.out.println("value of " + i );
		System.out.println("value of " + l);
		System.out.println("value of " + f );
		System.out.println("value of " + d );
		
		System.out.println("\n");
		
		System.out.println("Explicit Type conversion");
		//explicit conversion
		double x=45.5;
		int y=(int)x;
		System.out.println("value of "+ x);
		System.out.println("value of "+ y);
		
		

	}

}
