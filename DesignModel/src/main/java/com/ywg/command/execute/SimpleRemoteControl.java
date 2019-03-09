package com.ywg.command.execute;

import com.ywg.command.Command;

public class SimpleRemoteControl {
	Command command;
	
	void setCommand(Command command) {
		this.command=command;
	}
	
	public void buttonPressed() {
		command.execute();
	}
}
