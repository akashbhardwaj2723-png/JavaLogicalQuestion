
import java.io.FileInputStream;
import java.io.IOException;
public  class InputFileStream{
  public static void main(String[]args){
    try(FileInputStream f1=new  FileInputStream("Ak.text") ){
     int i;
     while((i=f1.read())!=-1){  
      System.out.print((char)i);
            
     }
    }catch (IOException e){
    System.out.println("ERROR FILE execution time");
    }
  }
}
