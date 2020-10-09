package sample;

import Converciones.Convercion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    @FXML TextField txtedad;
    @FXML Label lblTitulo;


    public void evento1(ActionEvent event){
        Convercion td=new Convercion();

        int numero= Integer.parseInt(txtedad.getText());
        String res= td.binario(numero);
        lblTitulo.setText(res);
    }
} ///la ultima
