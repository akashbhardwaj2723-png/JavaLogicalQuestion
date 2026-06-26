 class MyItems implements Runnable{
  String S1="Panir";

    public MyItems(String S1) {
        this.S1=S1;
    }
   public  void run(){
      System.out.println("This Is My Multiple Item s Avalabel:"+S1);
      System.out.println("This IS my thread:"+Thread.currentThread().getName());
    }
    
 }
class MyDhabha{
  public static void main(String[] args) {
     MyItems a1=new MyItems("momo");
     MyItems a2= new MyItems("Pudhi");
     Thread p=new Thread(a1);
     Thread q=new Thread(a2); 
     p.start();
     q.start();     
  }
}