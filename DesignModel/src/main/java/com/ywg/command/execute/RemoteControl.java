package com.ywg.command.execute;

import com.ywg.command.Command;
import com.ywg.command.NoCommand;

public class RemoteControl {
	Command[] onCommand;
	Command[] offCommand;
	Command lastCommand;
	
	public RemoteControl() {
		onCommand=new Command[7];
		offCommand=new Command[7];
		for (int i = 0; i < offCommand.length; i++) {
			onCommand[i]=new NoCommand();
			offCommand[i]=new NoCommand();
		}
		lastCommand=new NoCommand();
	}
	
	public void setCommand(int index,Command onCommand,Command offCommand) {
		this.onCommand[index]=onCommand;
		this.offCommand[index]=onCommand;
	}
	
	public void onButtonPressed(int index) {
		this.onCommand[index].execute();
		lastCommand=onCommand[index];
	}
	
	public void offButtonPressed(int index) {
		this.offCommand[index].execute();
		lastCommand=offCommand[index];
	}
	
	public void undoButtonPressed(int index) {
		lastCommand.execute();
	}
	
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append("\n-----RemoteControl-----\n");
		for (int i = 0; i < onCommand.length; i++) {
			builder.append("[slot "+i+"]	"+onCommand[i].getClass().getName()+"	"+
					offCommand[i].getClass().getName()+"/n");
		}
		return builder.toString();
	}
}
