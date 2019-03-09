package com.ywg.command;

/**
 * 命令接口
 * @author yangwg
 * @time 2019年1月21日  下午7:27:16
 */
public interface Command {
	void execute();
	void undo();
}
