package run.fgf45.javaer.handlerfactory.simple;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:15
 */
public class HandlerSimpleFactoryTest {

    public static void main(String[] args) {
        HandlerSimpleFactory factory = new HandlerSimpleFactory();
        factory.getHandler("LogOut").doHandler();
    }

}
