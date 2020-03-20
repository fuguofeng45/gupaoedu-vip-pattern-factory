package run.fgf45.javaer.handlerfactory.abstr;

import run.fgf45.javaer.handlerfactory.Handler;
import run.fgf45.javaer.handlerfactory.LogOutHandler;
import run.fgf45.javaer.handlerfactory.RegHandler;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:25
 */
public class HandlerFactory extends AbstractHandlerFactory{


    @Override
    public Handler getLogOutHandler() {
        return new LogOutHandler();
    }

    @Override
    public Handler getLoginHandler() {
        return new LogOutHandler();
    }

    @Override
    public Handler getRegHandler() {
        return new RegHandler();
    }
}
