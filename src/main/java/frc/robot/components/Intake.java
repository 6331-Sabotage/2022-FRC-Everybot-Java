package frc.robot.components;

import edu.wpi.first.wpilibj.Joystick;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class Intake {
    
    Joystick driverInput;
    double speedMultiplier;

    VictorSPX m_intake = new VictorSPX(4);

    public Intake(Joystick driverInput, double speedMultiplier) {
        this.driverInput = driverInput;
        this.speedMultiplier = speedMultiplier;
    }

    public void run() {
        if (driverInput.getRawButton(1)) {
			m_intake.set(VictorSPXControlMode.PercentOutput, speedMultiplier);
		} else if (driverInput.getRawButton(2)) {
			m_intake.set(VictorSPXControlMode.PercentOutput, -speedMultiplier);
		} else {
			m_intake.set(VictorSPXControlMode.PercentOutput, 0);
		}
    }

}
