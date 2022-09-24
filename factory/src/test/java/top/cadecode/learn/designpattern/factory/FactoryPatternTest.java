package top.cadecode.learn.designpattern.factory;

import org.junit.Test;
import top.cadecode.learn.designpattern.factory.abstractfactory.RedCircleFactory;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description ces
 */
public class FactoryPatternTest {

    @Test
    public void test() {
        RedCircleFactory redCircleFactory = new RedCircleFactory();
        redCircleFactory.getColor().fill();
        redCircleFactory.getShape().print();
    }

}
