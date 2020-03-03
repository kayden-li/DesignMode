package 装饰者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 装饰者模式 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月26日 下午12:13:00
 */
public class Client {

    public static void main(String[] args) {
        // 装饰者模式下的订单：2chocolate（装饰者）+1milk（装饰者）+1longblack(主体)

        // 1longblack
        Drink order = new LongBlack();
        System.out.println(order.getDes() + order.cost());
        // 1milk
        order = new Milk(order);
        System.out.println(order.getDes() + order.cost());
        // 1chocolate
        order = new Chocolate(order);
        System.out.println(order.getDes() + order.cost());
        // 1 chocolate
        order = new Chocolate(order);
        System.out.println(order.getDes() + order.cost());
    }
}
