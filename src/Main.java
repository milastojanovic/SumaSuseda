import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if (inputString.length() == 0) {
            throw new IllegalArgumentException("Illegal input: no input");
        }
        String[] stringArray = inputString.split(",");
        Integer[] numbers = new Integer[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            numbers[i] = Integer.valueOf(stringArray[i]);
        }

        if (numbers.length >= 10000) {
            throw new IllegalArgumentException("Illegal input: too many numbers");
        }

        int count = 0; // count of the neighbouring elements' sum == 10

        // calculate the sum of neighbours
        for (int i = 0; i < numbers.length - 1; i++) {
            Integer sum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                sum += numbers[j];
                if (sum == 10) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
