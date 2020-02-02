import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int count = 0;
        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                count++;
                int number = scanner.nextInt();
                sum += number;
                average += (double) Math.round( (double) (number - average)/count);
            } else {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }

        scanner.close();
    }
}
