package 组合模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 组合模式 <br>
 *       <b>ClassName:</b> OrganizationComponent <br>
 *       <b>Date:</b> 2020年2月27日 下午12:11:52
 */
public abstract class OrganizationComponent {

    private String name; // 名字
    private String des; // 说明

    protected void add(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    // 打印抽象方法，子类都需要实现
    protected abstract void print();
}
