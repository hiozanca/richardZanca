package com.company;

public class Perro extends AnimalDomestico{


    public Perro(String nombre, String color, String raza){
        super(nombre, color, raza);

    }
    public void saludar(){
        System.out.print("guau");
    }
}
