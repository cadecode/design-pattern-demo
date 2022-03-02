package top.cadecode.learn.jdp.factory.abstractfactory;

import top.cadecode.learn.jdp.factory.color.Red;
import top.cadecode.learn.jdp.factory.shape.Circle;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description 红色圆形工厂
 */
public class RedCircleFactory extends AbstractFactory {

    @Override
    public Circle getShape() {
        return new Circle();
    }

    @Override
    public Red getColor() {
        return new Red();
    }
}
