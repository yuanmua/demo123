package com.example.demo123;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Circle circle=new Circle();
        circle.setRadius(40);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        Pane pane=new Pane();
        pane.getChildren().add(circle);

        int r =40;
        Dian dian1 =new Dian(r,1);
        Dian dian2 =new Dian(r,2);
        Dian dian3 =new Dian(r,3);
        pane.getChildren().add(dian1.circle);
        pane.getChildren().add(dian2.circle);
        pane.getChildren().add(dian3.circle);

        Scene scene=new Scene(pane,200,200);

        stage.setScene(scene);
        stage.setTitle("我是窗口");
        stage.show();

        print_angle(dian1,dian2,dian3);
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("开始");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("结束");
    }
    public static boolean print_angle(Dian d1, Dian d2,Dian d3) {
        double a = Math.sqrt(Math.pow(d2.x - d3.x,2)+Math.pow(d2.y - d3.y,2));
        double b = Math.sqrt(Math.pow(d1.x - d3.x,2)+Math.pow(d1.y - d3.y,2));
        double c = Math.sqrt(Math.pow(d1.x - d2.x,2)+Math.pow(d1.y - d2.y,2));
        double casa = (Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c);
        double casb = (Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/(2*a*c);
        double casc = (Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b);
        System.out.println(Math.acos(casa) / Math.PI * 180+"°");
        System.out.println(Math.acos(casb) / Math.PI * 180+"°");
        System.out.println(Math.acos(casc) / Math.PI * 180+"°");
        return true;
    }
}
