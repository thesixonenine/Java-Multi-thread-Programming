package io.github.thesixonenine.multithread.base02;

/**
 * 多个线程实例运行同一个线程对象
 * @author simple
 * @version 1.0
 * @date 2019-02-13 10:52
 * @since 1.0
 */
public class TestMultiThreadUnSafe implements Runnable {
    private int count = 5;

    @Override
    public void run() {
        count--;
        System.out.println("由 " + Thread.currentThread().getName() + " 操作, 操作结果为: " + count);
    }

    public static void main(String[] args) {
        TestMultiThreadUnSafe threadUnSafe = new TestMultiThreadUnSafe();
        Thread thread1 = new Thread(threadUnSafe);
        Thread thread2 = new Thread(threadUnSafe);
        Thread thread3 = new Thread(threadUnSafe);
        Thread thread4 = new Thread(threadUnSafe);
        Thread thread5 = new Thread(threadUnSafe);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // 输出:

        // 由 Thread-0 操作, 操作结果为: 3
        // 由 Thread-2 操作, 操作结果为: 2
        // 由 Thread-1 操作, 操作结果为: 3
        // 由 Thread-3 操作, 操作结果为: 1
        // 由 Thread-4 操作, 操作结果为: 0
    }
}
