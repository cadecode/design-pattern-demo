package top.cadecode.learn.designpattern.template;

/**
 * @author Cade Li
 * @date 2022/3/9
 * @description 邮件发送消息
 */
public class EmailMsgSender extends MsgSender {
    @Override
    protected void check(String msg) {
        System.out.println("邮件发送前检查消息格式");
    }

    @Override
    protected void exec(String msg) {
        System.out.println("邮件发送消息中");
        System.out.println("邮件发送消息成功：" + msg);
    }

    @Override
    protected void error(String msg, Throwable t) {
        System.out.println("邮件发送消息失败：" + msg);
    }
}
