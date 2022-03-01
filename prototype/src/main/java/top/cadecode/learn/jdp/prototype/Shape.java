package top.cadecode.learn.jdp.prototype;

/**
 * @author Cade Li
 * @date 2022/3/1
 * @description 图形抽象类（原型角色）
 */
public abstract class Shape implements Cloneable {
    public abstract void print();

    @Override
    protected Object clone() {
        // 浅克隆
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
