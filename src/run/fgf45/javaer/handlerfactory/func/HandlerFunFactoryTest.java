package run.fgf45.javaer.handlerfactory.func;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:21
 */
public class HandlerFunFactoryTest {

    public static void main(String[] args) {
        System.out.println(new LogOutHandlerFactory().getHandler(""));
    }

}
