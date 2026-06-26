class TwoSumProblem{

public  static int MaxProduct(int[]a){
      int max=0;
      int smax=0;
      for (int i = 0; i <a.length; i++) {
            if(a[i]>max){
              smax=max;
              max=a[i];
            }else if(a[i]>smax){
              smax=a[i];
            }
          
      } 
      return (max-1)*(smax-1);
      }
    
public static void main(String[]args){
int a[]={2,3,4,5,6,7,8};
System.out.println(MaxProduct(a));
}
}