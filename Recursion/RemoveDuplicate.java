public  class RemoveDuplicate{
  
  public static void DuplicateDel(String str,int idx,String newStr, int count){

  if(idx==str.length()){
    System.out.println(newStr);
    return;
  }

    char CurrentChar=str.charAt(idx);
    if(CurrentChar=='x'){
      count++;
      DuplicateDel(str, idx+1, newStr, count);
    }else{
      newStr+=CurrentChar;
      DuplicateDel(str, idx+1, newStr, count);
    }
  }
  
  
  public static void main(String[] args) {
      String str="axbxxcxd";
      DuplicateDel(str, 0, " ", 0);
  }
}