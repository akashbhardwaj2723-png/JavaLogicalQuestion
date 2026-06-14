public  class PrintNtofive{
  public static void printsum(int n){
    if(n==6){
      return;
    }
    System.out.println(n);
    
    printsum(n+1);
   /// print  to 5 number;
  }
  public static void main(String[] args) {
      int n=1;
     printsum(n);
  }
}