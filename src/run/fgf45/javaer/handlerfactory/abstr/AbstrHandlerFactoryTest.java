package run.fgf45.javaer.handlerfactory.abstr;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:26
 */
public class AbstrHandlerFactoryTest {

    public static void main(String[] args) {
        System.out.println(new HandlerFactory().getLoginHandler());
    }

}
