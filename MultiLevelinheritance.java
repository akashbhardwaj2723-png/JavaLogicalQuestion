interface MyInterFace1{
  int age_1=22;
  String Name_1="Simran";
  void Dislay1();
} 
interface MyInterFace2{
  int age_2=23;
  String Name_2="Shital";
  void Display2();
} 
 class GfCounter implements MyInterFace1,MyInterFace2{
     int age_3=20;
     String name_3="Palak Ji";
     void Display3(){
      System.out.println("My third gf Name:"+name_3);
      System.out.println("My third gf age:"+age_3);
     } 
    public   void Dislay1(){
              System.out.println("My First gf Name:"+Name_1);
              System.out.println("My First gf age:"+age_1);
     }
     public void Display2(){
      System.out.println("My Second gF Name:"+Name_2);
      System.out.println("My Second gf Age:"+age_2);
     }

 }
 
 
 
 
  class MultiLevelinheritance{
  public static void main(String[] args) {
      GfCounter a1=new GfCounter();
      a1.Dislay1();
      a1.Display2();
      a1.Display3();
  }
}