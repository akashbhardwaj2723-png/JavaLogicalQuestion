class  Me_Eating  extends Thread{
   String s1="momo";
   String s2="Chaumin,Bread,Manchuriyan";

    public  Me_Eating(String g,String h) {
        s1=g;
        s2=h;                                                                                               
    }
   public void run(){
       SetData();
   }
   public  void SetData(){
    System.out.println("This is may best of Fast Food:"+s1);
    System.out.println("This Is a May Second Choice:"+s2);
   }
}



class  MyThrade2{
  public static void main(String[] args) {
   Me_Eating p=new Me_Eating("Eage","Gulabjamun");
   Thread z=new Thread(p);
   z.start();   
  }
}