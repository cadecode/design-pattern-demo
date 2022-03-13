package top.cadecode.learn.jdp.state;

/**
 * @author Cade Li
 * @date 2022/3/13
 * @description 关灯状态
 */
public class LightOffState implements LightState {
    @Override
    public void on(LightContext context) {
        System.out.println("开灯");
        // 状态切换
        context.setState(context.getOnState());
    }

    @Override
    public void off(LightContext context) {
        System.out.println("灯早就关了");
    }
}
