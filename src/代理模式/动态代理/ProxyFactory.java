package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 代理模式.动态代理 <br>
 *       <b>ClassName:</b> ProxyFactory <br>
 *       <b>Date:</b> 2020年3月2日 上午11:30:35
 */
public class ProxyFactory {

    // 维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        // 1. loader：指定当前目标对象使用的类加载器，获取加载器的方法固定
        // 2. interfaces：目标对象实现的接口类型，使用泛型方式确认类型
        // 3. h：事件处理，执行目标对象的方法时会触发事件处理器方法，会把当前执行的目标对象方法作为一个参数传入
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理");
                        // 通过反射机制调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        return returnVal;
                    }
                });
    }
}
