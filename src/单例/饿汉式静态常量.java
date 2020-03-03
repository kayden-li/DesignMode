package 单例;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 单例 <br>
 *       <b>ClassName:</b> 饿汉式静态常量 <br>
 *       <b>Date:</b> 2020年2月19日 下午12:51:57
 */
public class 饿汉式静态常量 {
    private final static 饿汉式静态常量 instance = new 饿汉式静态常量();

    private 饿汉式静态常量() {
    }

    public static 饿汉式静态常量 getInstance() {
        return null;
    }
}
