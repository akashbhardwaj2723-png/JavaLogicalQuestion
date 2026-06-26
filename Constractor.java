
class Myconstractor {

    int a;
    int b;

   public  Myconstractor(int p, int q) {// parametrize constractor & constractor over loding
        a = p;
        b = q;
        System.out.println("Parametrize Constractor Refrance Value=" + a + " " + b);
    }

    public Myconstractor(int c) {// only paramatrize constractor
        System.out.println("   " + c);
    }

    public Myconstractor() {// default constractor

    }
}

 public class Constractor {

    public static void main(String[] args) {
        Myconstractor a1 = new Myconstractor();
        Myconstractor b1=new Myconstractor(2, 3);
        Myconstractor c1=new Myconstractor(3);
    }
}
