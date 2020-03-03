package 装饰者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 装饰者模式 <br>
 *       <b>ClassName:</b> Soy <br>
 *       <b>Date:</b> 2020年2月26日 下午12:12:12
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes("Soy");
        setPrice(1.5f);// 装饰者价格
    }

}
