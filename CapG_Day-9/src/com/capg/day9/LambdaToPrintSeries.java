package com.capg.day9;

interface PrintSeries {
	public void print();
}

public class LambdaToPrintSeries {
	public static void main(String[] args) {
		PrintSeries ps = () -> {
			long a = 0, b = 1, c;
			for (int i = 0; i < 10; i++) {
				c = a + b;
				System.out.println(a);
				a = b;
				b = c;
			}
		};
		System.out.println("Fibonacci series: ");
		ps.print();
	}
}
