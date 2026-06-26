class Parent{
 String s1="Motercycle";
 int amount=72364723;
 void  display1(){
  System.out.println("Parent motercycle:"+s1);
   System.out.println("Parent Bank Balance:"+amount);
 }
}
class Child1 extends Parent{
  int amount1=734674237;
  String s2="Thor";
  void display2(){
    System.out.println("Child1  Bought a new thor:"+s2);
     System.out.println("Child1 bank balance inherite parent amount:"+amount1);
  }
}
class Child2 extends Parent{
  int amount3=787589475;
  String s3="Lamburgani";
  void display3(){
    System.out.println("Child2 buy a new car:"+s3);
     System.out.println("Child2 Second amount Inherite parent amount:"+amount3);
  }
}


class HInheritance{
  public static void main(String[]args){
    Child1 a1=new Child1();
    a1.display1();
    a1.display2();
    Child2 b1=new Child2();
    b1.display1();
    b1.display3();

  }
}