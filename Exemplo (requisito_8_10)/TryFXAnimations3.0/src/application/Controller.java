package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Controller implements Initializable{

	@FXML
	private ImageView myImage;
	//boolean flag=true;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//translate=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(myImage);
		translate.setDuration(Duration.millis(1000));//Seta a duração da animação de translate
		translate.setCycleCount(TranslateTransition.INDEFINITE);//quantas vezes isso vai acontecer (ex: 2 ou 3) neste caso é indefinido então não tem limite, acontecerá continuamente 
		translate.setByX(250); // até que ponto queremos mover nosso nó no eixo X
		translate.setByY(-100);
		translate.setAutoReverse(true);	
		translate.play();
		
		//rotate
		RotateTransition rotate = new RotateTransition();
		rotate.setNode(myImage);
		rotate.setDuration(Duration.millis(2000));
		rotate.setCycleCount(TranslateTransition.INDEFINITE);
		rotate.setInterpolator(Interpolator.LINEAR);
		rotate.setByAngle(360);
		//o mesmo que:
		//rotate.setByAngle(180);
		//rotate.setAutoReverse(true);
		rotate.setDelay(Duration.millis(1000));;//demora um pouco para começar
		rotate.setAxis(Rotate.Y_AXIS);//para mudar o eixo de rotação
		rotate.play();
		
		
		//fade
		//Padrão:
		FadeTransition fade = new FadeTransition();
		fade.setNode(myImage);
		fade.setDuration(Duration.millis(1500));
		fade.setCycleCount(FadeTransition.INDEFINITE);
		fade.setInterpolator(Interpolator.LINEAR);
		fade.setAutoReverse(true);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
		
		
		//scale
		//mudará as dimensões da sua imagem
		ScaleTransition scale = new ScaleTransition();
		scale.setNode(myImage);
		scale.setDuration(Duration.millis(1000));
		scale.setCycleCount(TranslateTransition.INDEFINITE);
		scale.setInterpolator(Interpolator.LINEAR);
		scale.setByX(0.5);
		scale.setByY(0.5);
		scale.setAutoReverse(true);
		scale.play();
		
		
		
		
	}
	

	
	
}
