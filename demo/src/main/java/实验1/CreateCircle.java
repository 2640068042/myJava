package 实验1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class CreateCircle extends Application {
    @Override
    public void start(Stage primaryStage){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter circle1's center x-,y-coordinaes,and radius");
        double circle1x=input.nextDouble();
        double circle1y=input.nextDouble();
        double circle1Radius=input.nextDouble();
        System.out.println("Enter circle2's center x-,y-coordinaes,and radius");
        double circle2x=input.nextDouble();
        double circle2y=input.nextDouble();
        double circle2Radius=input.nextDouble();
        double distance=Math.sqrt((circle1x-circle2x)*(circle1x-circle2x)+(circle1y-circle2y)*(circle1y-circle2y));
        if(distance>(circle1Radius+circle2Radius ))
        {
            System.out.println("两个圆相离");
        }
        else if(distance<Math.abs(circle1Radius-circle2Radius ))
        {
            System.out.println("一个圆在另一个圆中");
        }
        else
        {
            System.out.println("两圆相交");
        }

        Pane pane=new Pane();
        Circle circle1=new Circle();
        circle1.setCenterX(circle1x);
        circle1.setCenterY(circle1y);//circle1图形
        circle1.setRadius(circle1Radius);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.WHITE);
        pane.getChildren().add(circle1);

        Circle circle=new Circle();
        circle.setCenterX(circle1x);
        circle.setCenterY( circle1y);//circle1的圆心
        circle.setRadius(2);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLACK);
        pane.getChildren().add(circle);


        Circle circle2=new Circle();
        circle2.setCenterX(circle2x);
        circle2.setCenterY(circle2y);//circle2图形
        circle2.setRadius(circle2Radius);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.WHITE);
        pane.getChildren().add(circle2);

        Circle circle3=new Circle();
        circle3.setCenterX(circle2x);
        circle3.setCenterY(circle2y);
        circle3.setRadius(2);//circle2圆心
        circle3.setStroke(Color.BLACK);
        circle3.setFill(Color.BLACK);
        pane.getChildren().add(circle3);

        Line line1=new Line(circle1x,circle1y,circle2x,circle2y);
        pane.getChildren().add(line1);

        Scene scene=new Scene(pane,400,400);
        primaryStage.setTitle("show circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
