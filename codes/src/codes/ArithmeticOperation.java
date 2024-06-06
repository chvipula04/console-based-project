package codes;
import java.util.Scanner;
	public class ArithmeticOperation {
	    public static int performArithmeticOperation(int input1, int input2, int operation) {
	    	if (input1 < 0 || input1 > 32767 || input2 < 0 || input2 > 32767) {
	            return -1;
	        }
	        if (operation < 1 || operation > 4) {
	            return -1;
	        }
	        switch (operation) {
	            case 1:
	                return input1 + input2;
	            case 2:
	                return input1 - input2;
	            case 3:
	                return input1 * input2;
	            case 4:
	                if (input2 == 0) {
	                    return -1; 
	                }
	                return input1 / input2;
	            default:
	                return -1;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the first number:");
	        int input1 = sc.nextInt();
	        System.out.println("Enter the second number:");
	        int input2 = sc.nextInt();
	        System.out.println("Enter the operation (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division):");
	        int operation = sc.nextInt();
	        int result = performArithmeticOperation(input1, input2, operation);
	        if (result == -1) {
	            System.out.println("Invalid Input");
	        } else {
	            System.out.println(result);
	        }

	        sc.close();
	    }
	}