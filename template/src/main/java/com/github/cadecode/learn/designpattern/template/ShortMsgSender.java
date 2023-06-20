package com.github.cadecode.learn.designpattern.template;

/**
 * @author Cade Li
 * @date 2022/3/9
 * @description 短信发送消息
 */
public class ShortMsgSender extends MsgSender {
    @Override
    protected void check(String msg) {
        System.out.println("短信发送前检查消息格式");
    }

    @Override
    protected void exec(String msg) {
        System.out.println("短信发送消息中");
        throw new RuntimeException();
    }

    @Override
    protected void error(String msg, Throwable t) {
        System.out.println("短信发送消息失败：" + msg);
    }
}
