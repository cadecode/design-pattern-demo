package top.cadecode.learn.jdp.factory.abstractfactory;

import top.cadecode.learn.jdp.factory.color.Color;
import top.cadecode.learn.jdp.factory.shape.Shape;

/**
 * @author cade li
 * @date 2022/3/1
 * @description 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Shape getShape();

    public abstract Color getColor();
}
