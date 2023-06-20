package com.github.cadecode.learn.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cade Li
 * @date 2022/3/1
 * @description 图形缓存（使用者角色）
 */
public class ShapeCache {
    private static final Map<String, Shape> cacheMap = new HashMap<>();

    static {
        cacheMap.put("C", new Circle());
        cacheMap.put("S", new Square());
    }

    public static Shape getShape(String type) {
        return (Shape) cacheMap.get(type).clone();
    }
}

