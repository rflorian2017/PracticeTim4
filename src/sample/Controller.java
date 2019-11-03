package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import transformation.model.Binary;
import transformation.model.Decimal;

public class Controller {
    private int counter;
    int a = 0;
    int b = 0;
    public TextField txtFieldCommand;
    public TextArea txtAreaResult;
    public CheckBox chkBoxBinary;

    public void initialize() {
        counter = 0;
    }

    public void buttonClicked(ActionEvent actionEvent) {
//        if(counter == 0) {
//            a = Integer.parseInt(txtFieldCommand.getText());
//            counter ++;
//            txtFieldCommand.clear();
//        }
//        else if(counter == 1) {
//            b = Integer.parseInt(txtFieldCommand.getText());
//            counter ++;
//            txtFieldCommand.clear();
//        }
//
//        if(counter == 2) {
//            txtAreaResult.setText((a + b) + "") ;
//            counter = 0;
//        }

        if(chkBoxBinary.isSelected()) {
            Decimal number = new Decimal(txtFieldCommand.getText());

            txtAreaResult.setText(number.convertToBinary());
        }
        else {
            Binary number = new Binary(txtFieldCommand.getText());

            txtAreaResult.setText(number.convertToDecimal());
        }
        txtFieldCommand.clear();



    }
}
