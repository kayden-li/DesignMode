package 适配器模式.对象适配器模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 适配器模式.类适配器模式 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月23日 下午12:29:04
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("对象适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }

}
