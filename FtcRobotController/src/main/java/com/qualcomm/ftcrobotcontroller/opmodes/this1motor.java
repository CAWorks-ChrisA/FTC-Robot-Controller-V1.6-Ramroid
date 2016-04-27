package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by TCHS Robotics on 4/27/2016.
 */
public class this1motor extends OpMode{
DcMotor motor;
    @Override
    public void init() {
        motor = hardwareMap.dcMotor.get("motor");
    }

    @Override
    public void loop() {
        motor.setPower(gamepad1.left_stick_y);


    }
}
