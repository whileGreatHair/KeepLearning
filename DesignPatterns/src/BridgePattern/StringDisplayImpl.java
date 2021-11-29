package BridgePattern;

/**
 * @date 2021/11/29 3:23 下午
 * 类的实现层次结构
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;                      //要显示的字符串

    private int width;                          //以字节单位计算出的字符串的宽度

    public StringDisplayImpl(String string) {   //构造函数接收要显示的字符串string
        this.string = string;                   //将它保存在字段中
        this.width = string.getBytes().length;  //将字符串的宽度也保存在字段中，以供使用

    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");                //显示用来表示方框的角"+"
        for (int i = 0; i < width; i++) {       //显示width个"-"
            System.out.print("-");            //将其用做方框的边框
        }
        System.out.println("+");                //显示用来表示方框的角的"+"
    }
}
