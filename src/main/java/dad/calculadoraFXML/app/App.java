package dad.calculadoraFXML.app;

import dad.calculadoraFXML.view.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller view = new Controller();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(view.getView());
		
		primaryStage.setTitle("CalculadoraFXML");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
