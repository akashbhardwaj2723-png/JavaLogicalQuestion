class Exception3 {

    static void checkResult(int roll) throws Exception {

        if (roll <= 0) {
            throw new Exception("Invalid Roll Number");
        }

        System.out.println("Result Found Successfully");
    }

    public static void main(String[] args) {

        try {
            checkResult(-5);   // change value here
        }
        catch (ArithmeticException e) {
            System.out.println("Please Enter Valid Roll Number");
        }

        System.out.println("Program End");
    }
}