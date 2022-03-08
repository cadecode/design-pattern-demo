package top.cadecode.learn.jdp.observer;

import org.junit.Test;

/**
 * @author Cade Li
 * @date 2022/3/8
 * @description 观察者模式测试类
 */
public class ObserverPatternTest {

    @Test
    public void test() {
        Alarm alarm = new Alarm("温度报警器");
        Operator operator0 = new Operator("操作员0");
        Operator operator1 = new Operator("操作员1");
        alarm.add(operator0);
        alarm.add(operator1);

        alarm.notice("温度 37.5，超标了");

        alarm.remove(operator1);

        alarm.notice("温度 36.5，太低了");
    }
}
