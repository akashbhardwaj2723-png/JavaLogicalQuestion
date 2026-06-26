
import java.io.File;

public  class  DeliteFile{
  public static void main(String[] args) {
      File a1=new File ("a.text");
      if(a1.delete()){
        System.out.println("This Is A file Dedtect"+a1.getName());
      }else{
      System.out.println("this File All Ready Delete or not a File Search");
      }
  }
}