package top.cadecode.learn.jdp.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Cade Li
 * @date 2022/3/8
 * @description 报警中心
 */
public class Alarm implements Subject {

    private final String name;
    private final Set<Observer> observers = new HashSet<>();

    public Alarm(String name) {
        this.name = name;
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice(String message) {
        System.out.println(name + "发布了消息：" + message);
        observers.forEach(observer -> observer.update(message));
    }
}
