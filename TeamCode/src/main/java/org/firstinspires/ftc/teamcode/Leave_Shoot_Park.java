package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "Leave_Shoot_Park", group = "Auto")
public class Leave_Shoot_Park extends LinearOpMode {
    Shoot Shoot = new Shoot();
    Leave Leave = new Leave();
    Park Park = new Park();

    @Override
    public void runOpMode() {
        Leave.runOpMode();
        Shoot.runOpMode();
        Park.runOpMode();
    }
}