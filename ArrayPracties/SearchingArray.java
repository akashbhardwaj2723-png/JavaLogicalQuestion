
// import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchingArray{
  public static void main(String[] args) {
      int arr[]={20,30,45,60,70,80,90};
     
     int index=Arrays.binarySearch(arr,70);
     System.out.println(index);
  }
}