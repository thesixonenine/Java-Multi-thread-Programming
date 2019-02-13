package com.simple.java.multithread.base02;

import java.util.concurrent.TimeUnit;

/**
 * @author simple
 * @version 1.0
 * @date 2019-02-13 14:34
 * @since 1.0
 */
public class TestUnSharedVar {
    private static boolean flag = true;

    private static Thread getThread() {
        return new Thread(() -> {
            while (flag) {
            }
            System.out.println(Thread.currentThread().getName() + " 已退出");
        }, "RunningThread");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = getThread();
        thread.start();
        TimeUnit.SECONDS.sleep(3);
        flag = false;
    }
}
