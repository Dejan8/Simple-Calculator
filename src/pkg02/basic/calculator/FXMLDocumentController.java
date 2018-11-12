/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.basic.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Dejan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private TextField textAreaResult;

    private double number1 = 0;
    private String operator = "";
    private boolean start = true;
    private final Numbers model = new Numbers();

    @FXML
    private Button buttonC;

    @FXML
    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }

    @FXML
    private void processNumbers(MouseEvent event) {
        if (start) {
            textAreaResult.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        textAreaResult.setText(textAreaResult.getText() + value);

    }

    @FXML
    private void processOperators(MouseEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!value.equals("=")) {
            if (!operator.isEmpty()) {
                return;
            }

            operator = value;
            number1 = Double.parseDouble(textAreaResult.getText());
            textAreaResult.setText("");
        } else {
            if (operator.isEmpty()) {
                return;
            }
            double number2 = Double.parseDouble(textAreaResult.getText());
            double output = model.calculate(number1, number2, operator);
            textAreaResult.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }

    @FXML
    private void processNumbersClear(MouseEvent event) {
        textAreaResult.setText("Unesi broj");
        number1 = 0;
        operator = "";
        start = true;
    }

}
