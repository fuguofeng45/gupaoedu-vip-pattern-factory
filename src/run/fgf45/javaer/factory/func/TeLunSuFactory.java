package run.fgf45.javaer.factory.func;

import run.fgf45.javaer.factory.Milk;
import run.fgf45.javaer.factory.TeLunSu;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/322:27
 */
public class TeLunSuFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new TeLunSu();
    }
}
