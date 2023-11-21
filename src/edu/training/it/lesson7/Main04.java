package edu.training.it.lesson7;

public class Main04 {
	public static void main(String[] args) {

		int m[] = new int[10];

		fibonacciArray(m);
		System.out.print("Ряд Фибоначчи: ");
		printArray(m);
		
	}

    public static int[] fibonacciArray(int[] a) {
    	
        for (int i = 0; i < a.length; i++) {
            if (i < 2) {
            	a[i] = 1;
            } else {
            	a[i] = a[i - 1] + a[i - 2];
            }
        }
        
        return a;
        
		}
    
    public static void printArray(int[] a) {
    	
    	for (int i = 0; i < a.length; i++) {
			System.out.print("[" + a[i] + "] ; ");
		}
    }
	}
