

public  class StringLastAccurance{
public static int first=-1;
public static int last=-1;
public static void lastAccurance(String str, char  element,int idx){
 
 
  if(idx==str.length()){
    System.out.println(first);
    System.out.println(last);
    return; 
  }
   char CurrentChar=str.charAt(idx);
  if(CurrentChar==element){
    if(first==-1){
      first=idx;
    }else{
      last=idx;
    }
    //  lastAccurance(str, element, idx+1);
  }
  lastAccurance(str, element, idx+1);
}

  public static void main(String[] args) {
      String str="abacaad";
      char element='a';
      int idx=0;
      lastAccurance(str, element, idx);

  }
}