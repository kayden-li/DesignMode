package 工厂模式.工厂方法.pizza;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 工厂模式.Pizza <br>
 *       <b>ClassName:</b> Pizza <br>
 *       <b>Date:</b> 2020年2月20日 上午11:57:02
 */

public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cutting");
    }

    public void box() {
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }

}
