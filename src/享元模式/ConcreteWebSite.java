package 享元模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 享元模式 <br>
 *       <b>ClassName:</b> ConcreteWebSite <br>
 *       <b>Date:</b> 2020年2月29日 下午7:17:35
 */
// 具体网站
public class ConcreteWebSite extends WebSite {

    private String type = ""; // 网站发布的类型

    public ConcreteWebSite(String type) {
        super();
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为" + type + "=========" + user.getName());
    }

}
