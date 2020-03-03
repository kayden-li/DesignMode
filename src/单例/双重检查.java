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
public class 双重检查 {
    // volatile:保证可见性（一个线程修改后把值存回主存后会向其他线程发消息通知他们更改缓存）
    // synchronized和Lock也能够保证可见性、有序性
    private static volatile 双重检查 instance;

    private 双重检查() {
    }

    public static 双重检查 getInstance() {
        if (instance == null) {
            synchronized (双重检查.class) {
                if (instance == null) {
                    instance = new 双重检查();
                }
            }
        }
        return instance;
    }
}
