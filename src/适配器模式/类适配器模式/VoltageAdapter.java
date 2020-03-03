package 适配器模式.类适配器模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 适配器模式.类适配器模式 <br>
 *       <b>ClassName:</b> VoltageAdapter <br>
 *       <b>Date:</b> 2020年2月23日 下午12:25:00
 */
// 被适配的类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        // 获取220V电压
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }

}
