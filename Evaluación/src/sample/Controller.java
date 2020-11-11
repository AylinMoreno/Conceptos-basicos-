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


    public void insertar (ActionEvent event) {
        if (cont<4){
            //double x = Double.parseDouble(txtarreglo.getText());
            int nacimiento = Integer.parseInt(txtarreglo.getText());
            arreglo_nacimientos[cont] = nacimiento;
            cont++;

            imprimirArreglo(arreglo_nacimientos);
            double x = Double.parseDouble(txtarreglo.getText());
            String res = pepe.Por_nacimiento(x);
            pepes[1] = res;
            txtarreglo.setText("");
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Arreglo lleno");
            alert.show();

        }
        }
        public void procesar (ActionEvent event){
            double y= Double.parseDouble(txtarreglo.getText());
            lista.getItems().add("Pescado"+comboBox.getValue().toString()+ "  nacen" + y +  "  por cria"  + pepes[1] +  "  al año, perdida de peces"  );
            txtarreglo.setText(String.valueOf(""));
        }
    //pepes[1]+



    public void imprimirArreglo(int[] arr){
        for (int x=0; x<arr.length; x++){
            System.out.print(arr[x] + ",");
        }
        System.out.println("");
    }






}
