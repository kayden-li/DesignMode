package 适配器模式.SpringMVC框架应用;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 适配器模式.SpringMVC框架应用 <br>
 *       <b>ClassName:</b> HandleAdapter <br>
 *       <b>Date:</b> 2020年2月23日 下午1:31:25
 */
public interface HandleAdapter {

    public boolean supports(Object handle);

    public void handle(Object handle);
}

// 适配器种类

class SimpleHandleAdapter implements HandleAdapter {
    @Override
    public void handle(Object handle) {
        ((SimpleController) handle).doSimpleHandle();
    }

    @Override
    public boolean supports(Object handle) {
        return (handle instanceof SimpleController);
    }
}

class HttpHandleAdapter implements HandleAdapter {
    @Override
    public void handle(Object handle) {
        ((HttpController) handle).doHttpHandle();
    }

    @Override
    public boolean supports(Object handle) {
        return (handle instanceof HttpController);
    }
}

class AnnotationHandleAdapter implements HandleAdapter {
    @Override
    public void handle(Object handle) {
        ((AnnotationController) handle).doAnnotationHandle();
    }

    @Override
    public boolean supports(Object handle) {
        return (handle instanceof AnnotationController);
    }
}