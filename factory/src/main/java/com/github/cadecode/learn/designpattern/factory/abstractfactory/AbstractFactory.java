package com.github.cadecode.learn.designpattern.factory.abstractfactory;

import com.github.cadecode.learn.designpattern.factory.color.Color;
import com.github.cadecode.learn.designpattern.factory.shape.Shape;

/**
 * @author cade li
 * @date 2022/3/1
 * @description 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Shape getShape();

    public abstract Color getColor();
}
