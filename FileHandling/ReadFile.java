
import java.io.File;
import java.util.Scanner;


public class ReadFile{
  public static void main(String[]args){
  File MyObj= new  File("Ak.text");

   try (Scanner FileRead=new Scanner(MyObj)) {
       while(FileRead.hasNextLine()){
        String s1= FileRead.nextLine();
        System.out.println(s1);
       }
   } catch (Exception e) {
    System.out.println("File not read Error occer");
     e.printStackTrace();//error dettail print;
     
   }

  }
}