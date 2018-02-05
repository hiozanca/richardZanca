package com.company;

abstract public class AnimalDomestico {
    String nombre;
    String color;
    String raza;
    public AnimalDomestico(String nombre, String color, String raza){
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
    }
    abstract public void saludar();


}
