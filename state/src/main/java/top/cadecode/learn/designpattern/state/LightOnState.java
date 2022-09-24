package top.cadecode.learn.designpattern.state;

/**
 * @author Cade Li
 * @date 2022/3/13
 * @description 开灯状态
 */
public class LightOnState implements LightState {

    @Override
    public void on(LightContext context) {
        System.out.println("灯早就开了");
    }

    @Override
    public void off(LightContext context) {
        System.out.println("关灯");
        // 状态切换
        context.setState(context.getOffState());
    }
}
