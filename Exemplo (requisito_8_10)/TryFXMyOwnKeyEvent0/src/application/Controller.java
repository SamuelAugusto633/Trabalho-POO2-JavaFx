package application;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	
	@FXML
	
	ImageView myImageView;
	Image myImage = new Image(getClass().getResourceAsStream("ScarletWitch.png"));
	double currentY;
	double currentX;
	
	public void moveUp() {
		System.out.println("MOVIN' UP!");
		currentY = myImageView.getLayoutY();
	    myImageView.setLayoutY(currentY - 10); // Move a imagem 10 unidades para cima
	
	}
	public void moveDown() {
		System.out.println("MOVIN' DOWN!");
		currentY = myImageView.getLayoutY();
		myImageView.setLayoutY(currentY + 10); // Move a imagem 10 unidades para baixo
	}
	public void moveLeft() {
		System.out.println("MOVIN' LEFT!");
		currentX = myImageView.getLayoutX();
	    myImageView.setLayoutX(currentX - 10); // Move a imagem 10 unidades para a esquerda
	}
	public void moveRight() {
		System.out.println("MOVIN' RIGHT!");
		currentX = myImageView.getLayoutX();
	    myImageView.setLayoutX(currentX + 10); // Move a imagem 10 unidades para a direita
	    //myImageView.setImage(myImage);
	}
	
	
	
	
	
	
	
}
