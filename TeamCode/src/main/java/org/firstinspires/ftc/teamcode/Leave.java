package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

    @Autonomous(name = "Leave", group = "Auto")
    public class Leave extends LinearOpMode {

        DcMotor frontRight;
        DcMotor frontLeft;
        DcMotor backRight;
        DcMotor backLeft;
        @Override
        public void runOpMode() {
            frontRight = hardwareMap.get(DcMotor.class, "FR");
            backRight = hardwareMap.get(DcMotor.class, "BR");
            frontLeft = hardwareMap.get(DcMotor.class, "FL");
            backLeft = hardwareMap.get(DcMotor.class, "BL");
            waitForStart();
            sleep(2000);
            frontRight.setPower(1.0);
            frontLeft.setPower(1.0);
            backLeft.setPower(1.0);
            backRight.setPower(1.0);
            sleep(30000);

        }

}
