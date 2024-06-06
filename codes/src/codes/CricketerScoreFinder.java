package codes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	public class CricketerScoreFinder {
	    public static List<Integer> cricketer = new ArrayList<>();
	    public static void findCricketerId(int[] array, int size, int score) {
	        if (size < 0) {
	            System.out.println("Invalid array size");
	            return;
	        }
	        if (score < 0) {
	            System.out.println("Invalid score");
	            return;
	        }
	        for (int i = 0; i < size; i++) {
	            if (array[i] < 0) {
	                System.out.println("Invalid input");
	                return;
	            }
	        }
	        for (int i = 0; i < size; i += 2) {
	            int cricketerId = array[i];
	            int cricketerScore = array[i + 1];
	            if (cricketerScore > score) {
	                cricketer.add(cricketerId);
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();
	        if (size < 0 || size % 2 != 0) {
	            System.out.println("Invalid array size");
	            scanner.close();
	            return;
	        }
	        int[] array = new int[size];
	        System.out.println("Enter the array elements (id followed by score): ");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	            if (array[i] < 0) {
	                System.out.println("Invalid input");
	                scanner.close();
	                return;
	            }
	        }
	        System.out.print("Enter the score to compare: ");
	        int score = scanner.nextInt();
	        if (score < 0) {
	            System.out.println("Invalid score");
	            scanner.close();
	            return;
	        }
	        findCricketerId(array, size, score);
	        for (int id : cricketer) {
	            System.out.println(id);
	        }
	        scanner.close();
	    }
	}