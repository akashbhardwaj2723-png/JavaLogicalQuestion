
import java.io.BufferedWriter;
import java.io.FileWriter;

public  class BufferWrt{
  public static void main(String[] args) {
      try (BufferedWriter br=new BufferedWriter(new FileWriter("a.text"))){
        br.write("Hai  ajj ka din mere liye khash hai ");
        br.newLine();
        br.write("Ajj hi din mere break up huaa hai");
        System.out.println("File write Successfully");
          
      } catch (Exception e) {
        System.out.println("Exection time error occer"+e);
      }
  }
}
