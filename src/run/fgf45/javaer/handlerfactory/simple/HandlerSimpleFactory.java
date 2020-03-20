package run.fgf45.javaer.handlerfactory.simple;

import run.fgf45.javaer.handlerfactory.Handler;
import run.fgf45.javaer.handlerfactory.LogOutHandler;
import run.fgf45.javaer.handlerfactory.LoginHandler;
import run.fgf45.javaer.handlerfactory.RegHandler;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/323:14
 */
public class HandlerSimpleFactory {

    public Handler getHandler(String cmd){
        if("LogOut".equals(cmd)){
            return new LogOutHandler();
        }else if("Login".equals(cmd)){
            return new LoginHandler();
        }else if("Reg".equals(cmd)){
            return new RegHandler();
        }
        return null;
    }

}
