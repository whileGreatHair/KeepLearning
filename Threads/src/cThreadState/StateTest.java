package cThreadState;

import org.junit.Test;


public class StateTest {

    /*******************NEW****************/
    @Test
    public void testStateNew() {
        Thread thread = new Thread(() -> {
        });
        System.out.println(thread.getState());
    }


    /*******************BLOCKED与RUNNABLE状态的转换****************/
    @Test
    public void blocked() throws InterruptedException {

        Thread a = new Thread(this::testMethod, "a");
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "b");

        a.start();
        //Thread.sleep(1000L);
        b.start();
        System.out.println(a.getName() + ":" + a.getState()); // 输出？
        System.out.println(b.getName() + ":" + b.getState()); // 输出？
    }

    // 同步方法争夺锁
    private synchronized void testMethod() {
        try {
            Thread.sleep(2L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * **************WAITING状态与RUNNABLE状态的转换***************
     *根据转换图我们知道有3个方法可以使线程从RUNNABLE状态转为WAITING状态。我们主要介绍下Object.wait()和Thread.join()。
     *
     * Object.wait()
     * 调用wait()方法前线程必须持有对象的锁。
     * 线程调用wait()方法时，会释放当前的锁，直到有其他线程调用notify()/notifyAll()方法唤醒等待锁的线程。
     * 需要注意的是，其他线程调用notify()方法只会唤醒单个等待锁的线程，如有有多个线程都在等待这个锁的话不一定会唤醒到之前调用wait()方法的线程。
     * 同样，调用notifyAll()方法唤醒所有等待锁的线程之后，也不一定会马上把时间片分给刚才放弃锁的那个线程，具体要看系统的调度。
     *
     * Thread.join()
     * 调用join()方法不会释放锁，会一直等待当前线程执行完毕（转换为TERMINATED状态）。
     *
     *
     * */


    @Test
    public void wait2Run() throws InterruptedException {
        Thread a = new Thread(this::testMethod, "a");
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "b");

        a.start();
        a.join();
        b.start();
        System.out.println(a.getName() + ":" + a.getState()); // 输出？
        System.out.println(b.getName() + ":" + b.getState()); // 输出？
    }
}
