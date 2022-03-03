package top.cadecode.learn.jdp.strategy;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description Context
 */
public class PayContext {

    private final PayStrategy pay;

    public PayContext(PayStrategy pay) {
        this.pay = pay;
    }

    public void doPay() {
        pay.pay();
    }
}
