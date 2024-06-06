package codes;
	import java.util.Scanner;
	public class PlotNumberCalculator {
	    public static float avgOddEvenSum(int[] arr, int size) {
	        if (size < 0 || arr == null) {
	            System.out.println("Invalid Input");
	            return -1;
	        }        
	        for (int num : arr) {
	            if (num < 0) {
	                System.out.println("Invalid Input");
	                return -1;
	            }
	        }
	        int evenSum = 0;
	        int oddSum = 0;
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenSum += num;
	            } else {
	                oddSum += num;
	            }
	        }
	        float average = (evenSum + oddSum) / 2.0f;
	        return average;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            int size = sc.nextInt();   
	            if (size > 20 || size < 0) {
	                System.out.println("Invalid Input");
	                return;
	            }
	            int[] array = new int[size];
	            for (int i = 0; i < size; i++) {
	                array[i] = sc.nextInt();
	            }
	            float result = avgOddEvenSum(array, size);
	            if (result != -1) {
	                System.out.printf("%.2f%n", result);
	            }
	        } catch (Exception e) {
	            System.out.println("Invalid Input");
	        } finally {
	            sc.close();
	        }
	    }
	}