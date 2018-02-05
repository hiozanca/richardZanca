package com.company;

public class Veterinario {
    AnimalDomestico animalDomestico;

    public Veterinario(AnimalDomestico animalDomestico){
        this.animalDomestico=animalDomestico;
    }
    public void curar(){
        if(this.animalDomestico instanceof Gato){
            System.out.println("se esta curando al gato");
        }else
            System.out.print("se esta curando al perro");
        this.animalDomestico.saludar();

    }
}
