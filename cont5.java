cont5

public class ThreadsTest implements Runnable {
    public static int x;
    public boolean y;

    public void sum() throws InterruptedException {
        synchronized (this) {
            x += 3;
        }
    }

    public void mult() throws InterruptedException {
        synchronized (this) {
            x *= 2;
        }
    }

    @Override
    public void run() {
        x = 2;
        try {
            if (this.y)
                this.sum();
            else
                this.mult();
        } catch (InterruptedException e) {
            System.out.println("ERROR!");
        }
    }

    public static void main(String[] args) {
        ThreadsTest td = new ThreadsTest();
        for (int i = 0; i < 5; i++) {
            td.y = false;
            new Thread(td).start();
            td.y = true;
            new Thread(td).start();
            System.out.println(x);
        }
    }
}
