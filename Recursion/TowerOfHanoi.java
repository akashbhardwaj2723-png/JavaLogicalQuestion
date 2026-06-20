public class TowerOfHanoi {

    public static void toHanoi(int n, String source, String helper, String dest) {

        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
            return;
        }

        // Step 1
        toHanoi(n - 1, source, dest, helper);

        // Step 2
        System.out.println("Transfer disk " + n + " from " + source + " to " + dest);

        // Step 3
        toHanoi(n - 1, helper, source, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        toHanoi(n, "S", "H", "D");
    }
}