package 桥接模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 桥接模式 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月24日 下午12:37:41
 */
public class Client {

    public static void main(String[] args) {

        // 获取折叠式手机
        Phone phone1 = new FoldedPhone(new XiaoMi());

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("============");

        phone1 = new FoldedPhone(new Vivo());

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("============");

        phone1 = new UpRightPhone(new Vivo());

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("============");

        phone1 = new UpRightPhone(new XiaoMi());

        phone1.open();
        phone1.call();
        phone1.close();
    }
}
