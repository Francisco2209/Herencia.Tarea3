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
public class Perro extends Animales {
    private String Raza;
    private String Habla;
    private String Color;
    private int edad; //La edad es en meses//

    public Perro() {
    }

    public Perro(String Raza, String Habla, String Color, int edad) {
        this.Raza = Raza;
        this.Habla = Habla;
        this.Color = Color;
        this.edad = edad;
    }

    public Perro(String Raza, String Habla, String Color, int edad, int NumDePatas, String Nombre, String Tipo) {
        super(NumDePatas, Nombre, Tipo);
        this.Raza = Raza;
        this.Habla = Habla;
        this.Color = Color;
        this.edad = edad;
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
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + Raza + ", Habla=" + Habla + ", Color=" + Color + ", edad=" + edad + '}';
    }
    
    
            
    
}
