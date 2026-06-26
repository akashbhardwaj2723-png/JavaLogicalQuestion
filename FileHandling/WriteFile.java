import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile{
  public static void main(String[] args) {
     
     try{ File MyObj=new File("Ak.text");
     FileWriter wrt=new FileWriter(MyObj);
      wrt.write("This is may First file And Text Create ");
      wrt.close();
      System.out.println("This is a File Write SuccessFul task");
  }catch(IOException e){
    System.out.println("This file not a write error occer");
    e.printStackTrace();
  }
}
}