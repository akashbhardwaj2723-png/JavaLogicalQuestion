public class MergeTwoArray{
  public static void main(String[] args) {
      int arr1[]={10,20,30,40};
      int arr2[]={50,60,70,80};
      int merge[]= new int[arr1.length+arr2.length];
      for (int i = 0; i < arr1.length; i++) {
          merge[i]=arr1[i];
      }
      for (int i = 0; i <arr2.length; i++) {
          merge[arr1.length+i]=arr2[i];
      }
      System.out.println("Merge array:");
      for (int i = 0; i < merge.length; i++) {
          System.out.println(merge[i]);
      }
  }
}