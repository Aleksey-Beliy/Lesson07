package edu.training.it.lesson7;

import java.util.Random;

public class Main06 {

	public static void main(String[] args) {

		int n = 10;
		int x[] = new int[n];
		int y[] = new int[n];

		initWithRandom(x);
		initWithRandom(y);
		
		account(x, y);
		
		summa(x, y);
	}

	public static void initWithRandom(int[] a) {

		Random rand = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
	}
	
	public static void account(int [] x, int[] y) {
		
		int count = 0;
		
		for (int i = 0; i < y.length; i++) {
			if(x[i] > y[i] && x[i] > 0) {
				count++;
			}
		}
		System.out.println("Число элементов = " + count);
	}
	
	public static void summa(int[] x, int[] y) {
		
		int summa = 0;
		for (int i = 0; i < y.length; i++) {
			if(x[i] > y[i] && x[i] > 0) {
				summa += x[i];
			}
		}
		System.out.println("Сумма = " + summa);
	}
	public static void printArray(int a, int b) {
		System.out.println("Число элементов = " + a);
		System.out.println("Сумма = " + b);
	}
}
