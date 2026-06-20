public class CopyArray{
  public static void main(String[] args) {
      int arr[]={21,22,20,30,40,50};
  
    int copy[]= new int[arr.length];
     for(int i = 0; i < arr.length; i++) {
         copy[i]=arr[i];
     }  
     System.out.println("Copied Array:");
     for (int i = 0; i < arr.length; i++) {
         System.out.println(copy[i]);
     }
  }
}