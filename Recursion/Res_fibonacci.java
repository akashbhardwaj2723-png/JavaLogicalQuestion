public class Res_fibonacci{
  public static void FebonacciSeries(int a , int b, int n){
    if(n==0){
      return;
    }
    System.out.println(a);
    FebonacciSeries(b, a+b, n-1);
  }
  
  
  
  public static void main(String[] args) {
      FebonacciSeries(0, 1, 5);
  }
}