package com.github.cadecode.learn.designpattern.state;

import lombok.Data;

/**
 * @author Cade Li
 * @date 2022/3/13
 * @description 灯上下文（控制器）
 */
@Data
public class LightContext {

    private final LightOnState onState = new LightOnState();
    private final LightOffState offState = new LightOffState();

    private LightState state;

    public LightContext(LightState state) {
        this.state = state;
    }

    public void on() {
        state.on(this);
    }

    public void off() {
        state.off(this);
    }
}
