package pl.ptemich.j8tutorials.fx2;

import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AlfabetMaksia extends Application {

  
  private Text letterToDraw = new Text(200, 200, "A");
  
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    letterToDraw.setFill(Color.RED);
    letterToDraw.setFont(Font.font("Verdana", 72));
    
    Group root = new Group();
    Scene scene = new Scene(root, 500, 500, Color.BLACK);
    stage.setTitle("JavaFX Scene Graph Demo");
    stage.setScene(scene);
    
    
    
    root.getChildren().add(letterToDraw);
    
    scene.setOnKeyPressed(evt -> { letterToDraw.setText(evt.getCode().getName()); });
    
    
    
//    Rectangle r = new Rectangle(25, 25, 250, 250);
//    r.setFill(Color.BLUE);
//    root.getChildren().add(r);
//
//    TranslateTransition translate = new TranslateTransition(
//        Duration.millis(750));
//    translate.setToX(390);
//    translate.setToY(390);
//
//    FillTransition fill = new FillTransition(Duration.millis(750));
//    fill.setToValue(Color.RED);
//
//    RotateTransition rotate = new RotateTransition(Duration.millis(750));
//    rotate.setToAngle(360);
//
//    ScaleTransition scale = new ScaleTransition(Duration.millis(750));
//    scale.setToX(0.1);
//    scale.setToY(0.1);
//
//    ParallelTransition transition = new ParallelTransition(r, translate, fill,
//        rotate, scale);
//    transition.setCycleCount(Timeline.INDEFINITE);
//    transition.setAutoReverse(true);
//    transition.play();

    stage.show();
  }

}
