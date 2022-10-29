package com.generics.java;

public class MaxNumGenerics<T> {
	T num1, num2, num3, num4;
	public MaxNumGenerics(T num1, T num2, T num3, T num4)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	public static <T extends Comparable<T>> T maximumaAmong4(T num1, T num2, T num3, T num4) {

		T max = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			max = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			max = num2;
		else if (num3.compareTo(num4) > 0)
			max = num3;
		else
			max = num4;
		return max;

	}
	public static <E> void printMax(E num1, E num2, E num3, E num4, E max) {
		System.out.println(max);
	}

	public static void main(String[] args) {
		System.out.println("The max Number Among 4 String numbers is:-\n "+maximumaAmong4("Orange", "Dragonfruit", "Banana","mango"));
		System.out.println("The max Number Among 4 Integer numbers is:-\n "+maximumaAmong4(14,22,27,55));
		System.out.println("The max Number Among 4 Float numbers is:-\n "+maximumaAmong4(39.5f,96.98f,98.99f,77.6f));
		
	}

	
}
