public class RemoveDuplicateChar{
  public static void main(String[] args) {
      String str="AkashBhardwaj";
    
      int count=0;
      for (int i = 0; i <str.length(); i++) {
          char  ch=str.charAt(i);
          count++;
         if(str.indexOf(ch)==i){
          System.out.println("Remove duplicate:"+ch);
         }
      
      }
      }

  }
