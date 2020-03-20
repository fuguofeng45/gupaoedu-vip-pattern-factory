package run.fgf45.javaer.factory.func;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description: 特仑苏牛奶工厂
 * @date 2020/3/322:27
 */
public class FuncFactoryTest {

    public static void main(String[] args) {
        //要生产产品,就要生成对应的工厂

        Factory factory = new MengNiuFactory();
        System.out.println(factory.getMilk());
    }

}
