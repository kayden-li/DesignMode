package 桥接模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> <br>
 *       <b>ClassName:</b> UpRightPhone <br>
 *       <b>Date:</b> 2020年2月24日 下午12:41:12
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("直立手机");
    }

    public void close() {
        super.close();
        System.out.println("直立手机");
    }

    public void call() {
        super.call();
        System.out.println("直立手机");
    }
}
