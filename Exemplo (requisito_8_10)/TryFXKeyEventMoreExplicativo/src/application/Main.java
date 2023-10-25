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
		try {
			//Instancia de um objeto carregador usando nosso arquivo fxml
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/View.fxml"));
			//Criando um nó raiz (root node) baseado em nosso arquivo fxml
			//...getResource(nomeaqui))nome do nosso arquivo fxml
			Parent root = loader.load();	
			Controller controller = loader.getController();
			Scene scene = new Scene(root, Color.BLACK);		
			
			
			//Agora adicionaremos um manipulador de eventos anônimo para o evento de tecla pressionada (OnKeyPressed) do objeto Scene
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
				//new EventHandler<KeyEvent>() {  classe anônima que implementa a interface EventHandler<KeyEvent>. A interface EventHandler é usada para lidar com eventos em JavaFX

				@Override
				public void handle(KeyEvent event) {
					//System.out.println(event.getCode());
					switch(event.getCode()) {
					case W:
						controller.moveUp();
						break;
					case S:
						controller.moveDown();
						break;
					case A:
						controller.moveLeft();
						break;
					case D:
						controller.moveRight();
						break;
					default:
						break;
					}
				}
			});
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// inicializa a plataforma JavaFX, que é essencial para a execução de aplicativos gráficos JavaFX.
		launch(args);
	}

}
