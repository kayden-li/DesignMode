package 工厂模式.工厂方法.order;

import 工厂模式.工厂方法.pizza.BJCheesePizza;
import 工厂模式.工厂方法.pizza.BJGreekPizza;
import 工厂模式.工厂方法.pizza.Pizza;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.工厂方法.order <br>
 *       <b>ClassName:</b> BJOrderPizza <br>
 *       <b>Date:</b> 2020年2月20日 下午2:25:53
 */
public class BJOrderPizza extends 工厂方法模式Order {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }

}
