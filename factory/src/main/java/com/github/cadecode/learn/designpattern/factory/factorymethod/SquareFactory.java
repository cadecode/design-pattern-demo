package com.github.cadecode.learn.designpattern.factory.factorymethod;

import com.github.cadecode.learn.designpattern.factory.shape.Square;

/**
 * @author Cade Li
 * @date 2022/3/1
 * @description 方形工厂
 */
public class SquareFactory implements FactoryMethod {

    @Override
    public Square getShape() {
        return new Square();
    }
}
