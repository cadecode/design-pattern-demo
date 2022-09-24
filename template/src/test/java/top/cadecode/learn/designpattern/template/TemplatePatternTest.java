package top.cadecode.learn.designpattern.template;

import org.junit.Test;

/**
 * @author Cade Li
 * @date 2022/3/9
 * @description 模板方法模式测
 */
public class TemplatePatternTest {

    @Test
    public void test() {
        MsgSender emailMsgSender = new EmailMsgSender();
        emailMsgSender.send("hello email msg");
        System.out.println("---------------------");
        MsgSender shortMsgSender = new ShortMsgSender();
        shortMsgSender.send("hello short msg");
    }
}
