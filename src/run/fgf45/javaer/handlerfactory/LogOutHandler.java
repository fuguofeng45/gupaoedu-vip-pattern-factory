package run.fgf45.javaer.handlerfactory;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:15
 */
public class LogOutHandler implements Handler{
    @Override
    public void doHandler() {
        System.out.println("Logout");
    }
}
