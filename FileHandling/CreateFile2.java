import java.io.File;



import java.io.IOException;

public class CreateFile2{
  public static void main(String[] args) {
    try{
    File myObj=new File("Ak.text"); 
    if(myObj.createNewFile()){
      System.out.println("This File Created:"+myObj.getName());
      } else{
      System.out.println("File all ready exist");
    }
  }catch(IOException e){
    System.out.println("This file was not Created error occer");
     e.printStackTrace();
  }
  }
}