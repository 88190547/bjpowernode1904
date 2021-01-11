package com.bjpowernode.java.thread;

/**
 * 采用匿名内部类可以吗？
 */
public class ThreadTest04 {
    public static void main(String[] args) {


        //创建线程对象，采用匿名内部类方式
        //这是通过一个没有名字的类，new出来的对象
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //编写程序，这段程序运行在分支线程中（分支栈）
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程->" + i);
                }
            }
        });

        //启动线程
        t.start();

        //这里的方法还是运行在主线程中
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程->" + i);
        }
    }
}
