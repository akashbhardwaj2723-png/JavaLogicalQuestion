public class CharSubSequence{
  public static void SubSequenceOfchar(String str,int idx,String newStr){

// char CurrentChar=str.charAt(idx);
if(idx==str.length()){
  System.out.println(newStr);
  return;
}
char CurrentChar=str.charAt(idx);
// come character 
SubSequenceOfchar(str, idx+1, newStr+CurrentChar);
//not come Character
SubSequenceOfchar(str, idx+1, newStr);
  }
  
  
  public static void main(String[] args) {
      String str="abc";
      SubSequenceOfchar(str, 0, " ");
  }
}