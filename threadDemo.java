class myThread extends Thread {
    public void run() {
        int i = 0;
        while (i <= 5) {

            System.out.println("hello i am sujan");
            i++;
        }
    }
}

public class threadDemo {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
    }

}
