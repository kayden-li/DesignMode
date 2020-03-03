package 装饰者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 装饰者模式 <br>
 *       <b>ClassName:</b> Chocolate <br>
 *       <b>Date:</b> 2020年2月26日 下午12:10:07
 */
// 具体的装饰者
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("chocolate");
        setPrice(3.0f);// 装饰者价格
    }

}
