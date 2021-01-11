package com.bjpowernode.java.thread;

/**
 *在Java中怎样终止一个线程的执行。
 *      这种方式存在很大缺点，容易丢失数，因为这种方式是直接将线程杀死了
 *      线程没有保存的数据将会丢失，不建议使用。
 */
public class ThreadTest09 {
    public static void main(String[] args) {

        Thread t = new Thread(new MyRunnable03());
        t.start();

        //模拟5秒
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5秒之后强行终止t线程
        t.stop();   //已过时（不建议使用。）
    }
}

class MyRunnable03 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}