public class FindLargerArray{
  public static void main(String[] args) {
      int arr[]={1,23,45,6,78,90,23};
      int larger=arr[0];
      int Secondlarger=arr[0];
      for (int i = 0; i <arr.length; i++) {
          
              if(arr[i]>larger){
                Secondlarger=larger;
                larger=arr[i];
              
          }
         else if(arr[i]>Secondlarger){
            Secondlarger=arr[i];
          }
      }
      System.out.println("largerNum:"+larger);
      System.out.println("Second larger:"+Secondlarger);
  }
}