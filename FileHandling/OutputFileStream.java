
import java.io.FileOutputStream;
import java.io.IOException;
public  class  OutputFileStream{
  public static void main(String[] args) {
      String text="Hello Akash ji";
      try (FileOutputStream f2= new FileOutputStream("Ak.text")){
          f2.write(text.getBytes());
          System.out.println("Sucessfull");
      }catch  (IOException e) {
        System.out.println("File Exection error");

        e.printStackTrace();
      }
  }
}