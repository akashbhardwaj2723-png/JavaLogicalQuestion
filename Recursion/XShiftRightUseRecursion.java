 
 //abxcdxxx="abcdxxxx"
 public class XShiftRightUseRecursion{
  public static void Xshift(String str,int idx,int count,String newString){
     char CurrentChar=str.charAt(idx);
     if(idx==str.length()-1){
      for (int i = 0; i <=count; i++) {
        newString+='x';
          // System.out.println( newString);
      }
      System.out.println(newString);
      return;
     }
    if(CurrentChar=='x'){
       count++;
       Xshift(str, idx+1, count, newString);
    }else{
      newString+=CurrentChar;
      Xshift(str, idx+1, count, newString);
      // System.out.println(newString);

    }
  }
   
  public static void main(String[] args) {
     String str="abxcxdxx";
      Xshift(str, 0, 0, " ");
  }
 }