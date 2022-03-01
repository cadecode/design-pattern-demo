package top.cadecode.learn.jdp.single;

/**
 * @author Cade Li
 * @date 2021/10/11
 * @description 饿汉式
 */
public class HungryMan {
    private static final HungryMan man = new HungryMan();

    private HungryMan() {

    }

    public static HungryMan instance() {
        return man;
    }
}
