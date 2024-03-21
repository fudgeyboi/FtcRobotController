package org.firstinspires.ftc.teamcode.OpMode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.opMode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
public class TeleOp extends OpMode {
    private DcMotor fl, rl, fr, rr;
    public void init() {
        fl  = hardwareMap.get(DcMotor.class, "FL");
        fr  = hardwareMap.get(DcMotor.class, "FR");
        rl  = hardwareMap.get(DcMotor.class, "RL");
        rr = hardwareMap.get(DcMotor.class, "RR");

    }
    public void loop() {

    }
}
