// set Is a store data herirchal form and just like a tree;
import java.util.*;
// has value Store random order;
public class MyHasSet {
  public static void main(String[] args) {
    HashSet<Integer>set=new HashSet<Integer>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);
    // How to value Delete of yuor data
    System.out.println(set.size());
    System.out.println("This is a Set Operation by a hasSet"+set);
    System.out.println(set.remove(2));
    for(int n:set){
    if(set.contains(n)){
      System.out.println(n);
    }else{
      System.out.println("Not Value content");
    }
    }
  }
}