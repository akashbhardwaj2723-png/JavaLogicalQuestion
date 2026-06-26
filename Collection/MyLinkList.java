import java.util.LinkedList;

public class MyLinkList {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    LinkedList<Integer> m1=new LinkedList<Integer>();
    m1.add(10);
    m1.add(20);
    m1.add(30);
  m1.add(40);
 m1.add(50);
  m1.add(60);
  m1.addFirst(0);
  m1.addLast(6);
  m1.push(5);
  m1.pop(30);
  System.out.println(" "+m1);
  for (int i = 0; i < m1.size(); i++) {
       System.out.println(""+m1.get(i));
   }
  }
}
