package com.hin.command;

/**
 * 命令发出者
 * @author Administrator
 *
 */
public class Invoker {
    // 持有命令对象     
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public Command getCommand() {
        return command;
    }

    // 执行命令    
    public void runCommand(){
        command.execute();
    }
    
    //撤销命令     
    public void unDoCommand(){
        command.undo();
    }
}
