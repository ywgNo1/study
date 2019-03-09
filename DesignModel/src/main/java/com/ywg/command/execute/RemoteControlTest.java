package com.ywg.command.execute;

import com.ywg.command.Command;
import com.ywg.command.LightOnCommand;
import com.ywg.command.entity.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();
		Light light=new Light();
		Command command=new LightOnCommand(light);
		simpleRemoteControl.setCommand(command);
		simpleRemoteControl.buttonPressed();
	}
}
