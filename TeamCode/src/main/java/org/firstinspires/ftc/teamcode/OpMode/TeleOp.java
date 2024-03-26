package org.firstinspires.ftc.teamcode.OpMode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.opMode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends OpMode {
    private DcMotor fl, rl, fr, rr;
    private Servo launch;
    public void init() {
        fl  = hardwareMap.get(DcMotor.class, "FL");
        fr  = hardwareMap.get(DcMotor.class, "FR");
        rl  = hardwareMap.get(DcMotor.class, "RL");
        rr = hardwareMap.get(DcMotor.class, "RR");
        launch = hardwareMap.get(Servo.class, "launch");
    }
    public void loop() {
        setMotorPowers();
        if ((gamepad2.right_trigger > 0.3) && (gamepad2.left_trigger > 0.3)) {
            terminateOpModeNow();
        }
        if (gamepad1.a) {
            launch.setPosition(0.2);
        }
        if (gamepad2.a) {
            launch.setPosition(0);
        }
    }
    public void setMotorPowers() {
        fl.setPower((gamepad1.left_stick_y-gamepad1.left_stick_x)/1.5);
        rl.setPower((gamepad1.left_stick_y-gamepad1.left_stick_x)/1.5);
        fr.setPower((-gamepad1.left_stick_y-gamepad1.left_stick_x)/1.5);
        rr.setPower((-gamepad1.left_stick_y-gamepad1.left_stick_x)/1.5);
    }
}
