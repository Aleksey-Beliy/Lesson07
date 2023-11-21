package edu.training.it.lesson7;

import java.util.Random;

public class Main05 {

	public static void main(String[] args) {

		int n = 10;
		double a[] = new double[n];
		double b[] = new double[n];

		initWithRandom(a);
		initWithRandom(b);

		create(a, b);

	}

	public static void initWithRandom(double[] x) {
		Random rand = new Random();

		for (int i = 0; i < x.length; i++) {
			x[i] = rand.nextDouble(100);

		}
	}

	public static void create(double[] a, double[] b) {
		double[] t = new double[a.length];

		for (int i = 0; i < t.length; i++) {
			t[i] = Math.pow(a[i] / b[i], 1./ i);

			System.out.printf("[%.2f]; ", t[i]);
		}

	}

}
