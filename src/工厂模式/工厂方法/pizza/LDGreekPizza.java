package 工厂模式.工厂方法.pizza;

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
public class LDGreekPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("准备伦敦奶酪披萨");
    }

}
