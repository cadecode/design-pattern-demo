package top.cadecode.learn.jdp.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Cade Li
 * @date 2022/3/17
 * @description 中介（Cglib 代理实现）
 */
public class CglibProxyClient implements MethodInterceptor {

    public RentOuter getInstance(Class<? extends RentOuter> clazz) {
        // 提供方法增强功能的类
        Enhancer enhancer = new Enhancer();
        // 设置动态生成代理的父类
        enhancer.setSuperclass(clazz);
        // 设置 MethodInterceptor
        enhancer.setCallback(this);
        // 创建代理对象
        return (RentOuter) enhancer.create();
    }

    /**
     * 代理方法
     *
     * @param o           代理对象
     * @param method      被代理对象的方法
     * @param args        方法参数
     * @param methodProxy 方法的代理（用于执行父类方法）
     * @return 方法返回值
     * @throws Throwable 抛出的异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        seeHouse();
        signContract();
        takeMoney();
        // 调用生成代理的父类方法
        return methodProxy.invokeSuper(o, args);
    }

    private void seeHouse() {
        System.out.println("中介带看房");
    }

    private void signContract() {
        System.out.println("中介签合同");
    }

    private void takeMoney() {
        System.out.println("中介收费用");
    }
}
