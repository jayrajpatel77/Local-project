

  import java.awt.Polygon;

import javafx.application.Application;
  import javafx.scene.Group;
  import javafx.scene.Scene;
  import javafx.stage.Stage;
  import javafx.scene.paint.Color;
  import javafx.scene.shape.Arc;
  import javafx.scene.shape.ArcType;
  import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

public class SmileyFace extends Application {
	
	public void start(Stage stage) {
		Circle circle = new Circle();
		circle.setCenterX(250.0);
		circle.setCenterY(150.0);
		circle.setRadius(150.0);
		circle.setFill(Color.TRANSPARENT);
		circle.setStroke(Color.BLACK);
		
		Circle lefteyecircle = new Circle();
		lefteyecircle.setCenterX(190.0);
		lefteyecircle.setCenterY(120.0);
		lefteyecircle.setRadius(20.0);
		lefteyecircle.setFill(Color.BLACK);
		lefteyecircle.setStroke(Color.BLACK);
		
		Circle righteyecircle = new Circle();
		righteyecircle.setCenterX(310.0);
		righteyecircle.setCenterY(120.0);
		righteyecircle.setRadius(20.0);
		righteyecircle.setFill(Color.BLACK);
		righteyecircle.setStroke(Color.BLACK);
		
		Ellipse lefteyeEllipse = new Ellipse(190,120,35,30);
		lefteyeEllipse.setStroke(Color.BLACK);
		lefteyeEllipse.setFill(Color.TRANSPARENT);
		
		Ellipse righteyeEllipse = new Ellipse(310,120,35,30);
		righteyeEllipse.setStroke(Color.BLACK);
		righteyeEllipse.setFill(Color.TRANSPARENT);
		
		Arc mouth = new Arc(250,160,100,90,-140,100);
		mouth.setStroke(Color.BLACK);
		mouth.setFill(Color.TRANSPARENT);
		
		
		
		
		Group root= new Group(circle,righteyecircle,lefteyecircle,lefteyeEllipse,righteyeEllipse,mouth );
		Scene s = new Scene(root, 600,300);
		stage.setTitle("Smiley face");
		stage.setScene(s);
		stage.show();
		
		
	}
	public static void main(String args[]) {
		launch(args);
	}


}