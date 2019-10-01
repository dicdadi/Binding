package dad.binding.dimensiones;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Dimensiones extends Application {

	private Label saludoLabel;
	private Label saludoLabel1;
	private Label saludoLabel2;

	@Override
	public void start(Stage primaryStage) throws Exception {

		saludoLabel = new Label();
		saludoLabel1 = new Label();
		saludoLabel2 = new Label();
		
		
		VBox root = new VBox(5, saludoLabel, saludoLabel1, saludoLabel2);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);

		Scene scene = new Scene(root, 320, 200);
		primaryStage.setTitle("Hola javaFX con bindings");
		saludoLabel.textProperty().bind(Bindings.concat("X: ", scene.widthProperty().asString("%.2f")));
		saludoLabel1.textProperty().bind(Bindings.concat("Y: ", scene.heightProperty().asString("%.2f")));
		saludoLabel2.textProperty().bind(Bindings.concat("Area: ", scene.widthProperty().multiply( scene.heightProperty() ).asString("%.2f") ));
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
