public class NumberToWords {
    public static void numberToWords (int number){
        if (number < 0){
            System.out.println("Invalid Value");
        } else {
            int reverseNumber = reverse(number);
            int digitDifference = getDigitCount(number) - getDigitCount(reverseNumber);
            do {
                int digit = reverseNumber % 10;
                switch (digit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverseNumber /= 10;
            } while (reverseNumber > 0);
            for (int i=0; i < digitDifference; i++){
                System.out.println("Zero");
            }
        }


    }

    public static int reverse (int number){
        int reverse = 0;
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }
        while (number > 0){
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        if (isNegative){
            return reverse * -1;
        } else {
            return reverse;
        }

    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number > 0);
        return count;
    }
}
