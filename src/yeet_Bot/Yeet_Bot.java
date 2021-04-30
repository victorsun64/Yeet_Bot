package yeet_Bot;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Yeet_Bot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegulatedMotor rechts = new EV3LargeRegulatedMotor(MotorPort.A);
		RegulatedMotor links = new EV3LargeRegulatedMotor(MotorPort.B);
		RegulatedMotor rgabel = new EV3LargeRegulatedMotor(MotorPort.C);
		RegulatedMotor lgabel = new EV3LargeRegulatedMotor(MotorPort.D);
		while (Button.ENTER = true != null) {
			lgabel.backward();
			rgabel.backward();
		}
		while (Button.UP = true != null) {
			rechts.forward();
			links.forward();
		}
		while (Button.DOWN = true != null) {
			rechts.backward();
			links.backward();
		}
	}

}
