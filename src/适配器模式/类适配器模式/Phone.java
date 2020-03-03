package 适配器模式.类适配器模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 适配器模式.类适配器模式 <br>
 *       <b>ClassName:</b> Phone <br>
 *       <b>Date:</b> 2020年2月23日 下午12:27:14
 */
public class Phone {

    // 充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V");
        }
    }
}
