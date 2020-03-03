package 适配器模式.SpringMVC框架应用;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 适配器模式.SpringMVC框架应用 <br>
 *       <b>ClassName:</b> Controller <br>
 *       <b>Date:</b> 2020年2月23日 下午1:30:44
 */
public interface Controller {

}

class HttpController implements Controller {
    public void doHttpHandle() {
        System.out.println("http···");
    }
}

class SimpleController implements Controller {
    public void doSimpleHandle() {
        System.out.println("simple···");
    }
}

class AnnotationController implements Controller {
    public void doAnnotationHandle() {
        System.out.println("annotation···");
    }
}
