import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Calculatorlab extends Application {
   public void start(Stage stage) {
	   
	   FlowPane pane =new FlowPane();
      //Creating a Label
      Label label1 = new Label("First Operand");
      Label label2= new Label("Second Operand");
      Label label3 =new Label("result");
      TextField t1= new TextField();
      TextField t2 = new TextField();
      TextField t3 =new TextField();
      
      
      
      t1.setTranslateX(300);
      t1.setTranslateY(25);
      
      t2.setTranslateX(300);
      t2.setTranslateY(55);
      
      t1.setTranslateX(300);
      t1.setTranslateY(85);
      
      HBox hBox = new HBox(5);
      Button addButton = new Button("Add");
      Button subtractButton = new Button("Subtract");
     

    
      
      label1.setTranslateX(150);
      label1.setTranslateY(25);

      label2.setTranslateX(150);
      label2.setTranslateY(55);
      
      label1.setTranslateX(150);
      label1.setTranslateY(85);
      Group root = new Group();
      root.getChildren().addAll(label1,label2,t1,t2,t3,label3);
      
      BorderPane borderPane = new BorderPane();
      borderPane.setCenter(pane);
      borderPane.setBottom(hBox);
      BorderPane.setAlignment(hBox, Pos.TOP_CENTER);
      //Setting the stage
      Scene scene = new Scene(root, 595, 150);
      stage.setTitle("Label Example");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String args[]){
      launch(args);
   }
   private boolean checkFields(TextField t1, TextField t2) {
       return !t1.getText().isEmpty() && !t1.getText().isEmpty();
   }
}