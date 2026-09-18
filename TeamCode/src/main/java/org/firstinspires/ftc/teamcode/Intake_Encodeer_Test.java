package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp(name = "Intake_Encodeer_Test", group = "36 Hour Scrimmage")
public class Intake_Encodeer_Test extends LinearOpMode {
    DcMotor intake1;
    DcMotor intake2;

    @Override
    public void runOpMode() {
    intake1 = hardwareMap.get(DcMotor.class, "intake1");
    intake2 = hardwareMap.get(DcMotor.class, "intake2");
    waitForStart();
        intake1.setPower(1);
        intake2.setPower(1);
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());
        sleep(2000);
        telemetry.addData("Intake1 RPM", intake1.getPower());
        telemetry.addData("Intake1 RPM", intake2.getPower());


    }
}
