package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by TCHS Robotics on 4/27/2016.
 */
public class teleop extends OpMode {
    DcMotor motor1;
    DcMotor motor2;
    Servo servo1;
    @Override
    public void init() {
        motor1 = hardwareMap.dcMotor.get("motorleft");
        motor2 = hardwareMap.dcMotor.get("motorright");
        servo1 = hardwareMap.servo.get("servo");
        motor2.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        //motor1.setPower(gamepad1.left_stick_y);
        //motor2.setPower(gamepad1.right_stick_y);

        if(gamepad1.left_stick_x >0.1){
            motor1.setPower(gamepad1.left_stick_x);
            motor2.setPower(-gamepad1.left_stick_x);
        }
        else if (gamepad1.left_stick_x <-0.1){
            motor1.setPower(-gamepad1.left_stick_x);
            motor2.setPower(gamepad1.left_stick_x);
        }
        else{
            motor1.setPower(gamepad1.left_stick_y);
            motor2.setPower(gamepad1.left_stick_y);
        }

        if (gamepad1.a){
            servo1.setPosition(1);
        }
        else if (gamepad1.b){
            servo1.setPosition(0);
        }

    }
}
