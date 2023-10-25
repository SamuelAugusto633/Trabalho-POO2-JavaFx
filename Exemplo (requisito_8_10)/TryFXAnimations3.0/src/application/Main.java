package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		//Padrão
		try {
			
			//Criando um nó raiz (root node) baseado em nosso arquivo fxml
			//...getResource(heeereeee))nome do nosso arquivo fxml
			Parent root = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			
			Scene scene = new Scene(root, Color.BLACK);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
