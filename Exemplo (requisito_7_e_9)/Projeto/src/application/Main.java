package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;





public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			
			Parent p = FXMLLoader.load(getClass().getResource("/interfacegrafica/Empregado.fxml"));
			
			Scene cena = new Scene(p);
			
			primaryStage.setScene(cena);
			
			primaryStage.show();
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
