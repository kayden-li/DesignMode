package 外观模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 外观模式 <br>
 *       <b>ClassName:</b> Screen <br>
 *       <b>Date:</b> 2020年2月28日 下午2:42:33
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen up");
    }

    public void down() {
        System.out.println("Screen down");
    }
}
