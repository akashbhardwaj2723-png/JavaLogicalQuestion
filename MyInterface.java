interface MyGf{
     String name="Shital";//by default interface Variable Public static final hota hai
   int Age=21;
  // Interface ka Jo function ho tha hai  o public Absract ho ta hai;
      void Display1();
     //{
  //     System.out.println("My gf name:"+name);
  //     System.out.println("My gf age:"+Age);
  // }
}
  class SecondGf  implements MyGf{
    String s1="Archana";
    int Age=20;
    public   void Display1()
     {
      System.out.println("My gf name:"+name);
     System.out.println("My gf age:"+Age);
   }
      void  Display2(){
        System.out.println("My 2nd Gf Name:"+s1);
        System.out.println("My @nd Gf name:"+Age);
      }
    
    
  }

 class  MyInterface{
   void main(){
    SecondGf a1=new  SecondGf();
    a1.Display1();
    a1.Display2();

  }
 }