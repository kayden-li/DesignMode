package 工厂模式.抽象工厂.order;
/** * <b>Description:</b><br>
 * @author 李帆
 * @version 1.0
 * @Note
 * <b>ProjectName:</b> DesignMode
 * <br><b>PackageName:</b> 工厂模式.抽象工厂.order
 * <br><b>ClassName:</b> AbsFactory
 * <br><b>Date:</b> 2020年2月20日 下午3:04:49
 */

import 工厂模式.抽象工厂.pizza.Pizza;

public interface AbsFactory {
    // 让工厂子类具体实现
    public Pizza createPizza(String orderType);
}
