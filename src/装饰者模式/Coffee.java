package 装饰者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 装饰者模式 <br>
 *       <b>ClassName:</b> Coffee <br>
 *       <b>Date:</b> 2020年2月26日 上午11:58:47
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
