package 代理模式.动态代理;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 代理模式.动态代理 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年3月2日 上午11:45:29
 */
public class Client {

    public static void main(String[] args) {

        TeacherDao target = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        // class com.sun.proxy.$Proxy0
        // 内存中动态生成了代理对象
        System.out.println(proxyInstance.getClass());

        proxyInstance.teach();
    }
}
