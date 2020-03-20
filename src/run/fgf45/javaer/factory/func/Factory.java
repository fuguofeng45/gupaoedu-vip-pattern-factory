package run.fgf45.javaer.factory.func;

import run.fgf45.javaer.factory.Milk;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description: 工厂方法模式,细化工厂种类（每类产品都有固定的工厂来生产）
 * @date 2020/3/322:22
 */
public interface Factory {

    //工厂必然具有生产产品的技能,同一产品出口
    Milk getMilk();

}
