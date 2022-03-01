package top.cadecode.learn.jdp.single;

/**
 * @author Cade Li
 * @date 2021/10/11
 * @description 懒汉式，线程安全，利用内部类
 */
public class SafeLazyManByInner {

    private SafeLazyManByInner() {

    }

    private static final class ManHolder {
        static final SafeLazyManByInner man = new SafeLazyManByInner();
    }

    public static SafeLazyManByInner instance() {
        return ManHolder.man;
    }
}
