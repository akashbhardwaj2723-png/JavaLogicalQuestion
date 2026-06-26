public class Exception2{
  public static void main(String[]args){
    int a=10;
    int b=0;
    int c=a/b;
    try {//Throw key Word use to the one Exception throw at a one time;
        throw new ArithmeticException("this is Arthmatic Exception");
        
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      System.out.println("This Math Exception"+c);
    }
  }
}