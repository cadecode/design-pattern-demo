package top.cadecode.learn.jdp.state;

import org.junit.Test;

public class StatePatternTest {

    @Test
    public void test() {
        // 初始状态为关灯
        LightContext lightContext = new LightContext(new LightOffState());

        lightContext.off();
        lightContext.on();
        lightContext.on();
        lightContext.off();
        lightContext.off();

    }

}
