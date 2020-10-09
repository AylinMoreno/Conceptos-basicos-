package Formulas;

import Converciones.Convercion;

public class Main {
    public static void main(String[] args) {
        Convercion convercion= new Convercion();
        String res;
        res = convercion.binario(2);
        System.out.println(res);
        res= convercion.hex(16);

    }
}
