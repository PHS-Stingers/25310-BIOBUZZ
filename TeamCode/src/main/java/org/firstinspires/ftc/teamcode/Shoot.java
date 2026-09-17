package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Park", group = "Auto")
public class Shoot extends LinearOpMode {


    DcMotor flywheel;
    DcMotor intake1;
    DcMotor intake2;
    @Override
    public void runOpMode() {

        flywheel = hardwareMap.get(DcMotor.class, "flywheel");
        intake1 = hardwareMap.get(DcMotor.class, "intake1");
        intake2 = hardwareMap.get(DcMotor.class, "intake2");
        waitForStart();


        flywheel.setPower(1.0);
        sleep(5000);
        intake1.setPower(1.0);
        intake2.setPower(1.0);
        sleep(5000);
        intake1.setPower(0);
        intake2.setPower(0);
        flywheel.setPower(0);


    }

}
