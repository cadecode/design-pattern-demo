package top.cadecode.learn.designpattern.factory.color;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description 蓝色
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("BLUE");
    }
}
