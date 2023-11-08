public class Multiple {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int sum = i * j;
                if (sum > 9) {
                    System.out.print(" " +sum);
                } else{
                    System.out.print("  " + sum);
                }
            }
            System.out.println("");
        }
    }
}