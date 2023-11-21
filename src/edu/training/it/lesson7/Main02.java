package edu.training.it.lesson7;

import java.util.Random;

public class Main02 {
	public static void main(String[] args) {

		Random rand = new Random();
		double c[] = new double[5];
		double b[] = new double[5];

		for (int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt(100);
			System.out.print("[" + b[i] + "]");
		}

		System.out.println();
		System.out.println();
		
		for (int i = 0; i < c.length; i++) {
			c[i] = rand.nextInt(100);
			System.out.print("{" + c[i] + "}");
		}
		System.out.println();
		System.out.println();
		
		calc(b, c);
	}

	public static void calc(double[] b, double[] c) {

		double temp = 0;
		double r = 0;
		for (int i = 0; i < c.length; i++) {
			temp += Math.pow(c[i] - b[i], 2);
			r = Math.sqrt(temp);
		}
		System.out.println("R = " + r);
	} 

}
