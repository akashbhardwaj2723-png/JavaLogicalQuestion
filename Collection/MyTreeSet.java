import java.util.*;
// Stroe data HERCHICALAND sort way in a Treeset(ASANDING ORDER) 
public class MyTreeSet{
  public static void main(String[] args) {
      TreeSet<Integer> n=new TreeSet<Integer>();
      n.add(1);
      n.add(2);
      n.add(3);
      n.add(4);
      n.add(5);
    n.remove(2);
    System.out.println(n.size());
      for(int i:n){
        if(n.contains(i)){
          System.out.println(i);
        }else{
          System.out.println("Dose Not Access TreeSet");
        }
      }
  }
}