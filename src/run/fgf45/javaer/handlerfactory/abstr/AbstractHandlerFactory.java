package run.fgf45.javaer.handlerfactory.abstr;

import run.fgf45.javaer.handlerfactory.Handler;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:23
 */
public abstract class AbstractHandlerFactory {

    public abstract Handler getLogOutHandler();

    public abstract Handler getLoginHandler();

    public abstract Handler getRegHandler();

}
