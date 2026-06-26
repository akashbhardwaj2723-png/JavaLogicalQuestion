 class MyCookies  extends Thread{
    public    String Item="Momo";
     MyCookies(String Item){
          this.Item=Item;
    }
    public void run(){
      System.out.println("This Is the best of my momo :"+Item);
      System.out.println("Thread name: " + Thread.currentThread().getName());
    
    
    }
}


class  Resturent{
  public static void main(String[] args) {
    Thread a1=new MyCookies("Momo");
     Thread a2=new MyCookies("Chart");
      Thread a3=new MyCookies("Bread"); 
       Thread a4=new MyCookies("Manchuriyan"); 
        a1.start();
        a2.start();
        a3.start();
        a4.start();
  }
}