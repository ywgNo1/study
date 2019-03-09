package com.ywg.command;

import com.ywg.command.entity.Light;

public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand(Light light) {
		this.light=light;
	}
	public void execute() {
		light.off();
	}
	public void undo() {
		light.on();
	}
}
