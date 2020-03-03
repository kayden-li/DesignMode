package 工厂模式.抽象工厂.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import 工厂模式.抽象工厂.pizza.Pizza;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.抽象工厂.order <br>
 *       <b>ClassName:</b> 抽象工厂Order <br>
 *       <b>Date:</b> 2020年2月20日 下午3:15:49
 */
public class 抽象工厂Order {

    AbsFactory factory;

    public 抽象工厂Order(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;

        do {
            orderType = getType();
            // factory取决于传入的工厂类型
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
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
