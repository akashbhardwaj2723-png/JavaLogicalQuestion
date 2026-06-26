 class MyException1{
  public static void main(String[]args){
  int a=5;
  int b=0;

  int arr[]={1,2,3,4,5,6,7};
  try {
  System.out.println("Arthmatic Exception"+(a/b)); 
 } catch(ArithmeticException e){
    System.out.println(e.getMessage());
  }  
  try{
     System.out.println("ArrayIndexOutOfBoundException"+arr[8]);
  } 
  catch(ArrayIndexOutOfBoundsException e1){
  System.out.println(e1.getMessage());
  } 
  finally{
    System.out.println("Program exection occer or not : But program any way run");
  }  
}
  }
