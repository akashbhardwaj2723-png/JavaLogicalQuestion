class MayThread implements Runnable {

    int std;
    String course_name;

    MayThread(int p, String s1) {
        std = p;
        course_name = s1;
    }

    public void run() {
        showData();
    }

    public void showData() {
        System.out.println("My class Present Student: " + std);
        System.out.println("This is BCA course: " + course_name);
    }
}

 class MyRunableClass{

    public static void main(String[] args) {

        MayThread p = new MayThread(6, "Java, SQL");
        Thread q = new Thread(p);
        q.start();

    }
}