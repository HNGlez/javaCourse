public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int big = 5;
        int small = 1;
        int totalFlour = big*bigCount + small*smallCount;
        if (totalFlour < goal){
            return false;
        } else {
            int bigUsed = Math.min(bigCount, goal/big);
            int leftFlour = goal - bigUsed*big;
            if (leftFlour == 0){
                return true;
            } else if (leftFlour <= small*smallCount){
                return true;
            } else {
                return false;
            }
        }
    }
}
