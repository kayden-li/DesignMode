package 工厂模式.传统与简单工厂.order;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.order <br>
 *       <b>ClassName:</b> Test <br>
 *       <b>Date:</b> 2020年2月20日 下午1:21:57
 */
public class Test {

    public static void main(String[] args) {
        new 简单工厂Order(new 简单工厂());
        System.out.println("程序退出");
    }
}
