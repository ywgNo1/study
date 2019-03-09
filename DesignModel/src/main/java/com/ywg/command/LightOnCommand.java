package com.ywg.command;

import com.ywg.command.entity.Light;

public class LightOnCommand implements Command {
	Light light;
	public LightOnCommand(Light light) {
		this.light=light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}
}
