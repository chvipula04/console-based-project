package codes;
	import java.util.ArrayList;
	import java.util.Scanner;
	public class SearchKeys {
	    static ArrayList<Integer> found = new ArrayList<>();
	    public static void searchKeys(int array[], int size, int value) {
	        if (size < 0) {
	            System.out.println("Invalid array size");
	            return;
	        }
	        for (int i = 0; i < size; i++) {
	            if (array[i] < 0) {
	                System.out.println("Invalid input");
	                return;
	            }
	        }
	        for (int i = 0; i < size; i += 2) {
	            if (array[i + 1] == value) {
	                found.add(array[i]);
	            }
	        }
	        if (found.isEmpty()) {
	            System.out.println("Key not found");
	        } else {
	            for (int key : found) {
	                System.out.println(key);
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        if (size < 0) {
	            System.out.println("Invalid array size");
	            return;
	        }
	        int[] array = new int[size];
	        for (int i = 0; i < size; i++) {
	            array[i] = sc.nextInt();
	        }
	        int value = sc.nextInt();
	        searchKeys(array, size, value);
	        sc.close();
	    }
	}