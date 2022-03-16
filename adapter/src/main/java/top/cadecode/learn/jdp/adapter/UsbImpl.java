package top.cadecode.learn.jdp.adapter;

/**
 * @author Cade Li
 * @date 2022/3/16
 * @description USB 实现类
 */
public class UsbImpl implements Usb {
    @Override
    public void slot() {
        System.out.println("USB slotted");
    }
}
