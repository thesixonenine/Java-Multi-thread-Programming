package com.simple.java.multithread.base02;

/**
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
    }
}
