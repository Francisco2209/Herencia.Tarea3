/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

/**
 *
 * @author PC
 */
public class Gato extends Animales{
    private String Raza;
    private String Habla;
    private String Color;
    private int Edad; //La edad es en meses//

    public Gato() {
    }

    public Gato(String Raza, String Habla, String Color, int Edad) {
        this.Raza = Raza;
        this.Habla = Habla;
        this.Color = Color;
        this.Edad = Edad;
    }

    public Gato(String Raza, String Habla, String Color, int Edad, int NumDePatas, String Nombre, String Tipo) {
        super(NumDePatas, Nombre, Tipo);
        this.Raza = Raza;
        this.Habla = Habla;
        this.Color = Color;
        this.Edad = Edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getHabla() {
        return Habla;
    }

    public void setHabla(String Habla) {
        this.Habla = Habla;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Gato{" + "Raza=" + Raza + ", Habla=" + Habla + ", Color=" + Color + ", Edad=" + Edad + '}';
    }
    
    
    
    
    
    
}
