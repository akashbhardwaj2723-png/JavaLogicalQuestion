 class BestFriend{
   private String s1="Sweety";
    void setData(String s2){
    s1=s2;
   } 

    void  getData(){
     System.out.println("This Is May Only One best Friend:"+s1);
   }
}
   public class Encapsulation{
  public static void main(String[] args) {
      
      BestFriend a1=new BestFriend();
       a1.setData("Shital");
       a1.getData();
  }
}