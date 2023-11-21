package edu.training.it.lesson7;

import java.util.Random;

public class Main03 {

	public static void main(String[] args) {

		int n = 10;

		double[] x = new double[n];
		double[] z = new double[n];
		double[] y = new double[n];

		initArrayWithRandom(z);
		initArrayWithRandom(x);

		masY(x, z, y);
	}

	public static void initArrayWithRandom(double[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}

	}

	public static void masY(double[] x, double z[], double[] y) {

		double a = 5;
		double b = 7;
		double c = 9;
		double d = 10;

		for (int i = 0; i < y.length; i++) {

			y[i] = (a * x[i] + b) / (c * z[i] + d);

			System.out.printf("{%.2f} ", y[i]);

		}
	}

}
