public class DiagonalStar {
    public static void printSquareStar (int number){
        if (number < 5){
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                String row = "";
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || j == 1 || j == number) {
                        row += "*";
                    } else if (i == j) {
                        row += "*";
                    } else if (j == number - i + 1) {
                        row += "*";
                    } else {
                        row += " ";
                    }
                }
                System.out.println(row);
            }
        }
    }
}
