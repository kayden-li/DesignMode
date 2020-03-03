package 代理模式.静态代理;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 代理模式.静态代理 <br>
 *       <b>ClassName:</b> TeacherDao <br>
 *       <b>Date:</b> 2020年3月2日 上午11:06:40
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("正在上课");
    }

}
