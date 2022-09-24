package top.cadecode.learn.designpattern.factory.simplefactory;

import top.cadecode.learn.designpattern.factory.shape.Circle;
import top.cadecode.learn.designpattern.factory.shape.Shape;
import top.cadecode.learn.designpattern.factory.shape.Square;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author Cade Li
 * @date 2022/3/1
 * @description 简单工厂
 */
public class SimpleFactory {

    private static final Map<String, Supplier<Shape>> cacheMap = new HashMap<>();

    static {
        cacheMap.put("C", Circle::new);
        cacheMap.put("S", Square::new);
    }

    public static Shape getShape(String type) {
        return cacheMap.get(type).get();
    }
}
