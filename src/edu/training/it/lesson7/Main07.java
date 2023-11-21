package edu.training.it.lesson7;

import java.util.Random;

public class Main07 {

	public static void main(String[] args) {

		int n = 10;
		int x[] = new int[n];
		int y[] = new int[n];

		initWithRandom(x);
		initWithRandom(y);

		y = copyArray(x);

		System.out.println(x);
	
	}

	public static void initWithRandom(int[] a) {

		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
	}

	public static int[] copyArray(int[] a) {

		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				b[i] = a[i];

			}
		}
		return b;
	}

	public static void sortArray(int[] a) {
		
		
		
	
		
	
				
			
		
	}
}
