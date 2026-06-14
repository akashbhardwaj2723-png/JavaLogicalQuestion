public class PrintSumNnaturalNum{
   public static void PrintSum(int n,int sum){
     if(n==0){
      System.out.println(+sum);
      return;
     }
     sum=sum+n;
     PrintSum(n-1, sum);
   }
 
  public static void main(String[] args) {
      int n=5;
      int sum=0;
      PrintSum(n,sum);
  }
}