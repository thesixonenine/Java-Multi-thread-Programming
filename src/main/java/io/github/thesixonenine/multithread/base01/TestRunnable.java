package io.github.thesixonenine.multithread.base01;

/**
 * @author simple
 * @version 1.0
 * @date 2019-02-12 16:48
 * @since 1.0
 */
public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Hello");
    }

    public static void main(String[] args) {
        new Thread(new TestRunnable()).start();
        System.out.println(Thread.currentThread().getName() + " Hi");
    }
}
