package com.github.cadecode.learn.designpattern.factory.factorymethod;

import com.github.cadecode.learn.designpattern.factory.shape.Circle;

/**
 * @author Cade Li
 * @date 2022/3/1
 * @description 圆形工厂
 */
public class CircleFactory implements FactoryMethod {

    @Override
    public Circle getShape() {
        return new Circle();
    }
}
