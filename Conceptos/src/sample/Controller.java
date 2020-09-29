package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    @FXML TextField txtedad;
    @FXML Label lblTitulo;

    public void evento1(ActionEvent event){
        int dias= Integer.parseInt(txtedad.getText())*365;
        lblTitulo.setText("Vas vivido"  +dias+  "Dias");
    }
}
