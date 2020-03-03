package 适配器模式.对象适配器模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 适配器模式.类适配器模式 <br>
 *       <b>ClassName:</b> Voltage <br>
 *       <b>Date:</b> 2020年2月23日 下午12:22:41
 */
public class Voltage220V {

    // 输出220V电压
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
