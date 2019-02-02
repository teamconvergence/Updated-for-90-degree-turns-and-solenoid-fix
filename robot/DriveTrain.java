/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem implements PIDOutput{
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // Motors for DriveTrain
  public Spark leftDrive1 = new Spark(RobotMap.p_leftDrive1);
//   public Spark leftDrive2 = new Spark(RobotMap.p_leftDrive2);
  public Spark rightDrive1 = new Spark(RobotMap.p_rightDrive1);
//   public Spark rightDrive2 = new Spark(RobotMap.p_rightDrive2);

  // Left and Right sides for DriveTrain
  public SpeedControllerGroup left = new SpeedControllerGroup(leftDrive1);
  public SpeedControllerGroup right = new SpeedControllerGroup(rightDrive1);

  // The DriveTrain drive
  public DifferentialDrive drive1 = new DifferentialDrive(left, right);

  public double turnRate = 0;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void arcadeDrive(double i, double j) {
    drive1.arcadeDrive(i, j);
  }
  public void tankDrive(double left, double right){
    drive1.tankDrive(left,right);
  }
  @Override
  public void pidWrite(double output) {
    turnRate = output;
    SmartDashboard.putNumber("Gyro PidWrite", output);
  }
  public void turnAngle(){
    drive1.arcadeDrive(0, turnRate);
  }

}