package top.cadecode.learn.jdp.single;

import org.junit.Test;

/**
 * @author Cade Li
 * @date 2022/3/1
 * @description 测试
 */
public class SinglePatternTest {

    @Test
    public void test() {
        System.out.println(HungryMan.instance() == HungryMan.instance());
        System.out.println(LazyMan.instance() == LazyMan.instance());
    }
}
