import java.util.*;
public class  MyArrayList{
  public static void main (String[]args){
    List<String> shree= new ArrayList<String>();
  shree.add("HuLUlu");
  shree.add("AkAsh ji");
  shree.add("App Thik ho");
  shree.add("Me Eating And You");
  shree.set( 0, "Hello madam ji");
  System.out.println(shree.get(2));
  shree.remove(3);
  System.out.println(shree);
  Collections.sort(shree);
  for (int i = 0; i <shree.size(); i++) {
      System.out.println( shree.get(i)+"");
    ArrayList<Integer> a1=new ArrayList<Integer>();
    a1.add(10);
    a1.add(20);
    a1.add(22);
    a1.add(6);
    a1.add(8);
    a1.add(1);
    // Array value Sort(assending order) collection method (collections.sort(a1)) pass by the object ;
    Collections.sort(a1);
    for(int j = 0;j<a1.size(); j++) {
        System.out.println("May Array list:"+a1.get(j));
    }
  }
      
  }
  
}