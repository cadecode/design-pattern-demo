package com.github.cadecode.learn.designpattern.factory.abstractfactory;

import com.github.cadecode.learn.designpattern.factory.color.Red;
import com.github.cadecode.learn.designpattern.factory.shape.Circle;

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
