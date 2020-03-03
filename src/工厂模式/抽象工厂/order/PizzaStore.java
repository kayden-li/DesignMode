package 工厂模式.抽象工厂.order;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.抽象工厂.order <br>
 *       <b>ClassName:</b> PizzaStore <br>
 *       <b>Date:</b> 2020年2月20日 下午3:35:32
 */
public class PizzaStore {

    public static void main(String[] args) {

        new 抽象工厂Order(new BJFactory());
    }

}
