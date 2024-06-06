package codes;
import java.util.Scanner;
public class ExamResults {
    public static int passCount(int array[], int size) {
        if (size < 0 || size % 2 != 0) {
            System.out.println("Invalid array size");
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                System.out.println("Invalid input");
                return -1;
            }
        }
        int count = 0;
        for (int i = 1; i < size; i += 2) {
            if (array[i] >= 70) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int size = sc.nextInt();
            if (size < 0 || size % 2 != 0) {
                System.out.println("Invalid array size");
                return;
            }
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            int result = passCount(array, size);
            if (result != -1) {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}
