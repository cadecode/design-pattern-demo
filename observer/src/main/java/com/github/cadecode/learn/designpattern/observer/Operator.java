package com.github.cadecode.learn.designpattern.observer;

/**
 * @author Cade Li
 * @date 2022/3/8
 * @description 操作员
 */
public class Operator implements Observer {

    private final String name;

    public Operator(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到了通知：" + message);
    }
}
