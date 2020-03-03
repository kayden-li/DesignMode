package 工厂模式.传统与简单工厂.order;
/** * <b>Description:</b><br>
 * @author 李帆
 * @version 1.0
 * @Note
 * <b>ProjectName:</b> DesignMode
 * <br><b>PackageName:</b> 工厂模式.order
 * <br><b>ClassName:</b> 简单工厂Order
 * <br><b>Date:</b> 2020年2月20日 下午1:13:32
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import 工厂模式.传统与简单工厂.pizza.Pizza;

public class 简单工厂Order {

    // 定义一个简单工厂对象
    简单工厂 simpleFactory;
    Pizza pizza = null;

    public 简单工厂Order(简单工厂 simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(简单工厂 simpleFactory) {
        String orderType = "";

        this.simpleFactory = simpleFactory;// 设置简单工厂对象

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            if (null != pizza) {
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
