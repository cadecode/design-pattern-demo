package top.cadecode.learn.jdp.adapter;

import org.junit.Test;

/**
 * @author Cade Li
 * @date 2022/3/16
 * @description 测试
 */
public class AdapterPatternTest {

    @Test
    public void test() {
        Usb usb = new UsbImpl();
        TypeC typeC = new TypeCAdapter(usb);

        Client client = new Client();
        client.useTypeC(typeC);
    }
}
