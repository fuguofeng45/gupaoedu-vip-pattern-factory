package run.fgf45.javaer.factory.abstr;

import run.fgf45.javaer.factory.Milk;
import run.fgf45.javaer.factory.func.MengNiuFactory;
import run.fgf45.javaer.factory.func.TeLunSuFactory;
import run.fgf45.javaer.factory.func.YiLiFactory;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/322:53
 */
public class MilkFactory extends AbstractFactory{
    @Override
    public Milk getMengNiuMilk() {
        return new MengNiuFactory().getMilk();
    }

    @Override
    public Milk getYiLiMilk() {
        return new YiLiFactory().getMilk();
    }

    @Override
    public Milk getTeLunSuMilk() {
        return new TeLunSuFactory().getMilk();
    }
}
