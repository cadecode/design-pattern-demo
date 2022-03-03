package top.cadecode.learn.jdp.strategy;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description 阿里支付
 */
public class AliPay implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("ALIPAY");
    }
}
