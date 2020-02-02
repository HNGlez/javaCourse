package com.hugonistal;

public class Main {

    public static void main(String[] args) {
	    int count = 6;
	    while (count != 6){
            System.out.println("Count value is " + count);
            count++;
        }
        for (int i=6; i!= 6; i++){
            System.out.println("Count value is " + count);
        }

        count = 1; // Do While is guaranteed to always run at least one loop
        do {
            System.out.println("Count valule was " + count);
            count++;
        } while (count != 6);

	    count = 0;
	    while (true){
	        if (count == 5){
	            break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

//        int number = 4;
//	    int finishNumber = 20;
//	    while(number <= finishNumber){
//	        number++;
//	        if (!isEvenNumber(number)){
//	            continue;
//            }
//            System.out.println("Even Number " + number);
//        }
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            evenNumbersFound++;
            System.out.println("Even Number " + number);
            if (evenNumbersFound >= 5){
                break;
            }

        }
        System.out.println("Total even numbers found = " + evenNumbersFound);


        System.out.println("Sum of Digits in number 125 is " + sumDigits(125));
    }

    public static boolean isEvenNumber (int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    private static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        // 125 -> 125/10 = 12 -> 12*10 = 120 -> 125 - 120 = 5
        while (number > 0){
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10;
        }
        return sum;
    }

}
