package com.github.cadecode.learn.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Cade Li
 * @date 2022/3/17
 * @description 中介（动态代理实现）
 */
public class DynamicProxyClient implements InvocationHandler {

    private final RentOuter rentOuter;

    public DynamicProxyClient(RentOuter rentOuter) {
        this.rentOuter = rentOuter;
    }

    public RentOuter getInstance() {
        Class<?> clazz = this.rentOuter.getClass();
        return (RentOuter) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * 代理方法
     *
     * @param proxy  代理对象
     * @param method 被代理对象的方法
     * @param args   方法参数
     * @return 方法返回值
     * @throws Throwable 抛出异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        signContract();
        takeMoney();
        // 传入维护的 rentOuter（注意不是 proxy）
        return method.invoke(this.rentOuter, args);
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
