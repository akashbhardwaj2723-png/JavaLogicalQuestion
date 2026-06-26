 class Myconstractor{
  int a=5; int b=6;
    public  Myconstractor(int c){
      
      System.out.println("Two Value"+c);
    }
    public Myconstractor(){
         System.out.println("This is a default constractor");
    }
    // public Myconstractor(int p,int q){
    //     System.out.println("This Value double parametrize Connstractor"+a+" "+b);// 5 and 6 Value print
       
    //        }
    // this kay word use corrent objhect ko Show value
   public Myconstractor(int p,int q){
       this.b=q;
      this.a=p;
        System.out.println("This Value double parametrize Connstractor"+a+" "+b);
       
           }

 }
public class ThisConstractor{
  public static void main(String[] args) {
      Myconstractor a1=new Myconstractor(2,3);
      Myconstractor a2=new Myconstractor(3);

  }
}