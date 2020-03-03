package 外观模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 外观模式 <br>
 *       <b>ClassName:</b> Projector <br>
 *       <b>Date:</b> 2020年2月28日 下午2:23:49
 */
public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void focus() {
        System.out.println("Projector is projector");
    }
}
