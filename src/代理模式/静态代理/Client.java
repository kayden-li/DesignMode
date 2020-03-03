package 代理模式.静态代理;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 代理模式.静态代理 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年3月2日 上午11:12:21
 */
public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao teacherDao = new TeacherDao();

        // 创建代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        // 通过代理对象调用被代理对象的方法
        teacherDaoProxy.teach();
    }
}
