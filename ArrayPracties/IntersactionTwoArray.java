public class IntersactionTwoArray{
public static void main(String[] args) {
    int arr1[]={2,3,4,5,6,7};
    int arr2[]={2,3,4,7,8,9};
       System.out.println("Insertation array:");
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j <arr1.length; j++) {

          if(arr1[i]==arr2[j]){
         
         
            System.out.print(arr1[i]+" ");
          }
      }
        
    }
}
}