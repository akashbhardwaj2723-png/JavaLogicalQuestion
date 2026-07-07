class  AllPerMutationCombination{
  
  public static void PerComAll(String str ,String Permutaion)
{
   if(str.length()==0){
    System.out.println(Permutaion);
    return;
   }


  for (int i = 0; i <str.length(); i++) {
      char CurrentChar=str.charAt(i);

      String newStr=str.substring(0,i)+str.substring(i+1);
      PerComAll(newStr, Permutaion+CurrentChar);
  }
}  
  
 public static void main(String[] args) {
      
String str="abc";
PerComAll(str, "");

  }
}