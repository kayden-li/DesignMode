package 享元模式;
/** * <b>Description:</b><br>
 * @author 李帆
 * @version 1.0
 * @Note
 * <b>ProjectName:</b> DesignMode
 * <br><b>PackageName:</b> 享元模式
 * <br><b>ClassName:</b> WebSiteFactory
 * <br><b>Date:</b> 2020年2月29日 下午7:19:49
 */
//网站工厂类,根据需求返回一个网站

import java.util.HashMap;

public class WebSiteFactory {

    // 集合，充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    // 根据请求的类型，返回一个网站，若没有，创建一个新网站，并放入池中
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }

        return pool.get(type);
    }

    // 获取网站分类总数(池中有多少网站类型)
    public int getWebSiteCount() {
        return pool.size();
    }
}
