package 适配器模式.对象适配器模式;

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
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    // 通过构造器传入src实例
    public VoltageAdapter(Voltage220V voltage220v) {
        this.voltage220V = voltage220v;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (null != voltage220V) {
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器");
            dstV = srcV / 44;
            System.out.println("适配完成,输出电压为" + dstV + "V");
        }
        return dstV;
    }

}
