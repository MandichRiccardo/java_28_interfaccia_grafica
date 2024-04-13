package com.example.java_28_interfaccia_grafica;

import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.fxml.FXML;

public class Modify extends Thread{
    @FXML
    private Circle ball;
    @FXML
    private Button play;

    public Modify(Circle ball, Button play) {
        this.ball = ball;
        this.play = play;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            while (ball.getRadius() > 0) {
                ball.setRadius(ball.getRadius() - 1);
                try {
                    sleep(5);
                } catch (InterruptedException ignore) {
                }
            }
            while (ball.getRadius() < 100) {
                ball.setRadius(ball.getRadius() + 1);
                try {
                    sleep(5);
                } catch (InterruptedException ignore) {
                }
            }
        }
        HelloController.setVisibleOfBall(play, true);
    }
}