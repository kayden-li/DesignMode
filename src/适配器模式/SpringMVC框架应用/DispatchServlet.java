package 适配器模式.SpringMVC框架应用;
/** * <b>Description:</b><br>
 * @author 李帆
 * @version 1.0
 * @Note
 * <b>ProjectName:</b> DesignMode
 * <br><b>PackageName:</b> 适配器模式.SpringMVC框架应用
 * <br><b>ClassName:</b> DispatchServlet
 * <br><b>Date:</b> 2020年2月23日 下午1:31:07
 */

import java.util.ArrayList;

public class DispatchServlet {

    public static ArrayList<HandleAdapter> handleAdapters = new ArrayList<HandleAdapter>();

    public DispatchServlet() {
        handleAdapters.add(new AnnotationHandleAdapter());
        handleAdapters.add(new HttpHandleAdapter());
        handleAdapters.add(new SimpleHandleAdapter());
    }

    public void doDispatch() {
        // 此处模拟SpringMVC从request取handle对象
        // 适配器可以获取到希望的Controller
        // HttpController controller = new HttpController();
        AnnotationController controller = new AnnotationController();
        // SimpleController controller = new SimpleController();
        // 得到对应的适配器
        HandleAdapter adapter = getHandle(controller);
        // 通过适配器执行对应的Controller对应的方法
        adapter.handle(controller);
    }

    public HandleAdapter getHandle(Controller controller) {
        for (HandleAdapter adapter : this.handleAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
