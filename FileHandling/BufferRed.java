
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferRed{
 public static void main(String[] args) {
     
     try (BufferedReader br=new BufferedReader(new FileReader("Ak.text"))){
      String l1;
      while((l1=br.readLine())!=null){
        System.out.println("This is buffer run:"+l1);
      }
         
     } catch (Exception e) {
      System.out.println("Exection time error occer "+e);
     }
 }
}