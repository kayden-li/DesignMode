package 代理模式.Cglib代理;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 代理模式.Cglib代理 <br>
 *       <b>ClassName:</b> ProxyFactory <br>
 *       <b>Date:</b> 2020年3月2日 下午12:18:24
 */
public class ProxyFactory implements MethodInterceptor {

    // 维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回一个代理对象，是target对象的代理对象
    public Object getProxyInstance() {
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类对象，即代理对象
        return enhancer.create();
    }

    // 重写intercept方法，会调用目标对象的方法
    @Override
    public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
        System.out.println("Cglib代理模式");
        Object returnVal = method.invoke(target, args);
        return returnVal;
    }

}
