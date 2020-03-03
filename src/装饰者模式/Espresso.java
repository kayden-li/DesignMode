package 装饰者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 装饰者模式 <br>
 *       <b>ClassName:</b> Espresso <br>
 *       <b>Date:</b> 2020年2月26日 上午11:59:53
 */
public class Espresso extends Coffee {

    public Espresso() {
        setDes("意大利咖啡");
        setPrice(6.0f);
    }
}
