public class WordCount{
  public static void main(String[] args) {
      String str="Hai I am Web Developer";
      // String word=" ";
      int count=1;
      for (int i = 0; i <=str.length()-1; i++) {
          int ch=str.charAt(i);
          if(ch==' '){
          count++;
          }

          }
          System.out.println("Word Count:"+count);
      }
  }
