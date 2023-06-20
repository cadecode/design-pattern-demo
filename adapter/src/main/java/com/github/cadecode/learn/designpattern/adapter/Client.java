package com.github.cadecode.learn.designpattern.adapter;

/**
 * @author Cade Li
 * @date 2022/3/16
 * @description TypeC 使用者
 */
public class Client {

    public void useTypeC(TypeC typeC) {
        typeC.slot();
    }
}
