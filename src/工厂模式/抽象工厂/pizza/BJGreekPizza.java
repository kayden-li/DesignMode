package 工厂模式.抽象工厂.pizza;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.工厂方法.pizza <br>
 *       <b>ClassName:</b> BJCheesePizza <br>
 *       <b>Date:</b> 2020年2月20日 下午2:10:33
 */
public class BJGreekPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京希腊披萨");
        System.out.println("准备北京希腊披萨");
    }

}
