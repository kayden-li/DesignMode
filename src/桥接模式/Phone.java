package 桥接模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 桥接模式 <br>
 *       <b>ClassName:</b> Phone <br>
 *       <b>Date:</b> 2020年2月24日 下午12:31:00
 */
public abstract class Phone {

    // 组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
