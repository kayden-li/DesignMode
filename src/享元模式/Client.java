package 享元模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 享元模式 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月29日 下午7:25:33
 */
public class Client {

    public static void main(String[] args) {

        // 创建一个工厂
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWebSiteCategory("新闻");

        webSite1.use(new User("bob"));

        WebSite webSite2 = factory.getWebSiteCategory("博客");

        webSite2.use(new User("jack"));

        System.out.println(factory.getWebSiteCount());

    }

}
