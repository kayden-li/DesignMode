package 工厂模式.传统与简单工厂.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import 工厂模式.传统与简单工厂.pizza.CheesePizza;
import 工厂模式.传统与简单工厂.pizza.GreekPizza;
import 工厂模式.传统与简单工厂.pizza.Pizza;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.order <br>
 *       <b>ClassName:</b> OrderPizza <br>
 *       <b>Date:</b> 2020年2月20日 下午12:04:29
 */
public class 传统模式 {

    public 传统模式() {
        Pizza pizza = null;
        String orderType;// 披萨类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    // 获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String string = strin.readLine();
            return string;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "";
        }
    }
}
