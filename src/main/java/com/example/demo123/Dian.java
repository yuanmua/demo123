package com.example.demo123;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Random;

class Dian {
    double x=0;
    double y=0;
    Circle circle=new Circle();
    Dian(int r,int yans){
        double du =qusuiji();
        x= r*Math.cos(du);
        y= r*Math.sin(du);
        circle.setRadius(2);
        circle.setCenterX(x+100);
        circle.setCenterY(100-y);
        switch (yans){
            case 1:
                circle.setFill(Color.BLACK);
                break;
            case 2:
                circle.setFill(Color.RED);
                break;
            case 3:
                circle.setFill(Color.GREEN);
                break;
        }
    }

    public static double qusuiji() {
        Random r = new Random();
        return r.nextDouble() * Math.TAU;
    }
}
