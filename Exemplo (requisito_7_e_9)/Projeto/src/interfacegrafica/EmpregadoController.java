package interfacegrafica;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class EmpregadoController {
	
	
	@FXML
	private TextField txtNome;
	@FXML	
	private TextField txtSalHora;
	@FXML	
	private TextField txtHorasTrab;
	@FXML	
	private Button btnCalcular;
	@FXML	
	private Button Limpar;
	@FXML	
	private Label lblResultado;
	
	
	@FXML	
	private RadioButton rdoManha;
	@FXML	
	private RadioButton rdotarde;
	@FXML	
	private RadioButton rdonoite;
	
	@FXML	
	private RadioButton btnalert;
	
	

	
	public void onBtnCalcularClick() {
		
		String nome;
		double salHora;
		double horasTrab;
		double salario;
		String formataSalario;
		double aumento = 0;
		
		
		if (rdoManha.isSelected())
			aumento = 10;
		if (rdotarde.isSelected())
			aumento = 20;
		if (rdonoite.isSelected())
			aumento = 50;
		
		
		nome = txtNome.getText();
		salHora = Double.parseDouble(txtSalHora.getText());
		horasTrab = Double.parseDouble(txtHorasTrab.getText());
		
		
		salario = (salHora*horasTrab)+aumento;
		formataSalario = String.format("%.2f",salario);
		
		
		lblResultado.setText("Fucionario " + nome  + " seu salario é = R$" + formataSalario);
		
		
		if (salario < 300)
			abrirAlerta();
		
	}
	
	
	public void btnLimparClick() {
		txtNome.setText(" ");
		txtSalHora.setText(" ");
		txtHorasTrab.setText(" ");
		lblResultado.setText(" ");
		btnCalcular.setDisable(true);
		Limpar.setDisable(true);
	}
	
	
	public void LipaTextos() {
		boolean calcular;
		boolean limpar;
		
		calcular= (txtSalHora.getText().isEmpty() || txtHorasTrab.getText().isEmpty()); 
		btnCalcular.setDisable(calcular);
		
		
		limpar= (txtSalHora.getText().isEmpty() && txtHorasTrab.getText().isEmpty() && txtNome.getText().isEmpty()); 
		Limpar.setDisable(limpar);
		
	}
	
	
	public void abrirAlerta() {
		Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
	    dialogoInfo.setTitle("Atenção!");
	    dialogoInfo.setHeaderText("Ocorreu um erro na execução do sistema");
	    dialogoInfo.setContentText("O valor do seu salário está significativamente abaixo das expectativas. Por favor, entre em contato com seu supervisor para discutir esta questão.");
	    dialogoInfo.showAndWait();
	}
	
	
	
	
	
	
	
	
	

}
