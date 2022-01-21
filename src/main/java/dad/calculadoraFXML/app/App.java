package dad.calculadoraFXML.app;

import dad.calculadoraFXML.view.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

	private Controller view = new Controller();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(view.getRoot());
		
		primaryStage.setTitle("CalculadoraFXML");
		primaryStage.getIcons().add(new Image(getClass().getResource("/img/calculator-32x32.png").toExternalForm()));
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
