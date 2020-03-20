package run.fgf45.javaer.factory.abstr;

import run.fgf45.javaer.factory.Milk;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description: 抽象工厂模式是用户的主入口
 *               易于扩展
 * @date 2020/3/322:34
 */
public abstract class AbstractFactory {

    public abstract Milk getMengNiuMilk();
    public abstract Milk getYiLiMilk();
    public abstract Milk getTeLunSuMilk();
}
