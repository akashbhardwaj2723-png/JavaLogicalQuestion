 class MyThrade extends Thread{
  int age=22;
  String s1="Akash Bhardwaj";
   public  void run(){
    System.out.println("Mera thoda bda wala age:"+age);
    System.out.println(" This is a my name:"+s1);
   }
 }class MyThrade2 extends Thread{
    int age=23;
    String s2="ak";
    public void run(){
        System.out.println("This is a may name:"+age);
        System.out.println("This is a may name:"+s2);
}
 }
 
 
 class ThradeClass{
  public static void main(String[] args) {
      MyThrade2 a1=new MyThrade2();
      MyThrade a2=new MyThrade();
      //  a1.run();
      // do no  method ko ek hi object se call karne se function override ho ja ta hai
      // a2.run();
      // main defferent of the thrade Start Function ka use karte hai
      a1.start();
      a2.start();
      // this function is use to the define one line execution one Function  second Function exection Than Run only One Line fUNCTION   
  }
 }