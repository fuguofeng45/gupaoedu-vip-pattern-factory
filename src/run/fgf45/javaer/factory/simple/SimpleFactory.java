package run.fgf45.javaer.factory.simple;

import run.fgf45.javaer.factory.MengNiu;
import run.fgf45.javaer.factory.Milk;
import run.fgf45.javaer.factory.TeLunSu;
import run.fgf45.javaer.factory.YiLi;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/322:06
 */
public class SimpleFactory {

    public Milk getMilk(String name){
        if("特仑苏".equals(name)){
            return new TeLunSu();
        }else if("伊利".equals(name)){
            return new MengNiu();
        }else if("蒙牛".equals(name)){
            return new YiLi();
        }
        return null;
    }
}
