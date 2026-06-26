abstract class Animals{
   int leg=4;
   public  String color1="RGBA";
  abstract void Dislay1();
  
}
  class Cat extends Animals{
  int tail=1;
  String color="Black";
  void Display2(){
    System.out.println("Cat is a one tail:"+tail);
    System.out.println("Cat color is:"+color);
  }
  void ShowData(){
    System.out.println("This is a four leg:"+leg);
    System.out.println("Multiple color in the Animals:"+color);
  }
  void Dislay1(){
    System.out.println("this is a abstract Class member");
  }
}
class ThisAbstract{
  public static void main(String[] args) {
      Cat a1=new Cat();
      a1.Display2();
      a1.ShowData();
      a1.Dislay1();
      
  }
}