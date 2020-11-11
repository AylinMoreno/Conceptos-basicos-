package Proyecto_Libreria;
//si me pasa le picho un cafe:)
public class Pez {
    public String Por_Nombre;
    public String Por_nacimiento;

    public String getPor_Nombre() {
        return Por_Nombre;
    }

    public void setPor_Nombre(String por_Nombre) {
        Por_Nombre = por_Nombre;
    }

    public String getPor_nacimiento() {
        return Por_nacimiento;
    }

    public void setPor_nacimiento(String por_nacimiento) {
        Por_nacimiento = por_nacimiento;
    }

    public Pez(String por_Nombre, String por_nacimiento) {
        Por_Nombre = por_Nombre;
        Por_nacimiento = por_nacimiento;
    }
    public Pez(){

    }
    public String Por_nacimiento(double numer){
        double cant=2;
        numer= numer- cant;
        return  numer+"";
    }
    public  String Por_Nombre(String name){
        return name;
    }
}
