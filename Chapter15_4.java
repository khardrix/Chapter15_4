/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                          Chapter 15: Problem 4                                            *****
 *****___________________________________________________________________________________________________________*****
 *****                          4.  Create a Circle or Rectangle or Ellipse object.                              *****
 *****                                Use it as a path for a two PathTransitions                                 *****
 *****             (that is, use the one object as the path for two different PathTransition objects).           *****
 *****                      Create two smaller objects to act as Nodes to move on the path.                      *****
 *****             Each PathTransition object will use the same path but different object for its node.          *****
 *****    To demonstrate that this is working clearly, set each PathTransition object to a different duration,   *****
 *****                                          such as 1000 and 2000.                                           *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.*;


public class Chapter15_4 extends Application {


    public static void main(String[] args) {

        launch(args);
    }


    public void start(Stage primaryStage) {

        // Create the Pane
        Pane pane = new Pane();

        // Create the Rectangle for the Circles to travel around as a Path,
            // Set the border to black and the Fill to white
        Rectangle rectangle = new Rectangle(75,75,350,350);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);

        // Create the Circle objects and set one Color to purple and the other Color to pink
        Circle circle1 = new Circle(75,75,50);
        Circle circle2 = new Circle(425,425,50);
        circle1.setFill(Color.rgb(255, 0, 255, 1.0));
        circle2.setFill(Color.PINK);

        // Add the Circles to the Pane
        pane.getChildren().addAll(rectangle, circle1, circle2);

        // Create the two PathTransition objects
        PathTransition pt1 = new PathTransition();
        PathTransition pt2 = new PathTransition();

        // Set the Duration (speed) of the PathTransition objects
        pt1.setDuration(Duration.millis(1000));
        pt2.setDuration(Duration.millis(2000));

        // Set the Circles as Nodes
        pt1.setNode(circle1);
        pt2.setNode(circle2);

        // Set the path of the Circle PathTransition objects
        pt1.setPath(rectangle);
        pt2.setPath(rectangle);

        // Set the Duration of the animation to INDEFINITE (play forever until the program is ended)
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt2.setCycleCount(Timeline.INDEFINITE);

        // Set AutoReverse to False, so the PathTransition objects stay going in the same direction
        pt1.setAutoReverse(false);
        pt2.setAutoReverse(false);

        // Start (play) both PathTransition objects
        pt1.play();
        pt2.play();

        // Create the Scene with the Pane, Set the Title of the Stage, Set the Scene to the Stage, Show the Stage
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Chapter 15, Problem 4: Multiple PathTransition Objects");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
