package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static int p_xbox1 = 0;

	// DriveTrain Motors
	public static int p_leftDrive1 = 0;
	// public static int p_leftDrive2 = 1;
	public static int p_rightDrive1 = 1;
	// public static int p_rightDrive2 = 3;
	public static int p_solenoidIn = 3;
	public static int p_solenoidOut = 4;
	public static int p_compressor = 0;
	public static int p_limitleft = 0;
	public static int p_limitright = 1;
	public static int p_photoeye = 2;
	public static int p_gyroscope = 0;
	public static int p_liftmotor = 0;
	public static int p_wristmotor = 0;
	public static int p_encoderchannel1 = 0;
	public static int p_encoderchannel2 = 0;
	public static int p_secondencoderchannel1 = 2;
	public static int p_secondencoderchannel2 = 2;

}