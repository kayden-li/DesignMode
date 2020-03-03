package 工厂模式.工厂方法.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import 工厂模式.工厂方法.pizza.Pizza;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.order <br>
 *       <b>ClassName:</b> 工厂方法模式 <br>
 *       <b>Date:</b> 2020年2月20日 下午1:55:23
 */
public abstract class 工厂方法模式Order {

    // 定义一个抽象方法 createPizza 让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    public 工厂方法模式Order() {
        Pizza pizza = null;
        String orderType = "";

        do {
            orderType = getType();
            pizza = createPizza(orderType);// 抽象方法,由工厂子类实现
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
