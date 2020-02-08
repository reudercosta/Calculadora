/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author reuder
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lblDisplay;
    private double valor1, valor2;
    private String operador;
    private boolean status = true;

    @FXML
    private void resultado(ActionEvent event) {

        Calculadora calc = new Calculadora();
        switch (operador) {
            case "+":
                lblDisplay.setText("" + calc.somar(valor1, valor2));
                break;
            case "-":
                lblDisplay.setText("" + calc.subtrair(valor1, valor2));
                break;
            case "x":
                lblDisplay.setText("" + calc.multiplicar(valor1, valor2));
                break;
            case "/":
                lblDisplay.setText("" + calc.dividir(valor1, valor2));
                break;
            default:
                lblDisplay.setText("Erro lógico!");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void reset(ActionEvent event){
    
        lblDisplay.setText("");
    }

    public void botaoPressionadoKey(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!"/".equals(value) && !"+".equals(value) && !"-".equals(value) && !"x".equals(value) && status == true) {
            lblDisplay.setText(lblDisplay.getText() + value);
            valor1 = Double.parseDouble(lblDisplay.getText());

        } else if (value.equals("+") || value.equals("-") || value.equals("/") || value.equals("x") && status==true) {
          
                lblDisplay.setText(value);
                operador = value;
                status = false;
                lblDisplay.setText("");

            
        } else if (!"/".equals(value) && !"+".equals(value) && !"-".equals(value) && !"x".equals(value) && status == false) {
            lblDisplay.setText(lblDisplay.getText() + value);
            valor2 = Double.parseDouble(lblDisplay.getText());

        }

    }

}
