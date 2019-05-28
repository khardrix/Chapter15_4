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
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.*;


public class Chapter15_4 extends Application {

    // INSTANCE VARIABLE(s) declaration(s)
    private Timeline animation;

    public static void main(String[] args) {

        launch(args);
    }


    public void start(Stage primaryStage) {

        // Create the Pane
        Pane pane = new Pane();

        // Create the Circle object and set its Color to purple (255[red], 0[green], 255[blue], 100% Opacity)
        Circle circle = new Circle(250, 250, 50);
        circle.setFill(Color.rgb(255, 0, 255, 1.0));

        // Create the two PathTransition objects
        PathTransition pt1 = new PathTransition();
        PathTransition pt2 = new PathTransition();
    }


    public void play(){

        animation.play();
    }
}
