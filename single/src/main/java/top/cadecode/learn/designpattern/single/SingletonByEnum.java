package top.cadecode.learn.designpattern.single;

/**
 * @author Cade Li
 * @date 2021/10/11
 * @description 利用枚举实现单例，线程安全，反序列化
 */
public enum SingletonByEnum {

    INSTANCE,
    ;

    public static SingletonByEnum getInstance() {
        return INSTANCE;
    }
}
