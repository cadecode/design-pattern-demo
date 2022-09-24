package top.cadecode.learn.designpattern.strategy;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description 微信支付
 */
public class WeChatPay implements PayStrategy {

    @Override
    public void pay() {
        System.out.println("WECHATPAY");
    }
}
