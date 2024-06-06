package codes;
import java.util.Scanner;
	public class DivisibleBy3Counter {
	    public static int divisibleBy3(int[] arr, int size) {
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
	        int count = 0;
	        for (int num : arr) {
	            if (num % 3 == 0) {
	                count++;
	            }
	        }
	        return count;
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
	            int result = divisibleBy3(array, size);
	            if (result != -1) {
	                System.out.println(result);
	            }
	        } catch (Exception e) {
	            System.out.println("Invalid Input");
	        } finally {
	            sc.close();
	        }
	    }
	}