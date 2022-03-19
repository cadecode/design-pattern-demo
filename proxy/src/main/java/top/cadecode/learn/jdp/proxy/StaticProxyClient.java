package top.cadecode.learn.jdp.proxy;

/**
 * @author Cade Li
 * @date 2022/3/17
 * @description 中介（静态代理实现）
 */
public class StaticProxyClient implements RentOuter {
    private final RentOuter rentOuter;

    public StaticProxyClient(RentOuter rentOuter) {
        this.rentOuter = rentOuter;
    }

    @Override
    public void rentOut() {
        seeHouse();
        signContract();
        takeMoney();
        rentOuter.rentOut();
    }

    private void seeHouse() {
        System.out.println("中介带看房");
    }

    private void signContract() {
        System.out.println("中介签合同");
    }

    private void takeMoney() {
        System.out.println("中介收费用");
    }
}
