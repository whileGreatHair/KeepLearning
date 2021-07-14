package aThread;

import org.junit.Test;

/**
 * @author yiqr
 * @create 2021-05-07 14:14
 **/
public class Demo {
    /*
     * 方式一：继承Thread
     * 方式二：实现Runnable接口的run方法
     */

    /******************************方式一*****************************/
    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            System.out.println("MyThread: extends Thread");
        }
    }

    @Test
    public void demo1() {
        MyThread1 myThread = new MyThread1();
        //调用start方法该线程才算启动！
        myThread.start();
    }

    /******************************方式二*****************************/
    public static class MyThread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("MyThread:implements Runnable");
        }
    }

    @Test
    public void demo2() {
        new Thread(new MyThread2()).start();

        //Java 8 函数式编程，可以省略MyThread类
        new Thread(() -> {
            System.out.println("Java 8 匿名内部类");
        }).start();
    }
}
