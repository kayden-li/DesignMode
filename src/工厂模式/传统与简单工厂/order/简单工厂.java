package 工厂模式.传统与简单工厂.order;
/** * <b>Description:</b><br>
 * @author 李帆
 * @version 1.0
 * @Note
 * <b>ProjectName:</b> DesignMode
 * <br><b>PackageName:</b> 工厂模式.order
 * <br><b>ClassName:</b> 简单工厂模式
 * <br><b>Date:</b> 2020年2月20日 下午1:07:53
 */

import 工厂模式.传统与简单工厂.pizza.CheesePizza;
import 工厂模式.传统与简单工厂.pizza.GreekPizza;
import 工厂模式.传统与简单工厂.pizza.Pizza;

public class 简单工厂 {

    // 根据orderType返回一个披萨对象
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }

        return pizza;
    }

    // 静态方式的工厂方法
    public static Pizza createPizza_staic(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式_Static");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }

        return pizza;
    }
}
