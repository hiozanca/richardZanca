package com.company;

public class Main {
    public static void main(String[] args){
        Gato g;
        Perro p;
        Veterinario vet;
        g = new Gato("tom", "negro","persa");
        g.saludar();
        p = new Perro("lucas","blanco","golden");
        p.saludar();
        vet = new Veterinario(g);
        vet.curar();


    }
}
