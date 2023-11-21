package edu.training.it.lesson7;

import java.util.Random;

public class Main01 {

	public static void main(String[] args) {

		Random rand = new Random();

		int size = 5;

		double x[] = new double[size];
		double y[] = new double[size];

		for (int i = 0; i < x.length; i++) {
			x[i] = rand.nextDouble(100);
		}

		printArray(x);

		for (int i = 0; i < y.length; i++) {
			y[i] = addition(x[i], i);
		}

		printArray(y);

	}

	public static double addition(double a, double b) {

		double addition = a / b;
		return addition;
	}

	public static void printArray(double[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%.2f  ", mas[i]);
		}

		System.out.println();
	}
}
