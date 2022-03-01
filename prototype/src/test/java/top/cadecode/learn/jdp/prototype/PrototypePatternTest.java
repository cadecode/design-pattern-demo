package top.cadecode.learn.jdp.prototype;

import org.junit.Test;

/**
 * @author Cade Li
 * @date 2022/3/1
 * @description 测试
 */
public class PrototypePatternTest {

    @Test
    public void test() {
        System.out.println(ShapeCache.getShape("S") == ShapeCache.getShape("S"));
    }
}
