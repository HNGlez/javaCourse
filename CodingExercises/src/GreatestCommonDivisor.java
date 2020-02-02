public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        int lowestNumber = Math.min(first, second);
        int divisor = 0;
        for (int i = lowestNumber; i > 0; i--){
            if (first % i == 0 && second % i == 0){
                return i;
            }
        }
        return 1;
    }
}
