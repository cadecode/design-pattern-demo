package top.cadecode.learn.jdp.proxy;

import org.junit.Test;

/**
 * @author Cade Li
 * @date 2022/3/17
 * @description 测试
 */
public class ProxyPatternTest {

    @Test
    public void testStatic() {
        StaticProxyClient client = new StaticProxyClient(new Lessor());
        client.rentOut();
    }

    @Test
    public void testDynamic() {
        DynamicProxyClient client = new DynamicProxyClient(new Lessor());
        RentOuter instance = client.getInstance();
        instance.rentOut();
    }

    @Test
    public void testCglib() {
        CglibProxyClient client = new CglibProxyClient();
        RentOuter instance = client.getInstance(Lessor.class);
        instance.rentOut();
    }
}
