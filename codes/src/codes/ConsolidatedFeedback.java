package codes;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsolidatedFeedback {

    public static Map<Integer, Integer> feedback = new HashMap<>();

    public static void highestFeedBack(int[] metlife, int[] hardfort, int size) {
        if (size < 0) {
            System.out.println("Invalid array size");
            return;
        }

        for (int i = 0; i < size; i++) {
            if (metlife[i] < 0 || hardfort[i] < 0) {
                System.out.println("Invalid input");
                return;
            }
        }

        for (int i = 0; i < size; i += 2) {
            int empId = metlife[i];
            int metlifeScore = metlife[i + 1];
            int hardfortScore = hardfort[i + 1];

            int maxScore = Math.max(metlifeScore, hardfortScore);

            if (feedback.containsKey(empId)) {
                feedback.put(empId, Math.max(feedback.get(empId), maxScore));
            } else {
                feedback.put(empId, maxScore);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Invalid array size");
            scanner.close();
            return;
        }

        int[] metlife = new int[size];
        int[] hardfort = new int[size];

        for (int i = 0; i < size; i++) {
            metlife[i] = scanner.nextInt();
            if (metlife[i] < 0) {
                System.out.println("Invalid input");
                scanner.close();
                return;
            }
        }

        for (int i = 0; i < size; i++) {
            hardfort[i] = scanner.nextInt();
            if (hardfort[i] < 0) {
                System.out.println("Invalid input");
                scanner.close();
                return;
            }
        }

        highestFeedBack(metlife, hardfort, size);

        for (Map.Entry<Integer, Integer> entry : feedback.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        scanner.close();
    }
}
