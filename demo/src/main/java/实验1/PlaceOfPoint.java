package 实验1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

import java.util.Scanner;

public class PlaceOfPoint extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three points for p0,p1,and p2");
        double p0x=input.nextDouble();
        double p0y=input.nextDouble();
        double p1x=input.nextDouble();
        double p1y=input.nextDouble();
        double p2x=input.nextDouble();
        double p2y=input.nextDouble();
        double number=((p1x-p0x)*(p2y-p0y)-(p2x-p0x)*p1y-p0y);
        if(number>0)
        {
            System.out.println("p2位于线段左侧");
        }
        else if (number==0)
        {
            System.out.println("p2位于线段上");
        }
        else
        {
            System.out.println("p2位于线段右侧");
        }
        Line line=new Line(p0x,p0y,p1x,p1y);
        Pane pane=new Pane();
        pane.getChildren().add(line);
        primaryStage.setTitle("show line");
        Scene scene=new Scene(pane,400,400);
        Circle circle=new Circle();
        circle.setCenterX(p2x);
        circle.setCenterY(p2y);//circle1的圆心
        circle.setRadius(1);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLACK);
        pane.getChildren().add(circle);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
