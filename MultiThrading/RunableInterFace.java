   class MyClass implements Runnable{
    int a=1;
   public  void run(){
      while(a<=10){
        System.out.println("print one to ten number:"+a);
          a++;
      }
    }
   }  class MyClass2  implements Runnable{
      int b=11;
      public  void run(){
        while(b<=20){
          System.out.println("This Numer start Eleven to twenty"+b);
          b++;
        }
      }
   }


class RunableInterFace{
  public static void main(String[] args) {
    MyClass s1=new MyClass();
    MyClass2 s2=new MyClass2();
    Thread s3=new Thread(s1);
    Thread s4=new Thread(s2);
    s3.start();
    s4.start();

  }
}