package sample;

// si me pasara o que ? jijjiji

import Proyecto_Libreria.Pez;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
Pez pez = new Pez();
    @FXML TextField txtarreglo;
    @FXML ListView lista;
    @FXML ComboBox comboBox;
    int [] arreglo_nacimientos = new int[1];
    int cont = 0;
    String[][] arreglo_combo ={
            {"Trucha", "Pollo"}
    };
Pez pepe = new Pez();
String[] pepes=new  String[3];
    @FXML protected void initialize() {
        comboBox.getItems().addAll("Trucha" , "Pollos ");

    }


    public void procesar (ActionEvent event) {
        if (cont<4){
            double x = Double.parseDouble(txtarreglo.getText());
            int nacimiento = Integer.parseInt(txtarreglo.getText());
            arreglo_nacimientos[cont] = nacimiento;
            cont++;
            txtarreglo.setText("");
            imprimirArreglo(arreglo_nacimientos);
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Arreglo lleno");
            alert.show();
            double x = Double.parseDouble(txtarreglo.getText());
            String res = pepe.Por_nacimiento(x);
            pepes[1]= String.valueOf(comboBox.getValue().toString());


        }
        public void insertar (ActionEvent event){
            double y= Double.parseDouble(txtarreglo.getText());
            lista.getItems().add("Pescado"+ pepes[1]+"  nacen" + y +  "  por cria"  + pepes[1] +  "  al año, perdida de peces"  );
            txtarreglo.setText(String.valueOf(""));
        }
        }



    public void imprimirArreglo(int[] arr){
        for (int x=0; x<arr.length; x++){
            System.out.print(arr[x] + ",");
        }
        System.out.println("");
    }






}
