public  class Res_Factorial{
  public static void Factorial(int fact,int n){
    if(n==0)
  {
      System.out.println(fact);

    return;
      
  }
  fact=fact*n;
  Factorial(fact, n-1);
  }
  public static void main(String[] args) {
      
      int fact=1;
      int n=5;
      Factorial(fact, n);     
  }
}
