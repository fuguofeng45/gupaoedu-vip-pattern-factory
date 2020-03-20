package run.fgf45.javaer.factory.func;

import run.fgf45.javaer.factory.MengNiu;
import run.fgf45.javaer.factory.Milk;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/322:29
 */
public class MengNiuFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new MengNiu();
    }
}
