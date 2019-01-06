package org.usfirst.frc.team2083.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class RobotMap
{
	/*
	 * Motor IDs
	 */
	
	// Drive System Motors
	public static TalonSRX frontLeftMotor = new TalonSRX(3); // 3

	/*
	 * Joystick IDs
	 */

	// XBox Controller ID
	static Joystick xBoxController = new Joystick(0); // 0

	// XBox Joystick IDs



	// XBox ABXY Button IDs
	public static Button	ButtonA	= new JoystickButton(xBoxController, 1);	// 1
	public static Button	ButtonB	= new JoystickButton(xBoxController, 2);	// 2
	public static Button	ButtonX	= new JoystickButton(xBoxController, 3);	// 3
	public static Button	ButtonY	= new JoystickButton(xBoxController, 4);	// 4

	// XBox Bumper IDs
	public static Button	LBumper	= new JoystickButton(xBoxController, 5);	// 5
	public static Button	RBumper	= new JoystickButton(xBoxController, 6);	// 6

	// XBox Miscellaneous IDs
	public static Button	Back	= new JoystickButton(xBoxController, 7);	// 7
	public static Button	Start	= new JoystickButton(xBoxController, 8);	// 8
	public static double	POV		= xBoxController.getPOV();					// "N/A"

	/*
	 * Other IDs
	 */

	// Limit Switch IDs
	
	// Game Data
	public static String gameData;
}
