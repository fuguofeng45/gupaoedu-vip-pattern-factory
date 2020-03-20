package run.fgf45.javaer.factory.simple;

import run.fgf45.javaer.factory.TeLunSu;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/322:02
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //如果改对象实例化比较复杂,工厂模式要封装实例化过程
        //System.out.println(new TeLunSu().getName());

        //简单工厂模式,用户本身不再关心生产过程,只关心生产结果;
        //所有的产品对象都在同一个工厂中产生
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMilk("特仑苏"));
    }

}
