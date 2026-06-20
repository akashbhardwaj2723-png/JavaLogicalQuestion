public  class  LeaderNumOfArray{
  public static void main(String[] args) {
      int arr[]={1,2,3,45,6,78,0,98,57};
      for (int i = 0; i <arr.length; i++) {
        boolean istrue=true;
          for (int j =i+1; j <arr.length; j++) {
              if(arr[i]<arr[j]){
                
                istrue=false;
                break;
              }
          }
          if(istrue){
            System.out.println("lader number:"+arr[i]);
          }
        
        
      }
  }
}