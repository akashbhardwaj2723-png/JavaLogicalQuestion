class MyClass{
  int rollNUm=889611289;
  String Depratment="BCA";
  void  GetData(){
    System.out.println("My roll number:"+rollNUm);
    System.out.println("My Depratment:"+Depratment);
  }
  void GetData(int p){
     System.out.println("Pass by Referance:"+p);
  }
}

class  Overloding{
  public static void main(String[] args) {
      MyClass a1=new MyClass();
      a1.GetData();
      a1.GetData(5);
  }
}