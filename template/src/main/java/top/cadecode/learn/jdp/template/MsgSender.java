package top.cadecode.learn.jdp.template;

/**
 * @author Cade Li
 * @date 2022/3/9
 * @description 抽象的消息发送器模板类
 */
public abstract class MsgSender {

    /**
     * 检查消息格式
     *
     * @param msg 消息
     */
    protected abstract void check(String msg);

    /**
     * 执行消息发送
     *
     * @param msg 消息
     */
    protected abstract void exec(String msg);

    /**
     * 发送失败处理
     *
     * @param msg 消息
     * @param t   异常
     */
    protected abstract void error(String msg, Throwable t);

    /**
     * 发送消息主方法
     *
     * @param msg 消息
     * @return 是否发送成功
     */
    public boolean send(String msg) {
        check(msg);
        try {
            exec(msg);
        } catch (Throwable t) {
            error(msg, t);
            return false;
        }
        return true;
    }
}
