package 装饰者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 装饰者模式 <br>
 *       <b>ClassName:</b> Milk <br>
 *       <b>Date:</b> 2020年2月26日 下午12:11:37
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("milk");
        setPrice(2.0f);// 装饰者价格
    }

}
