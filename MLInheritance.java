class Animal{
  void display1(){
    System.out.println("All animal eating");
  }
}
class Dog extends Animal{
  int leg=4;
  void display2(){
    System.out.println("Dog has four leg:"+leg);

  }
}
class  Cat extends Dog{
  int eye=2;
  void display3(){
    System.out.println("cat Eyes"+" "+eye);
  }
}
class MLInheritance{
  public static void main(String[] args) {
      Cat a1=new Cat();
      a1.display1();
      a1.display2();
      a1.display3();
  }
}