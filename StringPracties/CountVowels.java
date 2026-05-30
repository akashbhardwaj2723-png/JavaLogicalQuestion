public  class CountVowels{
  public static void main(String[] args) {
      String str="AkashBhardwaj";
      int CountVowels=0;
      for (int i = 0; i <str.length(); i++) {
      int  ch=str.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
   CountVowels++;
      }
      }
      System.out.println("Vowels Count:"+CountVowels);

  }
}