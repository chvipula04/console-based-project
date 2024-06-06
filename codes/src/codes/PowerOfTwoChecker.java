package codes;
import java.util.Scanner;
	public class PowerOfTwoChecker {

	    public static String powerOfTwo(int n) {
	        if (n < 0) {
	            return "Number too small";
	        } else if (n > 32767) {
	            return "Number too large";
	        } else {
	            return (n > 0 && (n & (n - 1)) == 0) ? "Yes" : "No";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        System.out.println(powerOfTwo(n));

	        scanner.close();
	    }
	}