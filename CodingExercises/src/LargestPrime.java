public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number < 2){
            return -1;
        }
        for (int i=number; i > 1; i--){
            if (number % i == 0){
                boolean isPrime = true;
                for (int j=i/2; j > 1; j--){
                    if (i % j == 0){
                        isPrime = false;
                    }
                }
                if (isPrime){
                    return i;
                }
            }
        }
        return -1;
    }
}
