package dad.bindings.hola;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaApp extends Application {

	private TextField nombreText;
	private Label saludoLabel;
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		nombreText = new TextField();
		nombreText.setPromptText("Introduce un nombre");
		//nombreText.setMaxWidth(150); -> tamaño maximo del bloque text
		//nombreText.setPrefWidth(150); -> tamaño minimo del bloque text
		//nombreText.getPrefColumnCount(10); -> solo caben de caracteres del caracter mayor, que es la W mayuscula
		
		saludoLabel = new Label("-----");
		
		VBox root = new VBox(5,nombreText,saludoLabel);
		// Lo que hace es que el vbox no estire lo componentes, por ejemplo si no ponemos eso el TextField se se alargará al tamaño de la interface
		//Es como setMaxWidth para que ponga un maximo al texto
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		
		// establecemos el bindeo
		//StringProperty saludo = new SimpleStringProperty("¡Hola ");
		//saludoLabel.textProperty().bind(saludo.concat(nombreText.textProperty().concat(" !")));
		// Dos formas de concatenar un texto en un binding, este en este caso, muestra lo que agrega en el textField en el label al mismo tiempo
		// Se puede crear un StringPropery con una cadena de texto y luego utilizar el metodo concat al binding
		// Podemos concatenar un texto para que aparezca antes y después el texto que vaya apareciendo
		
		saludoLabel.textProperty().bind(Bindings.concat("¡Hola ",nombreText.textProperty(),"!"));
		
		Scene scene = new Scene(root,320,200);
		primaryStage.setTitle("Hola javaFX con bindings");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
