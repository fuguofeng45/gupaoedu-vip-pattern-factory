package run.fgf45.javaer.factory.func;

import run.fgf45.javaer.factory.Milk;
import run.fgf45.javaer.factory.YiLi;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/322:29
 */
public class YiLiFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new YiLi();
    }
}
