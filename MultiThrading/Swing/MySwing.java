
import javax.swing.*;
  class LoginS extends JFrame{

    public  LoginS(String s1) {
      super(s1);
    }
   public  LoginS(){

    }
      
}

public class MySwing{
  public static void main(String[] args) {
   LoginS a1=new LoginS("This is My First Login page");
   a1.setVisible(true);
   a1.setSize(606,600);
   a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
  }
}