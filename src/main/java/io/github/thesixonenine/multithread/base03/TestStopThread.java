package io.github.thesixonenine.multithread.base03;

import java.util.concurrent.TimeUnit;

/**
 * 测试使用interrupt()方法是否可以停止线程
 *
 * @author simple
 * @version 1.0
 * @date 2019-07-26 15:32
 * @since 1.0
 */
public class TestStopThread {
    public static void main(String[] args) {
        // 1. 使用退出标记, 也就是当run方法完成后线程终止
        // 2. 使用stop方法(stop, suspend, resume都被标记为已废弃, 原因是这些方法调用后, 如果线程还持有锁, 则其他线程永远也拿不到锁了)
        // 3. 使用interrupt方法

        Thread thread = new Thread(new JustInterrupt(), "JustInterrupt");
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 线程仍旧输出50万行, 并不会被打断
        thread.interrupt();
    }
}

class JustInterrupt implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
