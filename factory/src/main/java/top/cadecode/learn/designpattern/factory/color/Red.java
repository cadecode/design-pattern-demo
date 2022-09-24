package top.cadecode.learn.designpattern.factory.color;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description 红色
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("RED");
    }
}
