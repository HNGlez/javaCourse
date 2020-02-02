public class SharedDigit {
    public static boolean hasSharedDigit (int first, int second){
        if (first < 10 || first > 99 || second < 10 || second > 99){
            return false;
        }
        while (first > 0){
            int digit = first % 10;
            int auxSecond = second;
            while (auxSecond > 0){
                int secondDigit = auxSecond % 10;
                if (digit == secondDigit){
                    return true;
                }
                auxSecond /= 10;
            }
            first /= 10;
        }
        return false;
    }
}
