class Archana{
  String s1="Nursing";
  int age=22;
  void ShowData(){
    System.out.println("This is a archana Depratment:"+s1);
     System.out.println("Acahana Age:"+age);
  }
} class PersonalInfo extends Archana{
  long MobMum=543534543;
  String BankName="Union Bank of India";
  void ShowData(){
    System.out.println("This is a my Personal information mobNum:"+MobMum);
     System.out.println("My Bank Account number:"+BankName);
  }
}


class Overriding{
  public static void main(String[] args) {
      PersonalInfo b1=new PersonalInfo();
      b1.ShowData();
      b1.ShowData();
  }
}