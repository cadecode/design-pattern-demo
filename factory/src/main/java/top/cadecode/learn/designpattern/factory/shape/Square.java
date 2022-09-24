package top.cadecode.learn.designpattern.factory.shape;

/**
 * @author Cade Li
 * @date 2022/3/1
 * @description 方形
 */
public class Square implements Shape{
    @Override
    public void print() {
        System.out.println("SQUARE");
    }
}
