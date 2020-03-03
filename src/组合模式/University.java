package 组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 组合模式 <br>
 *       <b>ClassName:</b> University <br>
 *       <b>Date:</b> 2020年2月27日 下午12:22:43
 */
// Composite
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    // 重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    // 重写remove方法
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // 输出University中包含的学院
    @Override
    protected void print() {
        System.out.println("-----------" + getName() + "----------");
        // 遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

}
