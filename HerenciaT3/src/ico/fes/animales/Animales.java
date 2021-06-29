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
public class Animales {
    private int NumDePatas;
    private String Nombre; //Nombre que se le quiere dar al grupo de animales segun su uso//
    private String Tipo; //subgrupo segun su clasificación anfibios, mamiferos, aves, etc//

    public Animales() {
    }

    public Animales(int NumDePatas, String Nombre, String Tipo) {
        this.NumDePatas = NumDePatas;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }

    public int getNumDePatas() {
        return NumDePatas;
    }

    public void setNumDePatas(int NumDePatas) {
        this.NumDePatas = NumDePatas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Animales{" + "NumDePatas=" + NumDePatas + ", Nombre=" + Nombre + ", Tipo=" + Tipo + '}';
    }
    
    
    
    
}
