package 工厂模式.抽象工厂.order;

import 工厂模式.抽象工厂.pizza.BJCheesePizza;
import 工厂模式.抽象工厂.pizza.BJGreekPizza;
import 工厂模式.抽象工厂.pizza.Pizza;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.抽象工厂.order <br>
 *       <b>ClassName:</b> BJFactory <br>
 *       <b>Date:</b> 2020年2月20日 下午3:12:22
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂模式");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("greek".equals(orderType)) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }

}
