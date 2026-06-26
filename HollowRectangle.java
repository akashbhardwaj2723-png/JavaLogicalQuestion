public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                // border condition
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // space inside
                }

            }
            System.out.println();
        }
    }
}

