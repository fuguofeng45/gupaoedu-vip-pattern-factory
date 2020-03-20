package run.fgf45.javaer.handlerfactory.func;

import run.fgf45.javaer.handlerfactory.Handler;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:19
 */
public interface HandlerFactory {

    public Handler getHandler(String cmd);

}
