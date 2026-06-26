
class SlevelInheritance {

    int age = 20;
    String S1 = "Akash Bhardwaj";

    public void  display1() {
        System.out.println("May Age : " + age + " "+"May name is : " + S1);
    }
}

class MySecondProperties extends SlevelInheritance {

    int rollNumber = 1234454645;
    String Myclass = "Bca";

    void display2() {
        System.out.println("My roll number is : " + rollNumber + " "+"My class is : " + Myclass);
    }
}

class Inheritance {

    public static void main(String[] args) {
        MySecondProperties a1 = new MySecondProperties();
        a1.display1();
          a1.display2();
    }
}
