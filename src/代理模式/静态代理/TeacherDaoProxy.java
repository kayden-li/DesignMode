package 代理模式.静态代理;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 代理模式.静态代理 <br>
 *       <b>ClassName:</b> TeacherDaoProxy <br>
 *       <b>Date:</b> 2020年3月2日 上午11:07:20
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;// 目标对象，通过接口聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理");
        target.teach();
        System.out.println("结束");
    }

}
