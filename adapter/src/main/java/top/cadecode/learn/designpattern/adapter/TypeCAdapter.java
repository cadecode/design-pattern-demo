package top.cadecode.learn.designpattern.adapter;

/**
 * @author Cade Li
 * @date 2022/3/16
 * @description USB to TypeC 适配器
 */
public class TypeCAdapter implements TypeC {

    private final Usb usb;

    public TypeCAdapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void slot() {
        System.out.println("TypeC slotted");
        usb.slot();
    }
}
