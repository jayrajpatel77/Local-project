package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//Main class
public class LunchMenu extends Application {

	@Override
	public void start(Stage stage) {
		double hotDog=2.0;
		double sandwich=1.0;
		double hamburger=1.5;
		double tea1=0.2;
		double coffee1=0.25;
		double pop1=0.45;

		
		ComboBox<String> comboBox = new ComboBox<String>();
		comboBox.getItems().addAll( "Select an Item              ", "Hot Dog", "Sandwich", "Hamburger");
		
		comboBox.getSelectionModel().select(0);

		
		RadioButton coffee = new RadioButton("Coffee");
		RadioButton tea = new RadioButton("Tea");
		RadioButton pop = new RadioButton("Pop");
		// heading of the drink panel
		Label drink = new Label("Drink");

		
		ToggleGroup t1 = new ToggleGroup();
		
		coffee.setToggleGroup(t1);
		tea.setToggleGroup(t1);
		pop.setToggleGroup(t1);

		
		VBox vbox = new VBox(5);
		
		vbox.setSpacing(20);
		
		vbox.setPadding(new Insets(5, 10, 20, 5.0));
		
		vbox.getChildren().addAll(drink, coffee, tea, pop);
		
		vbox.setStyle("-fx-border-radius: 0px; -fx-border-width: 2px; -fx-border-color: #053d12;");

		
		TextArea textArea = new TextArea();
		
		textArea.setText("Total is $0");
		textArea.setEditable(false);

		
		Button submit = new Button("Submit");
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(submit);

		
		BorderPane bPane = new BorderPane();
		
		bPane.setPrefSize(200, 150);

		
		bPane.setTop(comboBox);
		bPane.setLeft(vbox);
		bPane.setCenter(textArea);
		bPane.setBottom(hbox);

		
		Scene scene = new Scene(bPane);

		
		stage.setScene(scene);
	
		stage.setTitle("Lunch Menu");
		
		stage.show();

		
		submit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				double total = 0;
				
				
				
				if(comboBox.getValue()=="Hot Dog") {
					total+=hotDog;
				} else if(comboBox.getValue()=="sandwich") {
					total+=sandwich;
					
				}else if(comboBox.getValue()=="Hamburger") {
					total+=hamburger;
				}else
					total+=0;

				
				RadioButton selectedRadioButton = (RadioButton) t1.getSelectedToggle();
				String toogleGroupValue = selectedRadioButton.getText();
				switch (toogleGroupValue) {
				case "Coffee":
					total += coffee1;
					break;
				case "Tea":
					total += tea1;
					break;
				case "Pop":
					total += pop1;
					break;
				}

				
				textArea.setText("Total is $" + total);
			}
		});
	}


	public static void main(String[] args) {
		launch(args);
	}
}




