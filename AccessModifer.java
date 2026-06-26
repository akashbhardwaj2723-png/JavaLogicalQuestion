class Akash{
 public  int a=121321312;
 private  String s="Archana&Dhakan";
 protected double b=233.44;
 public void Show(){
  System.out.println("This is a public method"+a);
 }
   void ShowPrivate(){
  System.out.println("This is a public method"+s);
 }
protected  void ShowProtected(){
  System.out.println("This is a public method"+b);
 }
}


public  class  AccessModifer{
  public static void main(String[] args) {
  Akash s1=new Akash();
  s1.Show();
  s1.ShowPrivate();
  s1.ShowProtected();

  
  }
}