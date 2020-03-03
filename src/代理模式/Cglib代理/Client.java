package 代理模式.Cglib代理;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 代理模式.Cglib代理 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年3月2日 下午12:33:10
 */
public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao target = new TeacherDao();
        // 获取代理对象，并将目标对象传入代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        // 执行代理对象的方法，处罚intecept方法，从而实现对目标对象的调用
        proxyInstance.teach();

    }
}
