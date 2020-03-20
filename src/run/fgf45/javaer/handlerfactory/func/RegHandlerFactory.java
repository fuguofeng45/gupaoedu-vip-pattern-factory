package run.fgf45.javaer.handlerfactory.func;

import run.fgf45.javaer.handlerfactory.Handler;
import run.fgf45.javaer.handlerfactory.RegHandler;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:21
 */
public class RegHandlerFactory implements HandlerFactory{
    @Override
    public Handler getHandler(String cmd) {
        return new RegHandler();
    }
}
