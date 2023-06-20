package com.github.cadecode.learn.designpattern.observer;

/**
 * @author Cade Li
 * @date 2022/3/8
 * @description 主题接口（被观察者）
 */
public interface Subject {

    void add(Observer observer);

    void remove(Observer observer);

    void notice(String message);
}
