package 工厂模式.传统与简单工厂.pizza;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.Pizza <br>
 *       <b>ClassName:</b> GreekPizza <br>
 *       <b>Date:</b> 2020年2月20日 下午12:02:41
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备制作希腊披萨");
    }

}
