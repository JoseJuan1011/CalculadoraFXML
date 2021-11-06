package dad.calculadoraFXML.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.calculadoraFXML.resources.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	@FXML
	private Button borrar;

	@FXML
	private Button borrarTodo;

	@FXML
	private Button decimalNum;

	@FXML
	private Button divisiónButton;

	@FXML
	private Button igualButton;

	@FXML
	private Button multiplicacionButton;

	@FXML
	private Button num0;

	@FXML
	private Button num1;

	@FXML
	private Button num2;

	@FXML
	private Button num3;

	@FXML
	private Button num4;

	@FXML
	private Button num5;

	@FXML
	private Button num6;

	@FXML
	private Button num7;

	@FXML
	private Button num8;

	@FXML
	private Button num9;

	@FXML
	private TextField pantallaTextField;

	@FXML
	private Button restaButton;

	@FXML
	private Button sumaButton;

	@FXML
	private GridPane view;

	private Calculadora calculadora;
	
	public Controller() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Calculadora.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialize(URL location, ResourceBundle resources) {
		calculadora = new Calculadora();
	}

	@FXML
	void on0Action(ActionEvent event) {
		calculadora.insertar('0');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void on1Action(ActionEvent event) {
		calculadora.insertar('1');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void on2Action(ActionEvent event) {
		calculadora.insertar('2');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void on3Action(ActionEvent event) {
		calculadora.insertar('3');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void on4Action(ActionEvent event) {
		calculadora.insertar('4');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void on5Action(ActionEvent event) {
		calculadora.insertar('5');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void on6Action(ActionEvent event) {
		calculadora.insertar('6');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void on7Action(ActionEvent event) {
		calculadora.insertar('7');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void on8Action(ActionEvent event) {
		calculadora.insertar('8');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void on9Action(ActionEvent event) {
		calculadora.insertar('9');
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void onBorrarAction(ActionEvent event) {
		calculadora.borrar();
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void onBorrarTodoAction(ActionEvent event) {
		calculadora.borrarTodo();
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void onDecimalAction(ActionEvent event) {
		calculadora.insertarComa();
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void onDividirAction(ActionEvent event) {
		calculadora.operar(Calculadora.DIVIDIR);
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void onEqualAction(ActionEvent event) {
		calculadora.operar(Calculadora.IGUAL);
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void onMultiplicarAction(ActionEvent event) {
		calculadora.operar(Calculadora.MULTIPLICAR);
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void onRestarAction(ActionEvent event) {
		calculadora.operar(Calculadora.RESTAR);
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	@FXML
	void onSumaAction(ActionEvent event) {
		calculadora.operar(Calculadora.SUMAR);
		getPantallaTextField().setText(calculadora.getPantalla());
	}

	public TextField getPantallaTextField() {
		return pantallaTextField;
	}

	public GridPane getView() {
		return view;
	}

	public Calculadora getCalculadora() {
		return calculadora;
	}
}
