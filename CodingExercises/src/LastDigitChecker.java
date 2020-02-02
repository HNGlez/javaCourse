public class LastDigitChecker {

    public static boolean hasSameLastDigit (int valueOne, int valueTwo, int valueThree){
        if (isValid(valueOne) && isValid(valueTwo) && isValid(valueThree)) {

            int digitOne = valueOne % 10;
            int digitTwo = valueTwo % 10;
            int digitThree = valueThree % 10;

            if (digitOne == digitTwo || digitOne == digitThree || digitTwo == digitThree) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid (int number){
        if (number < 10 || number > 1000){
            return false;
        } else {
            return true;
        }
    }
}
