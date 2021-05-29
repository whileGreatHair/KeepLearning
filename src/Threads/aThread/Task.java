package Threads.aThread;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author yiqr
 * @create 2021-05-07 15:03
 **/
public class Task implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        //模拟计算需要一秒
        Thread.sleep(1000);
        return 2;
    }

    @Test
    public void task1() throws Exception {
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> result = executor.submit(task);
        // 注意调用get方法会阻塞当前线程，直到得到结果。
        // 所以实际编码中建议使用可以设置超时时间的重载get方法。
        System.out.println(result.get());
    }

    @Test
    public void task2() throws Exception {
        // 使用
        ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask<>(new Task());
        executor.submit(futureTask);
        System.out.println(futureTask.get());
    }
}
