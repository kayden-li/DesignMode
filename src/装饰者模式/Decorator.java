package 装饰者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 装饰者模式 <br>
 *       <b>ClassName:</b> Decorator <br>
 *       <b>Date:</b> 2020年2月26日 下午12:02:42
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {// 组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        return getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes()被装饰者（主体）的信息
        return des + "   " + getPrice() + "&&" + obj.getDes();
    }

}
