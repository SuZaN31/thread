class myThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 5) {
            System.out.println("hey! i am here");
            i++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class runnableDemo {
    public static void main(String[] args) {
        myThreadRunnable1 r1 = new myThreadRunnable1();
        Thread t1 = new Thread(r1);

        t1.start();

    }

}
