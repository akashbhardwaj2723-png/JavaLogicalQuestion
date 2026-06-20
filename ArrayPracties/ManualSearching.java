public  class ManualSearching{
  public static void main(String[] args) {
      int arr[]={10,21,34,56,67,89,90,100};

      int key=90;
      int low= 0;
      int found=-1;
      int high=arr.length-1;
      
      while(low<=high){
     int mid=(low+high)/2;
     if(arr[mid]==key){
       found=mid;
       break;
     }
     
     else if(arr[mid]<key){
      low=mid+1;
     }
     
     else{
     high= mid-1;
     }
     
      }
      System.out.println("Index:"+found);
  }
}