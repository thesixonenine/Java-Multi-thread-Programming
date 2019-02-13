package com.simple.java.multithread.base01;

/**
 * @author simple
 * @version 1.0
 * @date 2019-02-12 16:40
 * @since 1.0
 */
public class TestExtends extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Hello");
    }

    public static void main(String[] args) {
        new TestExtends().start();
        System.out.println(Thread.currentThread().getName() + " Hi");
    }
}
