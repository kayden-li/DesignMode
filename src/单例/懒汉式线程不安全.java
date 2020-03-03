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
public class 懒汉式线程不安全 {

    private static 懒汉式线程不安全 instance;

    private 懒汉式线程不安全() {

    }

    // 提供一个静态的公有方法，当使用到该方法时，采取创建instance
    // 懒汉式
    public static 懒汉式线程不安全 getInstance() {
        if (instance == null) {
            instance = new 懒汉式线程不安全();
        }
        return instance;
    }
}
