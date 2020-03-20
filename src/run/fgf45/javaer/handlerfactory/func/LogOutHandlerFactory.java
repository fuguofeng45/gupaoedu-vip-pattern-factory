package run.fgf45.javaer.handlerfactory.func;

import run.fgf45.javaer.handlerfactory.Handler;
import run.fgf45.javaer.handlerfactory.LogOutHandler;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:20
 */
public class LogOutHandlerFactory implements HandlerFactory{
    @Override
    public Handler getHandler(String cmd) {
        return new LogOutHandler();
    }
}
