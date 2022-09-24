package top.cadecode.learn.designpattern.single;

/**
 * @author Cade Li
 * @date 2021/10/11
 * @description 懒汉式
 */
public class LazyMan {
    private static LazyMan man;

    private LazyMan() {

    }

    public static LazyMan instance() {
        if (man == null) {
            man = new LazyMan();
        }
        return man;
    }
}
