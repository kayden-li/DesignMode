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
public class 静态内部类 {
    private 静态内部类() {
    }

    private static class 静态内部类实例 {
        private static final 静态内部类 INSTANCE = new 静态内部类();
    }

    public static 静态内部类 getInstance() {
        return 静态内部类实例.INSTANCE;
    }
}
