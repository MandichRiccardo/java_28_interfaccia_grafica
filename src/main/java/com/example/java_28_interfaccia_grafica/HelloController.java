package com.example.java_28_interfaccia_grafica;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class HelloController {
    public Circle ball;
    @FXML
    private Button play;
    @FXML
    protected void onHelloButtonClick() {
        start();
    }

    private void start() {
        setVisibleOfBall(play, false);
        Modify thread = new Modify(ball, play);
        thread.start();
    }

    public static void setVisibleOfBall(Button play, boolean condition){
        play.setVisible(condition);
    }
}