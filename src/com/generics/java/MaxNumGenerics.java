package com.generics.java;

public class MaxNumGenerics{
	
	public static Integer maximumInteger(Integer num1, Integer num2, Integer num3) {

		Integer max = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			max = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			max = num2;
		else
			max = num3;
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Maximum Number Among 3 will be :- " + maximumInteger(70, 40, 50));
	}


	
}
