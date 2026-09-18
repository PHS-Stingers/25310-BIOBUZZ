package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp(name = "Intake_Encodeer_Test", group = "36 Hour Scrimmage")
public class Intake_Encodeer_Test extends LinearOpMode {
    DcMotorEx intake1;
    DcMotorEx intake2;

    @Override
    public void runOpMode() {
    intake1 = hardwareMap.get(DcMotorEx.class, "intake1");
    intake2 = hardwareMap.get(DcMotorEx.class, "intake2");
    waitForStart();
        intake1.setPower(1);
        intake2.setPower(1);
        sleep(2000);
        double in1 = intake1.getVelocity();
        double in2 = intake2.getVelocity();
        int count = 0;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(2000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        telemetry.addData("Intake1 RPM", intake1.getVelocity());
        telemetry.addData("Intake2 RPM", intake2.getVelocity());
        sleep(1000);
        in1 = in1 + intake1.getVelocity();
        in2 = in2 + intake2.getVelocity();
        count = count +1;
        intake1.setPower(0);
        intake2.setPower(0);
        telemetry.addData("Intake1 Average RPM", in1/count);
        telemetry.addData("Intake2 Average RPM", in2/count);
    }
}
