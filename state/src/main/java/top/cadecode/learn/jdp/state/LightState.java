package top.cadecode.learn.jdp.state;

/**
 * @author Cade Li
 * @date 2022/3/13
 * @description 灯状态接口
 */
public interface LightState {

    void on(LightContext context);

    void off(LightContext context);
}
