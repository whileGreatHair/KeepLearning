package bThreadGroupAndPriority;

/**
 * @author yiqr
 * @create 2021-05-07 15:54
 **/
public class Demo1 {
    /**
     * Java中用ThreadGroup来表示线程组，我们可以使用线程组对线程进行批量控制。
     * <p>
     * ThreadGroup和Thread的关系就如同他们的字面意思一样简单粗暴，每个Thread必然存在于一个ThreadGroup中，
     * Thread不能独立于ThreadGroup存在。执行main()方法线程的名字是main，如果在new Thread时没有显式指定，
     * 那么默认将父线程（当前执行new Thread的线程）线程组设置为自己的线程组。
     */
    public static void main(String[] args) {
        Thread testThread = new Thread(() -> {
            System.out.println("testThread当前线程组名称：" + Thread.currentThread().getThreadGroup().getName());
            System.out.println("testThread线程名称：" + Thread.currentThread().getName());
        });

        testThread.start();

        System.out.println("执行main所在线程的线程组名字： " + Thread.currentThread().getThreadGroup().getName());
        System.out.println("执行main方法线程名字：" + Thread.currentThread().getName());
    }
}
