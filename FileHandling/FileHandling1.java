import java.io.*;
public  class FileHandling1{
  public static void main(String[] args) throws IOException {
      File f1=new File("a.text");
     if(f1.createNewFile()){
      System.out.println("file created");
     }else{
   System.out.println("File allReady Exist");
     }
    
  }
}