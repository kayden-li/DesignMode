package 桥接模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 桥接模式 <br>
 *       <b>ClassName:</b> XiaoMi <br>
 *       <b>Date:</b> 2020年2月24日 下午12:28:44
 */
public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

}
